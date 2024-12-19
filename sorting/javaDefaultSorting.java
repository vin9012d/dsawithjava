package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class javaDefaultSorting {

    public static void main(String[] args) {
        int[] arr = {1,4,6,8,10,-1};

        // Arrays.sort(arr);  
         // it uses quick sort wrost case N**2

         //for sorting only sub array
                 // keep other elements as it is.
        // Arrays.sort(arr, 1, 5);

          // Reverse sort the array
        //   Arrays.sort(arr, Collections.reverseOrder());
        
        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(arr));   

                          ArrayList<Integer> list = new ArrayList<>();
                          list.add(5);
                          list.add(10);
                          list.add(11);
                          list.add(1);
                           // ascending order
                          Collections.sort(list);
                          System.out.println(list);
                          //descending order
                          Collections.sort(list, Collections.reverseOrder());

                          System.out.println(list);
    }
    
}
