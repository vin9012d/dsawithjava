package string;

import java.util.ArrayList;

public class removeConsecutive {

    public static void main(String[] args) {

        solve("avviinnoodddhg", 2);

    }

    public static void solve(String A, int B) {

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < A.length(); i++) {
            boolean flag = false;
            if (list.size() < B) {
                list.add(A.charAt(i));

                flag =true;

            } 
            if (flag == false ) {
                  list.add(A.charAt(i));  
            }
            
          
                if (list.size() >= 2 &&  canWeRemove(list, A, B)) {
                    System.out.println("boolean" + B);
                    int length = list.size() - 1;
                    for (int j = 0; j < B; j++) {
                        System.out.println("removing element");
                        list.remove(length - j);

                    }
                }
                
    
            

                 

            System.out.println(list);

        }

        System.out.println(list);

    }

    public static Boolean canWeRemove(ArrayList<Character> list, String A, int B) {
        char end = list.get(list.size()-1);
        int length = list.size() - 1;

        for (int i = 0; i < B; i++) {

            if (list.get(length - i) == end) {

                continue;

            } else
                return false;

        }

        return true;
    }

}