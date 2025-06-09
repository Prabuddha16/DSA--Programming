import java.util.Arrays;
import Hashing.TwoSum;

public class App {
    public static void main(String[] args) {
        int[] numsArray = {2, 7, 11, 15};
        int target = 9;

        // https://neetcode.io/problems/two-integer-sum?list=blind75
        int[] result = TwoSum.findTwoSum(numsArray, target);
        System.out.println(Arrays.toString(result));


    }
}
