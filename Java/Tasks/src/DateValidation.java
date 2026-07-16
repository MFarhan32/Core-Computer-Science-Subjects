import java.util.Scanner;

public class DateValidation {
    public static void main(String[] args){
        System.out.println("Welcome to Date Validation Program");
        int day;
        int month;
        int year;
        boolean validDate = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Day: ");
        day = scanner.nextInt();
        System.out.print("Enter Month: ");
        month = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Year: ");
        year = scanner.nextInt();

        if(day<1 || day>31){
            validDate = false;
        } else if (month<1 || month >12) {
            validDate = false;
        } else if (year<1000 || year>9999) {
            validDate = false;
        }
        else{
            if(month == 2){
                if(year%400==0 || (year %4== 0 && year%100 != 0)){
                    if(day>29){
                        validDate = false;
                    }
                }
                else{
                    if(day>28){
                        validDate = false;
                    }
                }
            }
            else if (month == 4  || month == 6  || month == 9  || month == 11){
                if(day>30){
                    validDate = false;
                }
            }
            else{
                validDate = true;
            }
        }
        System.out.println("-----------------------");
        if(validDate){
            System.out.printf("%d:%d:%s = VALID DATE",day,month,year);
        }
        else{
            System.out.printf("%d:%d:%s = INVALID DATE",day,month,year);
        }
        scanner.close();
    }
}