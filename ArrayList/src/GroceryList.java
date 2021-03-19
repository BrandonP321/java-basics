package ArrayList.src;
import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item) {
        groceryList.add(item);
    }

    public void printList() {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }

    public void modifyList(int index, String item) {
        groceryList.set(index, item);
    }

    public void removeItem(int index) {
        String removedItem = groceryList.get(index);
        groceryList.remove(index);

        System.out.println(removedItem + " removed");
    }

    public int findItem(String key) {
        int index = groceryList.indexOf(key);
        return index != -1 ? index : null;
    }

    public ArrayList<String> getList() {
        return this.groceryList;
    }

    public String[] convertToArray() {
        String[] newArray = new String[getList().size()]; // initialize new array of same length as grocery list
        newArray = getList().toArray(newArray); // copy list into new array;
        return newArray;
    }
}