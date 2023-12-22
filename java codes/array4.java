import java.util.Scanner;
public class array4 {
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

      System.out.println("Enter your searching Element");
      int search=sc.nextInt();
      for(int i=0;i<size;i++){
      if(Marks[i]==search){
        System.out.println("searching element "+ search + "is present");
      }else 
      System.out.println("your searching element is not present");
    }
    }
}

