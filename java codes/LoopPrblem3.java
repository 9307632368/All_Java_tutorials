//Reverse the digits of the given number
public class LoopPrblem3 {
    public static void main(String[] args){
        int number=123456;
        int ans=0;
        while(number>0){
            ans=ans*10+number%10;
            number=number/10;
        }
        System.out.println("Reverse of the given number is"+ " " +ans);
    }
}
