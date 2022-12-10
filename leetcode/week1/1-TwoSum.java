import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] res = {0,0};

        for(int i = 0,len = nums.length;i < len;i++)
        {
            int key = target - nums[i];
            
            if(map.containsKey(key))
            {
                res[0] = map.get(key);
                res[1] = i;
            }else
            {
                map.put(nums[i],i);
            }
        } 

        return res;
    }
}