package objectOrientedProgramming.src;

public class Bank {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Bank() {
        // can call a different constructor function (maybe we want to assign some default parameters)
        this("1234", 0.00, "John Doe", "email@email.com", "123456789"); // must be first thing called in constructor
        System.out.println("Empty constructor called");
    }

    
    public Bank(String accountNumber, String name) {
        this(accountNumber, 0, name, "N/A", "N/A");
        // typically there is one constructor for initializing fields, other constructors just call that constructor with default values
    } 

    public Bank(String accountNumber, double balance, String name, String email, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    
    public void deposit(double amount) {
        setBalance(this.balance + amount);
        System.out.println("New amount: " + this.balance);
    }

    public void withdraw(double amount) {
        double newBalance = this.balance - amount;
        if (newBalance >= 0) {
            setBalance(newBalance);
            System.out.println(amount + " successfully withdrawn. Remaining balance = " + this.balance);
        } else {
            System.out.println("Cannot withdraw more money than is in bank");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
