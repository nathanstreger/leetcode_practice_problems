public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int numberRemoved = 1; //starts at 1 to offset the length
        int length = nums.length;
        
        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                count++;
            }
            else {
                if (i == length - numberRemoved + 1) {
                    break;
                }
                //swap current index value with value at the (length - numberRemoved) index.
                //Increment the number removed so that the pointer moves to the left.
                int temp = nums[length-numberRemoved];
                nums[length-numberRemoved] = nums[i];
                nums[i] = temp;
                numberRemoved++;
                i--;
            }
        }
        return count;
    }
}
