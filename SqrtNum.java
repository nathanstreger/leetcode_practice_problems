public class SqrtNum {
    //Very unoptimized. Use binary search instead (below)
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        long j = x;
        for (long i = 0; i <= j; i++) {
            if ((i * i) > j) {
                return (int)i - 1;
            }
        }
        
        return -1; //shouldn't ever get here but it makes Java happy.
    }

    /**
     * Binary Search Solution (same parameters and starting variables as above)
     * 
     * if (x < 1) {
     *  return 0;
     * }
     * 
     * int i = 1, j = x / 2;
     * int ans = 1;
     * 
     * while (i <= j) {
     *  int mid = i + (j - i) / 2;
     *  if (mid == x / mid) {
     *      return mid;
     *  }
     *  else if (mid < x / mid) {
     *      ans = mid;
     *      i = mid + 1;
     *  }
     *  else {
     *      j = mid - 1;
     *  }
     * }
     * 
     * return ans;
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */
}
