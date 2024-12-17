package arrays;

public class SubArray {     


    public static void main(String[] args) {

    int arr [] = {1,2,3,4};
      
    for(int i=0; i <arr.length; i++){
        String bag = arr[i]+"";
          System.out.println(bag);

          for(int j=i+1;j<arr.length;j++){
            bag = bag +" "+arr[j];
            System.out.println(bag);


          }
    }

    }
}