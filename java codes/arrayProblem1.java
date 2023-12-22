//write a program to reverse the the element from an array
public class arrayProblem1 {
    public static void main(String[]args){
        int array[]={10,20,30,40,50,60,70,80};
        System.out.println("original Elements of the array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        //reverse Element of the array
        System.out.println("Reverse Element of the array");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
