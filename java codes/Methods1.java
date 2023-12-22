import java.util.Scanner;
class MathematicalOperations{
    int add(int a,int b){
       int c=a+b;
       return c;
    }
}
public class Methods1 {
    public  static void main(String []args){
        MathematicalOperations MO= new MathematicalOperations();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a two numbers");
         int x=sc.nextInt();
         int y=sc.nextInt();
        int z=MO.add(x,y);
        System.out.println("the addition of two number is:");
        System.out.println(z);
    }
}
