import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace2() {
    int[] input2 = {8, 12, 16, 20, 24};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 24, 20, 16, 12, 8 }, input2);
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input2 = { 5, 10, 15 };
    assertArrayEquals(new int[]{ 15, 10, 5 }, ArrayExamples.reversed(input2));
  }
}
