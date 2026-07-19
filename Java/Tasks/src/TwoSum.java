import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        int[] numbers = {2,4,5,3,8};
        int target;
        boolean matchTarget = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of Target: ");
        target = scanner.nextInt();
        for(int i=0;i<numbers.length-1;i++){
            for (int j=1;j<numbers.length;j++){
                if (numbers[i] + numbers[j]==target){
                    System.out.println("The sum of "+ numbers[i]+ " and "+numbers[j]+" is " + target );
                    matchTarget = true;
                    break;
                }
            }
        }
        if(!matchTarget){
            System.out.println("Target not found.");
        }
        scanner.close();
    }
}
