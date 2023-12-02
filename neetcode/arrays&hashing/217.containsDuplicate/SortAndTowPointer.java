import java.util.Collections;
import java.util.List;

public class SortAndTowPointer implements Solution{
    @Override
    public boolean containsDuplicate(List<Integer> nums) {

        if(nums.isEmpty() || nums.size() == 1){
            return false;
        }

        // implement sorting later
        Collections.sort(nums);

        int ln = nums.size();

        for (int i = 0, j = 1; i < ln && j < ln ; i++ , j++){
            if (nums.get(i) == nums.get(j)){
                return  true;
            }
        }

        return false;
    }
}
