package arrays;
public class Reverse {     

    int arr [] = {1,2,3,4,5,6,8,12,25,43,18};
    public static void main(String[] args) {

    Reverse r = new Reverse();
    int[] arr = r.arr;
     int left = 0;
     int right = arr.length-1;
     
      while (left < right){
         int oldLeft = arr[left];
         arr[left] = arr[right];
         arr [right]= oldLeft;
         left++;
         right--;

      }
      System.out.println(toString1(arr));



    }

    public static String toString1(int[] arr) {
        String s = "";
             for( int i=0; i<arr.length;i++){
                s = s+" "+arr[i];
             }

        return s;

    }
  
}