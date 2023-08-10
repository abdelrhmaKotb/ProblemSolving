public class Solution27 {

    /*
     * Given an integer array nums and an integer val, remove all occurrences of val
     * in nums in-place. The order of the elements may be changed. Then return the
     * number of elements in nums which are not equal to val.
     * 
     * Consider the number of elements in nums which are not equal to val be k, to
     * get accepted, you need to do the following things:
     * 
     * Change the array nums such that the first k elements of nums contain the
     * elements which are not equal to val. The remaining elements of nums are not
     * important as well as the size of nums.
     * Return k.
     */

    /**
     * Constraints:
     * 
     * 0 <= nums.length <= 100
     * 0 <= nums[i] <= 50
     * 0 <= val <= 100
     * 
     */
    public static void main(String[] args) {
        System.out.println(removeElement(new int[] { 1, 1 }, 1));
    }

    public static int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (nums[start] == val) {
                while (start <= end) {
                    if (nums[end] == val) {
                        end--;
                        continue;
                    } else {
                        nums[start++] = nums[end--];
                        break;
                    }
                }
            } else {
                start++;
            }
        }

        return end + 1;
    }

}
