package oopsconcepts;
import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {

		
		        ArrayList<String> list = new ArrayList<>();

		        list.add("Apple");
		        list.add("Banana");
		        list.add("Orange");
		        list.add("Apple"); // Duplicate element

		        // Displaying the ArrayList
		        System.out.println("ArrayList: " + list);

		        // Accessing an element
		        System.out.println("Element at index 1: " + list.get(1));

		        // Removing an element
		        list.remove("Banana");
		        System.out.println("ArrayList after removing 'Banana': " + list);
		        list.add("cherry");
		        System.out.println("ArrayList after adding 'cherry': " + list);
		        //queue
		        Queue<String> queue = new LinkedList<>();

		        // Adding elements
		        queue.add("First");
		        queue.add("Second");
		        queue.add("Third");

		        // Displaying the Queue
		        System.out.println("Queue: " + queue);

		        // Removing the first element
		        queue.poll();
		        System.out.println("Queue after polling: " + queue);

		        // Peeking at the first element
		        System.out.println("First element in the queue: " + queue.peek());
		        
		        //hashset
		        HashSet<String> set = new HashSet<>();

		        // Adding elements
		        set.add("Apple");
		        set.add("Banana");
		        set.add("Banana");
		        set.add("Apple"); // Duplicate element, will be ignored

		        // Displaying the HashSet
		        System.out.println("HashSet: " + set);
		        
		        //hashmap
		        HashMap<Integer, String> map = new HashMap<>();

		        // Adding key-value pairs
		        map.put(1, "One");
		        map.put(2, "Two");
		        map.put(3, "Three");

		        // Displaying the HashMap
		        System.out.println("HashMap: " + map);

		        // Accessing a value by key
		        System.out.println("Value for key 2: " + map.get(2));

		        // Removing a key-value pair
		        map.remove(1);
		        System.out.println("HashMap after removing key 1: " + map);

		    

	}

}
