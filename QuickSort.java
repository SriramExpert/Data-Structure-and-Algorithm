import java.util.Scanner;

public class QuickSort {
    
    // Function to partition the array
    public static int partition(int[] arr, int low, int high) {
        // Selecting the last element as the pivot
        int pivot = arr[high]; 
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            // If the current element is smaller than the pivot
            if (arr[j] < pivot) { 
                i++;
                swap(arr, i, j);
            }
        }
        // Move pivot to its correct position
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Function to swap two elements in the array
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Recursive function to apply QuickSort
    static void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int partitioning = partition(array, low, high);
            quicksort(array, low, partitioning - 1); // Sort left partition
            quicksort(array, partitioning + 1, high); // Sort right partition
        }
    }

    // Function to display the array
    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Getting user input
        System.out.println("****************************");
        System.out.println("\tQuick Sort");
        System.out.println("****************************");
        System.out.print("Enter the number of elements: ");
        int size = scan.nextInt();

        int[] a = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            a[i] = scan.nextInt();
        }

        // Applying QuickSort
        quicksort(a, 0, a.length - 1);

        // Displaying the sorted array
        System.out.println("\nSorted array: ");
        display(a);

        scan.close();
    }
}
