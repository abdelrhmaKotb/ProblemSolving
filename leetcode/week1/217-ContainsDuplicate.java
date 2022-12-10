import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0,length = nums.length;i < length;i++)
        {
            if(map.containsKey(nums[i]))
            {   
                return true;
            }else
            {
                map.put(nums[i],nums[i]);
            }
        }
        return false;
    }
}