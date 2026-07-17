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

        System.out.printf("Time = %s:%s:%s",hours,minutes,seconds);
    }
}
