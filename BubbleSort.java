import java.util.Scanner;

public class BubbleSort {
    //Bubble sort function
    static void bubblesort(int[] array)
    {
        int n=array.length;
        for(int i=0;i<n-1;i++)
        {
            //Initially swap condition is false: This line denotes (If there is no swap in the inner loop it will returns the array)
            //it just act as a flag
            boolean swap = false;
            for(int j=0;j<n-i-1;j++)
            {
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    // swap=true..This line denotes(The array get swapped)..The array is still alive now..
                    swap = true;
                }              
            }  
             // If no two elements were swap by inner loop, then break
            if (swap == false)
                break;       
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
        System.out.println("\tBubble sort");
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
        bubblesort(a);
        System.out.println("\n\nSorted array: ");
        display(a);
        scan.close();
    }
}
