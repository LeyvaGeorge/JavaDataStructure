/* 
 * Methods Needed: void add (T item), void remove (T item),  boolean contains (T item), and int count(T item)
 * The program will demonstrate the use of a bag class.
 *  - Create an instance of the Bag class.
 *  - Add several elements to the bag, including duplictes.
 *  - Test the 'contains & count' method for a few elements.
 *  - remove an element from the bag.
 *  - Print the bag contents again.
 *  - Test  the 'contains & count' method for the removed element.
 */
import java.util.ArrayList;

public class Bag<T> {
    private ArrayList<T> items;

    //Constructor
    public Bag() {
        items = new ArrayList<>();
    }

    // === Methods ===
    //Add item to ArrayList
    public void add(T item) {
        this.items.add(item);
    }
    // remove the first item that matches in items Arraylist
    public void remove(T item) {
        this.items.remove(item);
    }
    
    //checks to see if the item is in the ArrayList
    public boolean contains(T item) {
        return this.items.contains(item);
    }

    //counts the number of times item shows up
    public int count (T item) {
        int counter = 0;
        for (T element : this.items) {
            if (element == item) {
                counter += 1;
            }
        }
        return counter;
    }
}
