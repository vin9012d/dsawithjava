package sorting;

public class selectionSorting {
    
 public static void main(String[] args) {
     int arr[] = {1,2,4,6,10,3,20,-5,0,-10};
     
     for(int i=0; i<arr.length-1;i++){
        int minVal = arr[i];
        int minInd = arr[i];

        for(int j=i+1; j<arr.length;j++){

            if(arr[j] < minVal){
                minVal= arr[j];
                minInd = j;
            }
        } 
        if (minVal < arr[i]){
            // System.out.println(minVal);
            int temp = arr[i];
            arr[i]= arr[minInd];
            arr[minInd]= temp;

            }
        }
   
        for( int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


     }


    
 }



