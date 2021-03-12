package charBoolean.src;

public class App {
    public static void main(String[] args) {
        
        char myChar = 'D'; // char can only store a single character
        char unicodeChar = '\u0044'; // unicode for 'D'
        System.out.println(myChar);
        System.out.println(unicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean truth = true;
        boolean falsey = false;


        String myString = "This is a string";
        System.out.println(myString);

        myString = myString + ", and now I've added more to it";
        System.out.println(myString);

        myString = myString + " \u00A9 2019";
        System.out.println(myString);

        String numString = "250.55";
        numString = numString + "49.95"; // will concatenate the two strings
        System.out.println(numString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // will try to convert int to a string
        System.out.println(lastString);
    }
}
