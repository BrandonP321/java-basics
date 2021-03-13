package controlFlow.src;

public class App {
    public static void main(String[] args) {
        int switchValue = 1;

        switch (switchValue) {
            case 1: 
                break;
            case 2:
                break;
            case 3: case 4: case 5:
                break;
            default:
                break;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int count = 1;
        while (count != 5) {
            count++;
        }
    }
}
