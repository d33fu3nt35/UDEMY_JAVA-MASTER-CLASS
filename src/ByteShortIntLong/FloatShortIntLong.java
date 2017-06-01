package ByteShortIntLong;

/**
 * Created by daniel on 5/31/17.
 */
public class FloatShortIntLong {
    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue / 2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = 127;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = -32768;
        short myNewShortValue = (short) (myShortValue / 2);

        // long has a width of 64
        long myLongValue = 100L;
        long bigLongValue = 50000 + 10 * (myNewByteValue + myNewShortValue + myTotal);
        System.out.println("bigLongValue = " + bigLongValue);

    }
}
