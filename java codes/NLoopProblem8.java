import java.util.Scanner;
public class NLoopProblem8 {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter how many rows do you want");
    int r=sc.nextInt();
    System.out.println("Enter how many columns do you want");
    int c=sc.nextInt();
    for(int i=1;i<=r;i++){
        for (int j=1;j<=c;j++){
            if(i==1||i==r||j==1||j==c){
                System.out.print(j);
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
   } 
}
