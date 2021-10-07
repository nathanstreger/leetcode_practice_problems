import java.util.Arrays;

public class PlusOne {
    //Leetcode 66, 100% speed.
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        }
        
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            else if (i == 0) {
                digits[i] = 0;
                return ConcatenateArrays(new int[] {1}, digits);
            }
            else {
                digits[i] = 0;
            }
        }
        
        return digits;
    }

    public int[] ConcatenateArrays(int[] first, int[] second) {
        int[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }
}
