import java.util.Arrays;

public class LongestCommonPrefix {
    //Unoptimized first solution
    /*
    public String longestCommonPrefix(String[] strs) {
        String commonpref = "";
        
        for (int i = 0; i < strs[0].length(); i++) {
            char CurrChar = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                // if we're ever out of bounds, return whatever we have discovered so far.
                if (strs[j].length() < (i + 1)) {
                    return commonpref;
                }
                if (strs[j].charAt(i) != CurrChar) {
                    return commonpref;
                }
            }
            commonpref = commonpref + CurrChar;
        }
        
        return commonpref;
    }
    */

    //optimized second solution

    public String optimizedlongestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length - 1];
        int i = 0;

        while (i < start.length()) {
            if (start.charAt(i) == end.charAt(i)) {
                i++;
            }
            else {
                break;
            }
        }

        return i == 0 ? "" : start.substring(0, i);
    }
}
