//print the first n factorial numbers
import java.util.Scanner;
public class LoopProblem5 {
    public static void main(String []args){
        System.out.println("Enter a number for factorial");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorail=1;
        for(int i=1;i<=n;i++){
            factorail=factorail*i;
        System.out.println(+i +" "+ "factirial ="+ " "    +factorail);

        }
    }
}
