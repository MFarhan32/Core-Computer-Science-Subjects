import java.util.Scanner;

public class dateValidationAndNextDate {
    public static void main (String[] args){

        System.out.println("Welcome to Date Validation and Guessing Next Date Program");
        int day;
        int month;
        int year;
        boolean validDate = true;
        boolean leapYear = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Day: ");
        day = scanner.nextInt();
        System.out.print("Enter Month: ");
        month = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Year: ");
        year = scanner.nextInt();

        if(year%400==0 || (year %4== 0 && year%100 != 0)){
            leapYear = true;
        }
        if(day<1 || day>31){
            validDate = false;
        } else if (month<1 || month >12) {
            validDate = false;
        } else if (year<1000 || year>9999) {
            validDate = false;
        }
        else{
            if(month == 2){
                if(year % 400==0 || (year % 4== 0 && year % 100 != 0)){
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
        }
        System.out.println("-----------------------");
        if(validDate){

            //logic for guessing right date
            if(day==31 && month ==12){
                day=1;
                month =1;
                year++;
            }
            else if(month ==1 || month ==3 || month ==5 ||month ==7 || month ==8 || month ==10 || month ==12 ){
                if(day<31){
                    day++;
                }
                else{
                    day=1;
                    month++;
                }
            } else if (month ==2) {
                if(leapYear){
                    if(day<29){
                        day++;
                    }
                    else{
                        day= 1;
                        month++;
                    }
                }
                else{
                    if(day<28){
                        day++;
                    }
                    else{
                        day =1;
                        month++;
                    }
                }
            }

            else{
                if(day<30){
                    day++;
                }
                else{
                    day =1;
                    month++;
                }
            }
            System.out.printf("Date is VALID. Next Date is : %s:%s:%s .",day,month,year);
        }
        else{
            System.out.println("You entered INVALID date.");
        }
        scanner.close();


    }
}
