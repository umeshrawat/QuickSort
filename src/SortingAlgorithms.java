public class SortingAlgorithms {

    //The main just uses quickSort.
    //To use other algorithms, refer the testcase and call the methods accordingly
    public static void main(String[] args) {
        int[] array  = {17, 3, 15, 11, 2, 1, 8, 13, 12, 6};

        System.out.println("before: ");
        for (int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }

        QuickSort.quickSort(array, 0, array.length - 1);

        System.out.println("after: ");
        for (int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
        return;

    }


}
