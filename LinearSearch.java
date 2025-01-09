/* Linear Search in Java */
import java.util.*;
public class LinearSearch{

    // This is the method for Linear Search. if the element found, it will returns its index otherwise it will return -1
    public static int linearSearch(int[] array, int target)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==target){
                return i;
            }
        }
       return -1;
    }

        public static void main(String[] args) {

            System.out.println("********************************");
            System.out.println("\tLinear Search");
            System.out.println("********************************");
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the number of element:");
            int n=scan.nextInt();
            System.out.println("Enter "+ n +" Elements");
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=scan.nextInt();
            }
            System.out.println("Enter the search element: ");
            int search=scan.nextInt();
            int result=linearSearch(a,search);
            if(result==-1){
                System.out.println("Element not found");
            }
            else{
                System.out.println("Element found at the index:" + result+1);
            }
            scan.close();
        }
    }
