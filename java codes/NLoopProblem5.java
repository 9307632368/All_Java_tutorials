//printing pyramid pattern
import java.util.Scanner;
public class NLoopProblem5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many rows do you want");
        int r=sc.nextInt();
        //row traversing
        for(int i=0;i<=r;i++){
            //printing white spaces
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
