//numerical triangular pattern
import java.util.Scanner;
public class NLoopProblem10 {
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter how many rows do you want");
    int r=sc.nextInt();
    for(int i=0;i<=r;i++){
        for(int j=1;j<=i;j++){
           System.out.print(j);
        }
        System.out.println();
    }
   } 
}
