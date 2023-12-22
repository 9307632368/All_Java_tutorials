import java.util.Scanner;
//numerical pyramid pattern
public class NLoopProblem11 {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter how many rows do you wnat to insert");
        int r=sc.nextInt();
        for(int i=0;i<=r;i++){
            for(int j=1;j<=r-i;j++){
              System.out.print(" ");
            }
            for(int k=1;k<=i+i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
