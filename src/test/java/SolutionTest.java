import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void maxSlidingWindowExample1() {
    assertArrayEquals(new int[]{3,3,5,5,6,7},
        sol.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));
  }
  @Test
  void maxSlidingWindowExample2() {
    assertArrayEquals(new int[]{1},
        sol.maxSlidingWindow(new int[]{1}, 1));
  }
}