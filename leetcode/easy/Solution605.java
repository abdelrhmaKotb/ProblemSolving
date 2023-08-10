class Solution605 {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n == 0)  {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                i++;
            } else {
                if( ( i + 1 >= flowerbed.length || i - 1 <= -1)  && n != 0 ){ 
                    return false;
                }
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    n--;
                    if (n == 0) {
                        return true;
                    }else{
                        i++;
                    }
                }
            }
        }
        return false;
    }
}