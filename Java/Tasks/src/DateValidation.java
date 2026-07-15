import java.util.Scanner;

public class DateValidation {
    public static void main(String[] args){
        System.out.println("Welcome to Date Validation Program");
        int day;
        int month;
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Day: ");
        day = scanner.nextInt();
        System.out.print("Enter Month: ");
        month = scanner.nextInt();
        System.out.print("Enter Year: ");
        year = scanner.nextInt();

        if(day>=1 && day<=31)
        //System.out.printf("Date : %d:%d:%d",day,month,year);


    }
}