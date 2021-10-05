import java.util.Map;
import java.util.HashMap;

public class twoSum {
    public int[] TwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            }
            else {
                int complement = target - nums[i];
                if (map.containsKey((complement))) {
                    continue;
                }
                map.put(complement, i);
            }
        }

        return new int[] {};
    }
}
