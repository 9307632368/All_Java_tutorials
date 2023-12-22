//find sum of digits in given number
public class LoopProblem2 {
    public static void main(String args[]){
        int number=346754567;
        int sumOfDigits=0;
        while(number>0){
          sumOfDigits=sumOfDigits+number%10;
          number=number/10;
        }
        System.out.println("The sum of the digit in given number is"+ " " +sumOfDigits);
    }
}
