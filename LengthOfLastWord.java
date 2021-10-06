public class LengthOfLastWord {
    //Leetcode 58, 100% speed.
    public int lengthOfLastWord(String s) {
        int counter = 0;
        boolean fStartedWord = false;
        for (int i = (s.length() - 1); i >= 0; i--) {
            if (fStartedWord) {
                if (s.charAt(i) == ' ') {
                    return counter;
                }
                else {
                    counter++;
                }
            }
            else if (s.charAt(i) != ' ') {
                fStartedWord = true;
                counter++;
            }
        }
        
        return counter;
    }
}
