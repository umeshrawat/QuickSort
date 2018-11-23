public class QuickSort {
    protected static void quickSort(int[] array, int start, int end) {

        if (start == end) {
            System.out.println("start and end same");
           return;
        }
        if (start > end) {
            System.out.println("start more than end ");
            return;
        }
        int pivot = choosePivot(array, start, end);
        int pivotPosition = partition(array, start, end, pivot);

        System.out.println("pivotPosition: " + pivotPosition);
        quickSort(array, start, pivotPosition - 1);
        for (int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
        quickSort(array, pivotPosition + 1, end);
        for (int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
    }

    private static int partition(int[] array, int start, int end, int pivot) {
        //lonuto's algorithm

        //1. get pivot out of the way
        swap(array, end, pivot);

        //2. use a pointer to limit all the values less than or equal to the pivotValue within start and itself.
        int lower_ptr = start;

        //3. use a pointer to traverse the entire (unexplored) array and fit into either of the sections :
        // start to lower_ptr must contain elements less than or equal to the pivotValue and
        // lower_ptr + 1 to end - 1 must contain all the elements greater than the pivotValue
        int iterator;
        int pivotValue = array[end];

        //traverse the array and sort based on above logic
        for(iterator = start; iterator <  end; iterator ++) {
            if(array[iterator] <= pivotValue) {
                swap(array, iterator, lower_ptr);
                lower_ptr ++;
            }
        }

        //4. finally, after 1 traversal of the array, we got to set the pivot back right at the middle of the two sections
        // i.e all values before pivot position must be less than or equal to it, rest should me more than it.

        swap(array, lower_ptr, end);

        return lower_ptr;
    }

    private static void swap(int[] array, int end, int pivot) {
        int temp = array[end];
        array[end] = array[pivot];
        array[pivot] = temp;
    }

    private static int choosePivot(int[] array, int start, int end) {
        return start;
    }
}
