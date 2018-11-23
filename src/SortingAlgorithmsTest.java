import org.junit.Assert;
import org.junit.Test;

public class SortingAlgorithmsTest {


@Test
public void testDesc() {
    int[] arrTest = {5,4,3,2,1};
    int[] arrTestExpected = {1,2,3,4,5};
    QuickSort.quickSort(arrTest, 0, arrTest.length - 1);
    Assert.assertArrayEquals(arrTestExpected , arrTest);

    arrTest = new int[]{5, 4, 3, 2, 1};
    MergeSort.mergeSort(arrTest, 0, 4);
    Assert.assertArrayEquals(arrTestExpected , arrTest);

}

@Test
    public void assortedElements() {
    int[] arrayToTest  = {17, 3, 15, 11, 2, 1, 8, 13, 12, 6, 11};
    int[] expectedArray = {1, 2, 3, 6, 8, 11, 11, 12, 13, 15,17 };

    QuickSort.quickSort(arrayToTest, 0, arrayToTest.length - 1);
    Assert.assertArrayEquals(expectedArray, arrayToTest);

    arrayToTest  = new int[]{17, 3, 15, 11, 2, 1, 8, 13, 12, 6, 11};
    MergeSort.mergeSort(arrayToTest, 0, arrayToTest.length - 1);
    Assert.assertArrayEquals(expectedArray, arrayToTest);

}

}