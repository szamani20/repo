package ir.szamani;

public class Sort {

    public void doMergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    public void doBubbleSort(int[] array) {
        bubbleSort(array);
    }

    public void doHeapSort(int[] array) {
        heapSort(array);
    }

    public void heapSort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;  // Initialize largest as root
        int l = 2 * i + 1;  // left = 2*i + 1
        int r = 2 * i + 2;  // right = 2*i + 2

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) { // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;  // Find sizes of two subarrays to be merged
        int n2 = r - m;

        int L[] = new int[n1];        /* Create temp arrays */
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)  /*Copy data to temp arrays*/
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;  // Initial indexes of first and second subarrays

        int k = l;  // Initial index of merged subarry array
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {  /* Copy remaining elements of L[] if any */
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {  /* Copy remaining elements of R[] if any */
            arr[k] = R[j];
            j++;
            k++;
        }

        if (arr.length == 2)
            dium();
    }

    private void dium() {}

    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2; // Find the middle point

            mergeSort(arr, l, m); // Sort first and second halves
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r); // Merge the sorted halves
        }
    }

}
