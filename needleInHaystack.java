public class needleInHaystack {
    public int strStr(String haystack, String needle) {
        int a = haystack.length();
        int b = needle.length();
        
        if (b == 0) {
            return 0;
        }
        
        for (int i = 0; i < a && (i + b) <= a; i++) {
            if (needle.equals(haystack.substring(i, i + b))) {
                return i;
            }
        }
        
        return -1;
    }
}
