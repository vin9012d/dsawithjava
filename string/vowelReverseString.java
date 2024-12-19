package string;

public class vowelReverseString {
    

    public static void main(String[] args) {
     
     String st = "WELCOMETOMASAI";
     int start =0;
     int end = st.length()-1;
     boolean seflag = false;
     boolean scflag = false;
     char[] charArr = st.toCharArray(); // createing chareacter array for ease of swapping
     
       while (start < end) {
       
        char sc = st.charAt(start);
        char se = st.charAt(end);

        if(sc == 'A' || sc =='I' || sc == 'O' || sc =='E' || sc == 'U'){
scflag = true;
        }else{
       start++;
        }
        if(se == 'A' || se =='I' || se == 'O' || se =='E' || se == 'U'){
     seflag = true;
        }else{
      end--;
        }
        System.out.println("start"+start +" end"+end);

        if(scflag == true && seflag == true){
            
           char med = st.charAt(start);
           charArr[start]= charArr[end];
           charArr[end] = med;
            
          start++;
          end--;
        }
          
        
       }
  
     for(char s: charArr){
        System.out.print(s);
     }
     

    }
}
