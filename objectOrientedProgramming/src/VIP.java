package objectOrientedProgramming.src;

public class VIP {
    private String name;
    private int creditLimit;
    private String email;
    
    public VIP(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VIP(String name, String email) {
        this(name, 500, email);
    }

    public VIP() {
        this("John Doe", 500, "no@email.com");
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCreditLimit() {
        return creditLimit;
    }
    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
