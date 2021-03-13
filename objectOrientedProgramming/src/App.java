package objectOrientedProgramming.src;

// import objectOrientedProgramming.src.Car;

public class App {
    public static void main(String[] args) throws Exception {
        // Car ford = new Car();

        // Bank myAccount = new Bank(); empty constructor
        Bank myAccount = new Bank("1234", 500, "Brandon Phillips", "email@email.com", "4066716723");
        myAccount.deposit(200);
        myAccount.withdraw(500);
        myAccount.deposit(700);
        System.out.println(myAccount.getBalance());
    }
}
