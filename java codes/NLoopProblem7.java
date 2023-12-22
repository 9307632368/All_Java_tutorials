import java.util.Scanner;
public class NLoopProblem7 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a how many row do you want");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=6;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
