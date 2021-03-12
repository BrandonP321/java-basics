package hello.src;

public class hello {
    public static void main(String[] args) { // main method is the entry point of any java code
        System.out.println("Hello World");

        int age = 20;
        System.out.println("I am " + age);

        int numOne = 10;
        int numTwo = 12;
        int numThree = 6;
        int myTotal = numOne + numTwo * numThree;

        int lastNum = 1000 - myTotal;
        
        System.out.println(myTotal);
        System.out.println(lastNum);
    }
}
