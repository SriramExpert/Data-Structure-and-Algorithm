import java.util.Scanner;

public class SelectionSort {

    //Selection sort for ascending order
    static void selectionSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {

            //This line assumes that the current position of array is an minimum element..  
            int min_val_index = i;

            // Iterate through the unsorted portion to find the actual minimum..
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min_val_index]) {

                    min_val_index = j;
                }
            }

            //placing the minimum value with respect to current position of "i"..
            int temp = array[i];
            array[i] = array[min_val_index];
            array[min_val_index] = temp;           
        }
    }
    
    //display function for sorted array..
    static void display(int arr[]){
        int i;
        int size=arr.length;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("****************************");
        System.out.println("\tSelection sort");
        System.out.println("*****************************");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int size=scan.nextInt();
        System.out.println("Enter "+size+" element:");
        int[] a=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }
        selectionSort(a);
        System.out.println("\nSorted array: ");
        display(a);
        scan.close();
    }  
}
