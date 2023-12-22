//in a given number find how many digits are present in that
import java.util.Scanner;
public class LoopProblem1{
    public static void main(String []args){
       int number=87543478;
       int increment=0;
       while(number>0){
        number=number/10;
        increment++;
       }
       System.out.println("the count of digit in given number is"+" " +increment);
    }
}