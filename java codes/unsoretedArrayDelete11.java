//if array is unsorted the we can this algorithm
import java.util.Scanner;
public class unsoretedArrayDelete11 {
    public static void main(String[]args){
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        //declaration of the array
        int[] array=new int[size];
        //insertion of the Elements into the array
        System.out.println("insert the Elements into the array");
        for (int i=0; i<size;i++){
            array[i]=sc.nextInt();
        }
        //print the Array
        System.out.println("array of the Elements as follows");
        for (int i=0;i<size;i++){
            System.out.println(array[i]);
        }
        //select the position of the array to delete the element
        System.out.println("Select the position of the Element to delete from the array");
        int pos=sc.nextInt();

        array[pos-1]=array[size-1];
        size--;
        //new Elemnts of the array
         System.out.println("array of the new Elements");
        for (int i=0;i<size;i++){
            System.out.println(array[i]);
        }

    }
}
