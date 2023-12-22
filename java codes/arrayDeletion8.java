import java.util.Scanner;
public class arrayDeletion8 {
    public static void main(String []args){
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        //Declare the array
        int[]Array=new int[size];
        //insert the Elements of the array
        System.out.println("Enter the Elements of the array");
        for(int i=0;i<size;i++){
           Array[i]=sc.nextInt(); 
        }
        //print the array
        System.out.println("Elements of the array as follows");
        for(int i=0;i<size;i++){
            System.out.println(Array[i]);
        }
        //select delement position of the array
        System.out.println("Select the position of the Element for deleting");
        int pos=sc.nextInt();
        
        for(int i=pos;i<size;i++){
            Array[i-1]=Array[i];
        }
        size--;

        //printing the new elements of the array
        System.out.println("new Elements of the array");
        for(int i=0;i<size;i++){
            System.out.println(Array[i]);
        }
    }
}
