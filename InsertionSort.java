import java.util.Scanner;

public class InsertionSort {

    //Insertion sort..
    static void Insertionsort(int[] array){
        for(int i=1;i<array.length;i++)
        {
            int key=array[i];
            int j=i-1;
            while(j>=0 && array[j]>key)
            {
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
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
        System.out.println("\tInsertion sort");
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
        Insertionsort(a);
        System.out.println("\nSorted array: ");
        display(a);
        scan.close();
    }  
}
