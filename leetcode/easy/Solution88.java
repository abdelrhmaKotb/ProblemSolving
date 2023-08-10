public class Solution88 {


    // this problem in top interview study plan
    // it was the first one

    /*
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
     * order, and two integers m and n, representing the number of elements in nums1
     * and nums2 respectively.
     *
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     *
     * The final sorted array should not be returned by the function, but instead be
     * stored inside the array nums1. To accommodate this, nums1 has a length of m +
     * n, where the first m elements denote the elements that should be merged, and
     * the last n elements are set to 0 and should be ignored. nums2 has a length of
     * n
     */

    /*
     * Constraints:
     *
     * nums1.length == m + n
     * nums2.length == n
     * 0 <= m, n <= 200
     * 1 <= m + n <= 200
     * -109 <= nums1[i], nums2[j] <= 109
     */

    public  void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr = n + m -1;  // for insert from back
        m--;
        n--;

        while(m >= 0 && n >= 0){
            if(nums1[m] > nums2[n]){
                nums1[ptr--] = nums1[m--];
            }else{
                nums1[ptr--] = nums2[n--];
            }
        }

        while(m >= 0){
            nums1[ptr--] = nums1[m--];
        }

        while(n >= 0){
            nums1[ptr--] = nums2[n--];
        }


    }
}

