import java.util.Random;

public class ArrayExample {

    public static void main(String[] args) {
        int nums[][][] = new int[2][3][4];

        //Random random = new Random();

        for(int x=0;x<nums.length;x++){
            for(int y=0;y<nums[x].length;y++){
                for(int z=0;z<nums[x][y].length;z++){
                    nums[x][y][z] = (int)(Math.random()*100);
                    System.out.print(nums[x][y][z]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
      
    }
    
}