class Solution605 {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) {
            return true;
        }

        if (flowerbed.length == 1 && n == 1 && flowerbed[0] == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 1) {
                i++;
            } else {

                if (i == 0) {
                    if (flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                } else if (i == flowerbed.length - 1) {
                    if (flowerbed[i - 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }

                if (n == 0) {
                    return true;
                }

            }

        }

        return false;
    }
}
