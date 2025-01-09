import java.util.Scanner;

public class BinarySearch {

    public static int binarysearch(int[] array,int target){
        
        //Sort the element first..
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }                         
            }
        }
    
        //displaying the sorted list of element..
        System.out.println("The sorted list of element");
        for(int k=0;k<array.length;k++)
        {
            System.out.print(array[k]+" ");
        }
        System.out.println();

        int low=0;
        int high=array.length-1;
        while(low<=high)
            {
                //Calculate the middle index
                int mid=(low+high)/2;
                
                //If the target is equal to the element at mid
                if(array[mid]==target){
                    return mid;
                }

                //If the target is smaller than the element at mid
                if(array[mid]>target){
                  high=mid-1;
                }

                //If the target is greater than the element at mid
                else{
                    low=mid+1;
                }
            }    
        return -1;      
    }

    public static void main(String[] args) {
        System.out.println("****************************");
        System.out.println("\tBinary Search");
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
        System.out.println("Enter the search element: ");
        int search=scan.nextInt();
        int result=binarysearch(a,search);
        if(result!=-1){
            System.out.println("The element found in the index: " + (result+1));
        }
        else{
            System.out.println("The element not found");
        }
        scan.close();
    }
    
}
