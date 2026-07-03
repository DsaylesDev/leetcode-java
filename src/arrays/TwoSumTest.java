package arrays;

import java.util.Arrays;

public class TwoSumTest {

    public static void main(String[] args) {

        TwoSum solution = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
