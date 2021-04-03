package interfaces.src;

public class App {
    public static void main(String[] args) throws Exception {
        ITelephone myPhone;
        myPhone = new DeskPhone(1234567);
        myPhone.powerOn();

        // we can reassign myPhone to MobilePhone instance because 
        // MobilePhone and DeskPhone both implement the ITelephone interface.
        myPhone = new MobilePhone(1238990);

        DeskPhone yourPhone = new DeskPhone(9103938);
        // yourPhone = new MobilePhone(9832); -> won't work since yourPhone is purely of type DeskPhone
    }
}
