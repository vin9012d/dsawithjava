package string;

public class reverseString {
    



    public static void main(String[] args) {
        String st = "vinodbhai";

        for(int i=0; i <st.length();i++){
            char a = st.charAt(i);
            if(a == 'o' || a=='i' || a == 'a'|| a== 'u' || a == 'e'){
                continue;
            }
            System.out.print(a);
        }
    }
}
