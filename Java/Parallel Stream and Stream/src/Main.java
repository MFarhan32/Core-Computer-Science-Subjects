import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,5,3,6,7,4);

        long startSeq = System.currentTimeMillis();
        int sum1 = nums.stream()
                .map(i -> i*2)
                .mapToInt(i -> i)
                .sum();
        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();

        int sum2 = nums.parallelStream()
                .map(i -> i*2)
                .mapToInt(i -> i)
                .sum();

        long endPara= System.currentTimeMillis();

        System.out.println(sum1  + " " + sum2);
        System.out.print("Stream Time : ");
        System.out.println(endSeq - startSeq);
        System.out.print("ParallelStream Time : ");
        System.out.println(endPara - startPara);
    }
}