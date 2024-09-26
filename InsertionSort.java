public class InsertionSort {

    // Method to print an array highlighting the positions that have been modified
    public static void printArray(int[] arr, int sortedIndex) {
        for (int i = 0; i < arr.length; i++) {
            if (i == sortedIndex) {
                System.out.print("\u001B[32m" + arr[i] + "\u001B[0m "); // Green text
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of array[0..i-1] that are greater than the key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            // Print the array in each iteration
            System.out.print("Iteração " + i + ": ");
            printArray(arr, i);
            try {
                Thread.sleep(700); // 0.7-second pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.print("\nArray original: \n");
        printArray(arr, -1);

        insertionSort(arr); // Call the Insertion Sort

        System.out.print("\nArray ordenado: ");
        printArray(arr, -1);
    }
}
