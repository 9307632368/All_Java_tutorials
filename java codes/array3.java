import java.util.Scanner;
public class array3 {
    public static void main(String []args){
      //declaration of array at runtime
      System.out.println("Enter the size of array");
      Scanner sc=new Scanner(System.in);
      int size= sc.nextInt();
      int[] Marks=new int[size];

      for(int i=0; i<size;i++){
         System.out.println("Enter "+i+" th Element");
         Marks[i]=sc.nextInt();
      }

      for(int i=0;i<size;i++){
        System.out.println(Marks[i]);
      }
    }
}
