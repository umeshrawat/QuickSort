import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {


@Test
public void testDesc() {
    int[] arrTest = {5,4,3,2,1};
    int[] arrTestExpected = {1,2,3,4,5};
    QuickSort.quickSort(arrTest, 0, arrTest.length - 1);

    Assert.assertArrayEquals(arrTestExpected , arrTest);


}

}