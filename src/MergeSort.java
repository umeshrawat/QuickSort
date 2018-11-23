public class MergeSort {

    public static void mergeSort(int[] array, int start, int end) {

        if (start >= end) return;

        int mid = start  + (end - start)/2;

        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);

        merge(array, start, mid, end);

    }

    private static void merge(int[] array, int start, int mid, int end) {

        //1. Create two temporary arrays.
        //This is where Merge sort takes linear space and hence lags compared to Quick sort's in-place algorithm
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] l = new int[n1];
        System.arraycopy(array, start, l, 0, n1 );
        int[] r = new int[n2];
        System.arraycopy(array, mid + 1, r, 0, n2);

        //2.  traverse each arrays and push into the array as sorted sequence
        int k = start;
        int i = 0;
        int j = 0;
        while( i < n1 && j < n2) {
            if(l[i] <= r[j])
                array[k++] = l[i++];
            else
                array[k++] = r[j++];
        }
        while(i < n1)
            array[k++] = l[i++];
        while(j < n2)
            array[k++] = r[j++];
    }
}
