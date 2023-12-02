import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *  Given an integer array nums,
 *  return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 *  Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 *
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 *
 *
 * Example 3:
 *
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 */
class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1,1,1,3,3,4,3,2,4,2));


        Solution solution = new SetOrMap();
        System.out.println(containDuplicate(nums,solution::containsDuplicate));

    }

    private static boolean containDuplicate(List<Integer> nums, Predicate<List<Integer>> duplicateChecker){
        return duplicateChecker.test(nums);
    }

}

