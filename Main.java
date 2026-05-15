/*
 * The program will demonstrate the use of a bag class.
 *  - Create an instance of the Bag class.
 *  - Add several elements to the bag, including duplictes.
 *  - Test the 'contains & count' method for a few elements.
 *  - remove an element from the bag.
 *  - Print the bag contents again.
 *  - Test  the 'contains & count' method for the removed element.
*/

public class Main { 
    public static void main(String[] args) {
        String searchWord = "Aaple";
        String countWord = "Banana";
        Bag<String> basket = new Bag<>();
        basket.add("Aaple");
        basket.add("Orange");
        basket.add("Pear");
        basket.add("Banana");
        basket.add("Banana");
        System.out.println("Test Contains the searchWord :" + searchWord);
        System.out.println("Does it have the containWord:" + basket.contains(searchWord));
        System.out.println("Test count the countWord : " + countWord);
        System.out.println("Counter: " + basket.count(countWord) );
        System.out.println("Bag Contents:");
        for (String item : basket) {
            System.out.println(item);
        }
        System.out.println("Removing  the searchWord");
        basket.remove(searchWord);
        System.out.println("Adding another countWord");
        basket.add(countWord);
        System.out.println("Test Contains the searchWord :" + searchWord);
        System.out.println("Does it have the containWord:" + basket.contains(searchWord));
        System.out.println("Test count the countWord : " + countWord);
        System.out.println("Counter: " + basket.count(countWord) );
        System.out.println("Bag Contents:");
        for (String item : basket) {
            System.out.println(item);
        }
    }
}