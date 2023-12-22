import java.util.Scanner;
public class arrayInsertion {
    public static void main(String args[]){
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] array=new int[size];
        System.out.println("insert how many Elements you want to insert");
        int insertionElements=sc.nextInt();
        for(int i=0;i<insertionElements;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Elements are as follows");
        for(int i=0;i<insertionElements;i++){
             System.out.println(array[i]);
        }

        System.out.println("select the position of the array");
        int pos=sc.nextInt();
        System.out.println("Insert the new Element in array");
        int  newElement=sc.nextInt();

        for(int i=insertionElements-1; i>=pos-1;i--){
         array[i+1]=array[i];
        }

        array[pos-1]=newElement;
        insertionElements++;
        
        System.out.println("new array");
        for(int i=0;i<insertionElements;i++){
            System.out.println(array[i]);
        }
    }
}
