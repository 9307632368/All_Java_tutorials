import java.util.*;
public class array{
    public static void main(String []args){
        //declaration of array at compile time
        //method 1]
        int []marks=new int[5];
        //initializing the values
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;
        marks[3]=96;
        marks[4]=93;
        //printing the array elements
        for (int i=0 ;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}