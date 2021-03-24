package AutoboxingUnboxing.src;

import java.lang.reflect.Array;
import java.util.ArrayList;

// class IntClass {
//     private int value;

//     public IntClass(int value) {
//         this.value = value;
//     }

//     public int getValue() {
//         return this.value;
//     }

//     public void setValue(int value) {
//         this.value = value;
//     }
// }

public class App {
    public static void main(String[] args) throws Exception {
        String[] strArr = new String[10];
        int[] intArr = new int[10];

        ArrayList<String> strArrList = new ArrayList<String>();
        strArrList.add("Brandon");

        // Integer myInt = new Integer(5); // deprecated since Java 9
        Integer myInt = Integer.valueOf(5); // Integer creates a class rather than using the int primitive data type
        ArrayList<Integer> myList = new ArrayList<Integer>(); // creates array that can store integers
        myList.add(myInt); // can pass in value created with Integer constructor
        myList.add(7); // can also pass regular int values (will be autoboxed into the Integer class)
        System.out.println(myList);

        Double myDouble = Double.valueOf(10);
        ArrayList<Double> otherList = new ArrayList<Double>();
        otherList.add(myDouble);
        otherList.add(5d); // one method for passing a double
        otherList.add(5.0); // defaults to type double

        Integer someInt = 5; // can be defined like this but gets compiled to Integer.valueOf(5) at runtime
        int unboxedInt = someInt; // someInt is now stripped down to a primitive type of int (unboxing)
        int hereIsHow = someInt.intValue(); // this is what is happening at run time for the above variable assignment (unboxing)
        Double someDouble = 10d;
        Double anotherDouble = 10.0;
        double unboxedDouble = anotherDouble;
        double unboxedDoubleTwo = anotherDouble.doubleValue();
    }
}
