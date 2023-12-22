import java.util.Scanner;
public class arrayDeletionAgain9 {
    public static void main(String[]args){
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println(" how many Elements do you want to Enter");
        int insertionElements=sc.nextInt();
        //declaration of the array
        int []array=new int[size];
        //insert the elements into the array
        System.out.println("insert the Elements into the array");
        for(int i=0;i<insertionElements;i++){
         array[i]=sc.nextInt();
        }
        //print the array
        System.out.println("Elements of the array as follows");
        for (int i=0;i<insertionElements;i++){
            System.out.println(array[i]);  
        }
        //select the position of the array to delete the element
        System.out.println("Select the position of the array to delete the Element ");
        int pos=sc.nextInt();

        for(int i=pos;i<insertionElements;i++){
              array[i-1]=array[i];
        }
        insertionElements--;

        //new element deleted array
        System.out.println("new deleted Element of the array");
        for (int i=0;i<insertionElements;i++){
            System.out.println(array[i]);
        }

    }
}
