class Solution2535 {
    public static void main(String[] args) {
       System.out.println(differenceOfSum(new int[] { 1, 15, 6, 3 }));  
    }

    public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for (int i : nums) {
            elementSum += i;

            while (i > 0) {
                digitSum += i % 10;
                i /= 10;
            }

        }
        return elementSum - digitSum;
    }

}