package interfaces.src;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int number) {
        this.myNumber = number;
        this.isRinging = false;
    }

    @Override
    public void answer() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void dial(int phoneNumber) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean isRinging() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void powerOn() {
        // TODO Auto-generated method stub
        
    }
}
