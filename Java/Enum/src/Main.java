import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Day day=Day.SATURDAY;
//        System.out.println(day);
//
//        switch (day){
//            case MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY -> System.out.println(day+ " is the weekday.");
//            case SATURDAY,SUNDAY -> System.out.println(day+ " is the weekend.");
//            default -> System.out.println("Not a valid weekday");
//        }

        try( Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a day: ");
            String response = scanner.nextLine().toUpperCase();
            Day day = Day.valueOf(response);

            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY -> System.out.println(day + " is the weekday.");
                case SATURDAY, SUNDAY -> System.out.println(day + " is the weekend.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Not a valid day.");
        }
    }
}