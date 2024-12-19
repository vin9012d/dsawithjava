package arrays;

public class MyClass {
    public static void main(String[] args) {
      int arr [] = {1,2,3,4,5,6,8,12,25,43,18};
     //  int arr1 [] = new int[5];  we can intialize in this way as well

      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
         
         for(int i=0; i < arr.length;i++){

              if (arr[i] > max){
                max = arr[i];
              }
              if (arr[i]< min){
        min = arr[i];
              }
         }

     System.out.println("min"+min+ " max"+max);



    }
}