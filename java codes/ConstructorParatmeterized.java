class MathOperations{
    int a;
    int b;
    //parameterized constructor
    MathOperations(int x,int y){
     a=x;
     b=y;   
    }
     int add( ){
            int c=a+b;
            return c;
        }

        int sub( ){
            int c=a-b;
            return c;
        }
}

public class ConstructorParatmeterized {
    public static void main(String[]args){
        MathOperations mt=new MathOperations(10, 5);
        int sum=mt.add();
        int sub=mt.sub();
        System.out.println(sum);
        System.out.println(sub);
  
    }
}
