import java.util.Scanner;
public class demo {
    public static void main(String[] args){
        Scanner reader =new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = reader.nextInt();
        System.out.println("You entered: "+number);
    }
}