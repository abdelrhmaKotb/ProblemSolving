import java.util.Arrays;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        double res = findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 });
        System.out.println(res);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int lnNums1 = nums1.length;
        int lnNums2 = nums2.length;

        int mergedArr[] = new int[lnNums1 + lnNums2];

        int ptr1 = 0;
        int ptr2 = 0;
        int ptrM = 0;

        while (ptr1 < lnNums1 && ptr2 < lnNums2) {
            if (nums1[ptr1] < nums2[ptr2]) {
                mergedArr[ptrM++] = nums1[ptr1++];
            } else {
                mergedArr[ptrM++] = nums2[ptr2++];
            }
        }

        while (ptr1 < lnNums1) {
            mergedArr[ptrM++] = nums1[ptr1++];
        }

        while (ptr2 < lnNums2) {
            mergedArr[ptrM++] = nums2[ptr2++];
        }

        System.out.println(Arrays.toString(mergedArr));

        if (mergedArr.length % 2 == 0) {
            int index = mergedArr.length / 2;
            return (mergedArr[index] + mergedArr[index - 1]) / 2.0;
        }

        return mergedArr[mergedArr.length / 2];

    }
}