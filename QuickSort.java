public class QuickSort {
    public static void main(String[] args) {
        int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("\nArray original:");
        printArray(array, -1, array.length - 1);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nArray ordenado:");
        printArray(array, -1, array.length - 1);
    }

    // QuickSort algorithm
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Get pivot index
            quickSort(arr, low, pivotIndex - 1); // Sort left of pivot
            quickSort(arr, pivotIndex + 1, high); // Sort right of pivot
        }
    }

    // Partition function to arrange elements around the pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the pivot (last element)
        int i = low - 1; // Index for smaller elements

        // Traverse the array and swap elements smaller than the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Place the pivot in its correct position
        swap(arr, i + 1, high);

        System.out.print("Iteração: ");
        printChangedArray(arr, i + 1, high);
        try {
            Thread.sleep(700); // 0.7-second pause
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return i + 1; // Return pivot index
    }

    // Swap function to exchange two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to print the array
    public static void printArray(int[] arr, int start, int end) {
        for (int i = 0; i < arr.length; i++) {
            if ((i == start || i == end) && i != arr.length - 1) {
                System.out.print("\u001B[32m" + arr[i] + " " + "\u001B[0m"); // Green text for changed elements
            } else if (i == arr.length - 1) {
                System.out.println(arr[i]); // For the last element, print in a new line
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // Function to print the array highlighting the changed range
    public static void printChangedArray(int[] arr, int start, int end) {
        for (int i = 0; i < arr.length; i++) {
            if (i >= start && i <= end) {
                System.out.print("\u001B[32m" + arr[i] + " " + "\u001B[0m"); // Green text for the changed range
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
