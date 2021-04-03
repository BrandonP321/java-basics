package interfaces.src;

public interface ITelephone {
    void powerOn(); // access modifier not required if public
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
