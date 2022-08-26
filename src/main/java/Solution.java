import java.util.LinkedList;

public class Solution {
  public int[] maxSlidingWindow(int[] nums, int k) {
    int n = nums.length;
    if (n == 0 || n < k) {
      return new int[1];
    }
    int[] result = new int[n-k+1];
    int currentIdx = 0;
    LinkedList<Integer> window = new LinkedList<>();
    for (int pos = 0; pos < n; pos++) {
      if (pos >= k && window.getFirst() <= pos - k) {
        window.removeFirst();
      }
      while(window.size() > 0 && nums[window.getLast()] < nums[pos]) {
        window.removeLast();
      }
      window.add(pos);
      if (pos >= k - 1) {
        result[currentIdx] = nums[window.getFirst()];
        currentIdx++;
      }
    }
    return result;
  }
}
