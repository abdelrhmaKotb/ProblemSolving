import java.util.List;

class BruteForce implements Solution {
    @Override
    public boolean containsDuplicate(List<Integer> nums) {

        int ln = nums.size();

        for (int i = 0; i < ln; i++) {
            for (int j = i + 1; j < ln; j++){
                if(nums.get(i) == nums.get(j)){
                    return true;
                }
            }
        }

        return false;
    }
}