import java.util.Scanner;

public class MergeSort {
    
    static void mergeSort(int[] arr,int intial,int mid,int end){
        int n1 = mid - intial + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0; i < n1 ; i++){
            left[i] = arr[intial+i];
        }
        for(int j = 0; j < n2; j++)
        {
            right[j] = arr[mid + 1 + j];
        }
        //Let us consider there are two halves 1subarray , another 1 subarray

        //let us point first position of two subarray
        int i = 0, j = 0;


        int k = intial;
        while ( i < n1 && j < n2 ) {
            if( left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }   
            k++; 
        }

        //Copying the remaining element of the left side
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        //Copying the remaining element of the right side
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
    static void sort(int[] array, int initiallength, int totallength){

        //find the middle element..
        if(initiallength < totallength){
            int m= initiallength + ( totallength - initiallength ) / 2;

            sort( array, initiallength, m);
            sort( array, m+1, totallength);

            mergeSort( array, initiallength, m, totallength);
        }

    }

    static void display(int arr[]){
        int i;
        int size = arr.length;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        System.out.println("****************************");
        System.out.println("\tMerge sort");
        System.out.println("*****************************");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int size = scan.nextInt();
        System.out.println("Enter "+size+" element:");
        int[] a = new int[size];
        for(int i = 0; i < size; i++)
        {
            a[i] = scan.nextInt();
        }
        sort( a, 0, a.length-1);
        System.out.println("\n\nSorted array: ");
        display(a);
        scan.close();
    }
}