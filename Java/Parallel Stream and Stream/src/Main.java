import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,5,3,6,7,4);

        int sum1 = nums.stream()
                .map(i -> i*2)
                .mapToInt(i -> i)
                .sum();

        int sum2 = nums.parallelStream()
                .map(i -> i*2)
                .mapToInt(i -> i)
                .sum();

        System.out.println(sum1  + " " + sum2);
    }
}