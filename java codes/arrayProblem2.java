//move all zeros to the left side
public class arrayProblem2 {
    public static void main(String args[]){
        int array[]={10,0,7,0,0,1,0,4,15};
        System.out.println("original array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        //finding largest three element from an array
        for(int i=0;i<array.length-1;i++){
            if(array[i]!=0){
              array[i+1]=array[i];
            }
                    System.out.print(array[i]+" ");

        }
    }
}
