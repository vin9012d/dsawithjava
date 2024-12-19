package sorting;

public class insertionSorting {
 
    public static void main(String[] args) {
        int[] arr = {1,10,9,3,11,4};
        int key =0;
        for(int i=0;i<arr.length;i++){
           
         for(int j= key; j>0;j--){
               if (arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
               }

         }
         key++;
          

        }
        for( int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }


     
}
