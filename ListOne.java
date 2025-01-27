import java.util.ArrayList;

public class ListOne {
    public static void main(String[] args) {
        // Creating ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();  // Type-safe list
        
        // Adding elements
        numbers.add(1);                // append in Python
        System.out.println(numbers);
        numbers.add(0, 2);    // insert in Python
        System.out.println(numbers);

        
        // Accessing elements
        int first = numbers.get(0);    // numbers[0] in Python
        int last = numbers.get(numbers.size() - 1);  // numbers[-1] in Python
        
        // Removing elements
        numbers.remove(numbers.size() - 1);  // pop() in Python
        System.out.println(numbers);
        numbers.remove(Integer.valueOf(1));   // remove(1) in Python
        System.out.println(numbers);
        numbers.remove(0);             // del numbers[0] in Python
        System.out.println(numbers);
        System.out.println(numbers);
    }
    
}
