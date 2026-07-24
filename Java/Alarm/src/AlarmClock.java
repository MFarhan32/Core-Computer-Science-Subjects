
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime,String filePath,Scanner scanner){
        this.alarmTime = alarmTime;
        this.filePath= filePath;
        this.scanner=scanner;
    }


    @Override
    public void run(){
        try{
           while (LocalTime.now().isBefore(alarmTime)){
               Thread.sleep(1000);
               LocalTime now = LocalTime.now();

               System.out.printf("\r%02d:%02d:%02d",
                                        now.getHour(),
                                        now.getMinute(),
                                        now.getSecond());
           }
        }
        catch (InterruptedException e){
            System.out.println("Interrupted Exception.");
        }
        System.out.println("\nAlarm *Noises*");

        File audioFile = new File(filePath);
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip =AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
            System.out.print("Press *Enter* to stop the alarm: ");
            scanner.nextLine();
            clip.close();

            scanner.close();
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("File Unsupported.");
        }
        catch(IOException e){
            System.out.println("File not available.");
        }
        catch(LineUnavailableException e){
            System.out.println("Line not available.");
        }

    }
}
