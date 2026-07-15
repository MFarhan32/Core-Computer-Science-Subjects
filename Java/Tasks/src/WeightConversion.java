import java.util.Scanner;
public class WeightConversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int option;
        double weight;
        double result;
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option (1 or 2):");
        option = input.nextInt();

        if(option == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = input.nextDouble();
            result = weight/2.20462;
            System.out.printf("The new weight in kgs is : %.2f kgs",result );
        }
        else if(option == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = input.nextDouble();
            result = weight*2.20462;
            System.out.printf("The new weight in lbs is : %.2f lbs",result );
        }
        else{
            System.out.println("Sorry, You entered wrong choice.");
        }

        input.close();
    }
}