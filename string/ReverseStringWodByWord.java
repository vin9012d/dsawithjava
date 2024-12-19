// Reverse the String
// Problem Description

// You are given a string A of size N.


// Return the string A after reversing the string word by word.

// NOTE:

// A sequence of non-space characters constitutes a word.
// Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
// If there are multiple spaces between words, reduce them to a single space in the reversed string.


 package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class ReverseStringWodByWord {

    public static void main(String[] args) {
        
        String st = "Sky is blue";
        String as ="";
        String[] array = st.trim().split("\\s+");

        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList(array));

        Collections.reverse(stringArray);
        for(int i =0 ; i<stringArray.size(); i++){
            as = as +" "+ stringArray.get(i);
        }

        System.out.println(as);




    }
    
}
