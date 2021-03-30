package linkedLists.src;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer("Time", 54.93);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println(customer.getBalance());
        System.out.println(anotherCustomer.getBalance());


        LinkedList<String> placestoVisit = new LinkedList<String>();
        addInOrder(placestoVisit, "Seattle");
        addInOrder(placestoVisit, "Denver");
        addInOrder(placestoVisit, "New York");
        // placestoVisit.add(1, "Florida");
        // placesToVisit.remove(2);
        printList(placestoVisit);

        System.out.println(placestoVisit.size());
    }

    private static void printList(LinkedList<String> list) {
        Iterator<String> i = list.iterator(); // create iterator for list
        while (i.hasNext()) {
            System.out.println(i.next()); // log next value in list
        }
    }

    private static boolean addInOrder(LinkedList<String> list, String newCity) {
        // provides more options than normal Iterator
        ListIterator<String> i = list.listIterator();

        while (i.hasNext()) {
            int comparison = i.next().compareTo(newCity);
            if (comparison == 0) {
                // 0 -> iterator matches newCity
                System.out.println(newCity + "is already in list");
                return false;
            } else if (comparison > 0) {
                // > 0 -> newCity should appear before iterator
                i.previous(); // must move back one since we called next() already
                i.add(newCity); // add newCity at current location
                return true;
            } else {
                // < 0 -> newCity should appear after iterator
                i.next(); // move on to next iteration
            }
        }

        // if no suitable spot was found for newCity, append it to end of list
        i.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities) {
        ListIterator<String> iter = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Now visiting " + iter.next());
    }
}
