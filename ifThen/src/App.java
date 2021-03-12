package ifThen.src;

public class App {
    public static void main(String[] args) throws Exception {
        boolean isAlien = true;
        boolean isBlue = false;

        if (!isAlien) {
            System.out.println("Not an alien");
        } else if (isAlien && isBlue) {
            System.out.println("It is a blue alien");
        } else {
            System.out.println("I am a non blue alien");
        }


        boolean isCar = false;

        boolean wasCar = isCar ? true : false; // ternary operator same as JS
    }
}
