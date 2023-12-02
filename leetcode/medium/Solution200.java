import java.util.ArrayDeque;
import java.util.Queue;

public class Solution200 {
    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        System.out.println(numIslands(grid));
    }
    public static int numIslands(char[][] grid) {
        Queue<Character> queue = new ArrayDeque<>();
        queue.add(grid[0][0]);
        grid[0][0] = 'x';

        while (!queue.isEmpty()) {
            Character c = queue.poll();
            if(c == 'x') continue;
            
            if(c == '1'){
                
            }    

        }
        return 1;
    }
}
