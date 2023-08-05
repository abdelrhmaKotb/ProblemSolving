class Solution {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","xyzg"));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();

        int lnWo1 = word1.length(); 
        int lnWo2 = word2.length(); 

        int ptr1 = 0;
        int ptr2 = 0;

        while(ptr1 < lnWo1 && ptr2 < lnWo2){
            builder.append(word1.charAt(ptr1++));
            builder.append(word2.charAt(ptr2++));
        }

        while(ptr1 < lnWo1){
            builder.append(word1.charAt(ptr1++));
        }

         while(ptr2 < lnWo2){
            builder.append(word2.charAt(ptr2++));
        }

        return builder.toString();
    }
}