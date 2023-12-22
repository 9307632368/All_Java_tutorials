import java.util.Scanner;
public class A2darray5 {
    public static void main(String args[]){
        //2d array
        System.out.println("Enter the size of row");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        System.out.println("Enter the size of column");
        int col=sc.nextInt();
        //declaration of array
        int[][]numbers=new int[row][col];
        //initialize the array
        for(int i=0;i<row;i++){
            for(int j=0; j<col;j++){
                System.out.println("Enter the row "+ i + "and column "+j +" th elements of array");
                numbers[i][j]=sc.nextInt();
            }
        }
        //printing the elements of array
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(numbers[i][j]);
            }
        }
    }
}
