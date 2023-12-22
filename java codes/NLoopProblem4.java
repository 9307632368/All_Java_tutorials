//print reverse star pattern
import java.util.Scanner;
public class NLoopProblem4 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how mnay rows do you want");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r+1-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
