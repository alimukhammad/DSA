import java.util.ArrayList;
import java.util.Collections;

public class ArrayDSA2 {
    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);
        System.out.println("Before sorting list:");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("after sorting list:");
        System.out.println(list);
    }
}


// Initialization: Understand how to initialize an ArrayList. You can create an empty ArrayList with ArrayList<E> list = new ArrayList<>(); where E is the type of elements in the list.

// Adding Elements: Use the add method to add elements to the ArrayList. For example, list.add(1); adds the integer 1 to the list.

// Accessing Elements: Use the get method to access elements at a specific index in the ArrayList. For example, list.get(0); gets the first element in the list.

// Modifying Elements: Use the set method to change the element at a specific index. For example, list.set(0, 2); changes the first element in the list to 2.

// Removing Elements: Use the remove method to remove elements at a specific index or the first occurrence of a specific object. For example, list.remove(0); removes the first element in the list.

// Iterating Over Elements: Use a for-each loop or iterator to go through each element in the ArrayList. For example, for (Integer i : list) { System.out.println(i); } prints each element in the list.

// Sorting: Use Collections.sort(list); to sort the elements in the list in ascending order. If you need to sort in a different order or according to specific criteria, you may need to implement a Comparator.

// Searching: Use Collections.binarySearch(list, key); to find the index of an element in a sorted ArrayList. If the list is not sorted, you can use list.indexOf(object); to find the index of an object.

// Size: Use list.size(); to get the number of elements in the ArrayList.

// Checking if Empty: Use list.isEmpty(); to check if the ArrayList is empty.