import java.util.Scanner;
public class A2darray6 {
   public static void main(String args[]){
    //declare the size of array
    System.out.println("Enter the size of row");
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    System.out.println("Enter the size of column");
    int col=sc.nextInt();
    //declaration of array
    int number[][]=new int[row][col] ;
    //initialization of array
    System.out.println("Enter the elements");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            number[i][j]=sc.nextInt();
        }
    }

    //takes the searching input from user
    System.out.println("Enter the searching Element");
    int search=sc.nextInt();

    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(number[i][j]==search){
                System.out.println("element"+ search+ "found at index"+"at row"+i+"col"+j);
            }
        }
    }

   } 
}
