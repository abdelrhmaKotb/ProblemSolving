import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOrMap implements Solution{

    @Override
    public boolean containsDuplicate(List<Integer> nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }

        return false;

    }
}
