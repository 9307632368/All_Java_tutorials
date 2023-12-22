//find the a raised to power b
import java.util.Scanner;
public class LoopProblem6 {
    public static void main(String args[]){
        int ans=1;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter a number for power");
        int b=sc.nextInt();
        for(int i=1;i<=b;i++){
            ans=ans*a;
        }
        System.out.println(a+"power of"+b+"="+ans);
    }
}
