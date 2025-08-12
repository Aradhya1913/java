import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample{
    public static void main(String[] args) {

        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        Gap.bar();
        System.out.println("Array List = : " + list);
        
        // Or using List.of (Java 9+)
        list.addAll(List.of(6, 7, 8));
        System.out.println("Array After adding more values: " + list);


        System.out.println("Element at index 1 = "+list.get(1));       // Access by index

        list.remove(7);                                                // Remove by index
        list.remove(Integer.valueOf(7));                                   // Remove by value
        System.out.println("Elements after removing items"+list);            // Print ArrayList
        System.out.println("Number of elements ---  "+list.size());          // Number of elements
        Collections.sort(list);                                              // Ascending order
        System.out.println("Sorted List"+list);                              // Print ArrayList
        list.clear();                                                        // clear all element
        System.out.println("Array after Clearinging "+list);                 // Print ArrayList
        Gap.bar();


    }
}