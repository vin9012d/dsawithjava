package sorting;

public class bubbleSorting {

    public static void main(String[] args) {
        int[] arr = {1,2,10,12,-3,29,4};
          
        for(int i=0; i<arr.length;i++){
             
            for(int j=0;j<arr.length-i-1;j++){
                    
                if(arr[j] > arr[j+1]){
                 int temp= arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]= temp;
                }
                  

            }
             
        }
            
        for( int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
