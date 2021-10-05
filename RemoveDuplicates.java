public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int lastNonDuplicate = nums[0];
        int lastNonDuplicateIndex = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != lastNonDuplicate) {
                lastNonDuplicate = nums[i];
                lastNonDuplicateIndex++;
                nums[lastNonDuplicateIndex] = lastNonDuplicate;
            }
        }
        
        return lastNonDuplicateIndex + 1;
    }
}
