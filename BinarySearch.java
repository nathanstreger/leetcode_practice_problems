public class BinarySearch {
    //returns index of target value or -1 if it does not exist.
    public int IndexOfBinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] <= target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Recursive solution
     * 
     * int binarySearch(int arr[], int left, int right, int target) {
     *  if (right >= left) {
     *      int mid = left + (right - left) / 2;
     *      if (arr[mid] == target) {
     *          return mid;
     *      }
     *      if (arr[mid] > target) {
     *          return binarySearch(arr, 1, mid - 1, target);
     *      }
     *      return binarySearch(arr, mid + 1, right, target);
     *  }
     *  return -1;
     * }
     */
}
