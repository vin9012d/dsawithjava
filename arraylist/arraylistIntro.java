package arraylist;

import java.util.ArrayList;

public class arraylistIntro {


/*Array:

A fixed-size data structure to store elements of the same type.
The size must be defined when it is created and cannot change dynamically.
Can store both primitives (e.g., int, char) and objects (e.g., String, custom classes).
Faster for direct access as it doesn't involve any overhead of dynamic resizing or type-checking.
Does not provide built-in methods for operations like adding, removing, or searching for elements.
Uses less memory because it doesn't maintain additional metadata or allow resizing.




ArrayList:

A resizable array-like data structure provided by the Java java.util package.
Automatically adjusts its size when elements are added or removed.
Can only store objects (not primitives directly). Primitives like int are auto-boxed into their wrapper classes (Integer, Double, etc.).
Slightly slower because of additional overhead for resizing, boxing/unboxing, and internal operations.
Provides many built-in methods like add(), remove(), size(), contains(), etc.
Uses more memory due to dynamic resizing and maintaining additional data like capacity and size.




*/
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // different way of intializing arrayList https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
         
    // add operation 
    list.add(1);
    list.add(2);

    // add at index

    list.add(1,20);
    System.out.println(list);  // 1 20 2

    // get element

     int a =list.get(2);   // auto unboxing boxing think? 
     System.out.println(a); // 2

     // set for update the value

     list.set(0, 8); // 8 20 1

     System.out.println(list);

     // remove at a index;

     list.remove(1);

     // size

     list.size();
     
    }
    
}
