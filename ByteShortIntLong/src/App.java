package ByteShortIntLong.src;

public class App {
    public static void main(String[] args) {
        
        int minInt = Integer.MIN_VALUE;
        int manInt = Integer.MAX_VALUE;

        System.out.println(minInt);
        System.out.println(manInt);

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minByte);
        System.out.println(maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println(minShort);
        System.out.println(maxShort);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println(minLong);
        System.out.println(maxLong);
        long myLongValue = 100L; // value must be followed by 'l' or 'L' (forces java to treat the number as a long)

        // short bigShort = 999999; // error thrown if number doesn't fit in data type

        
        int myTotal = (minInt / 2);
        byte testByte = 2;
        byte myByte = (byte) (minByte / 2); // number must be converted into a byte

        short myShort = (short) (minShort / 2); // same for short (java uses int be default unless we specify the type)


        byte anotherByte = 12;
        short anotherShort = 30000;
        int anotherInt = 404;
        //                              defaults to an integer value
        long lastLong = 50000L + 10L * (anotherByte + anotherShort + anotherInt); // use of the L removes need of '(long)'
        System.out.println(lastLong);


        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println(minFloat);
        System.out.println(maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        float myFloat = 5;
        double myDouble = 5; // no errors when assigning integer values
        float mySecondFloat = 5.5f; // requires 'f' since default type for decimal is double
        double mySecondDouble = 5.5; // 'd' not required since default type is double but is a good practice to add it 
        // double is the preferred data type these days for decimal values

        int divInt = 2 / 5; // 2; interger division
        float divFloat = 5f / 2f; // 2.5; float division
        double divDouble = 5d / 2d; // 2.5; similar to float division
        double oneMore = 5.00 / 2.00; // double type is implied

        double pounds = 200d;
        double kilos = pounds * 0.45359237d; // 'd' not needed since is already a double type
        System.out.println(kilos);

        double pi = 3.1415927d;
        double anotherDouble = 3_000_000.4_567_004d; // '_' optional for formatting during development
    }
}
