package interfaces.src;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int number) {
        this.myNumber = number;
        this.isRinging = false;
    }

    @Override
    public void answer() {
        // TODO Auto-generated method stub
        System.out.println("Answering mobile phone");
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void dial(int phoneNumber) {
        // TODO Auto-generated method stub
        if (!this.isOn) {
            System.out.println("Must turn on phone to dial");
            return;
        }
        System.out.println("Dialing");
    }
    @Override
    public boolean isRinging() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void powerOn() {
        // TODO Auto-generated method stub
        this.isOn = true;
        System.out.println("Mobile Phone powered on");
    }
}
