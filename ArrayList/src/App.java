package ArrayList.src;

public class App {
    public static void main(String[] args) throws Exception {
        GroceryList myList = new GroceryList();
        myList.addItem("milk");
        myList.addItem("Eggs");
        myList.addItem("Bread");
        myList.printList();
        myList.removeItem(1);
        myList.printList();
        myList.addItem("Butter");
        System.out.println(myList.findItem("Bread"));
    }
}