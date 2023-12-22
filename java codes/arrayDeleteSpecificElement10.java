import java.util.Scanner;
public class arrayDeleteSpecificElement10 {
    public static void main(String[]args){
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
//declaration of the array
        int[] array=new int[size];
        System.out.println("Enter the Elements of the array");
        for(int i=0;i<size;i++){
         array[i]=sc.nextInt();
        }
        //printing the array
        System.out.println("Elements are as follows");
        for(int i=0;i<size;i++){
        System.out.println(array[i]);
        }
        //enter the Element do you want to delete
        System.out.println("Enter the Element do you want to delete");
        int delElement=sc.nextInt();
        for(int i=0;i<size;i++){
            if(delElement==array[i]){
                int pos=array[i];
                for(int j=pos;j<size;j++){
                    array[j-1]=array[j];
                }size--;
            }
          
        }
        

        //print the new array
        System.out.println("new delted Element of the array");
        for (int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }
}
