package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class removeEvenNumberFromArray {

    public static void main(String[] args) {
        

                ArrayList<Integer> list = new ArrayList<>(
            Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));


            for(int i=0; i<list.size();i++){

                if(list.get(i)%2==0){
                 list.remove(i);
                }
            }

            System.out.println(list);
    }
    
}
