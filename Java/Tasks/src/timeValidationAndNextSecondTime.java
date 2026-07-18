import java.util.Scanner;

public class timeValidationAndNextSecondTime {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Time Validation and Guessing Next Time Task");
        int hours;
        int minutes;
        int seconds;
        boolean validTime = true;

        System.out.print("Enter Hour: ");
        hours = scanner.nextInt();
        System.out.print("Enter Minutes: ");
        minutes = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Seconds: ");
        seconds = scanner.nextInt();

        //System.out.printf("Time = %s:%s:%s",hours,minutes,seconds);
        if(hours<0 || hours > 23){
            validTime = false;
        }
        else if(minutes < 0 || minutes >59){
            validTime = false;
        }
        else if(seconds < 0 || seconds >59){
            validTime = false;
        }
        else{
            if(hours==23 && minutes==59 && seconds==59){
                hours =00;
                minutes = 00;
                seconds =00;
            }
            else if(seconds<59){
                seconds++;
            }
            else if(minutes==59 && seconds==59){
                hours++;
                minutes=00;
                seconds=00;
            }
            else{
                minutes++;
                seconds=00;
            }
        }
        if(validTime) {
            System.out.printf("New Time = %s:%s:%s\n", hours, minutes, seconds);
        }
        else{
            System.out.println("INVALID time");
        }
    }
}
