

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime=null;

        Scanner scanner=new Scanner(System.in);
        while(localTime==null) {
            try{
                System.out.print("Enter time for Alarm setting: ");
                String time = scanner.nextLine();
                localTime = LocalTime.parse(time, formatter);
                System.out.println("Alarm set for : " + localTime);
            } catch (DateTimeParseException e) {
                System.out.println("INVALID format. Please use 'HH:mm:ss'");
            }
        }
        scanner.close();

    }
}