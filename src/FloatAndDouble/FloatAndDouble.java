package FloatAndDouble;

/**
 * Created by daniel on 5/31/17.
 */
public class FloatAndDouble {
    public static void main(String[] args) {
        // width of int = 32 (4 bytes).
        int myIntValue = 5;
        // width of float = 32 (4bytes).
        float myFloatValue = 5.4F / 3F;
        // width of double 64 (8 bytes).
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double numberOfPounds = 100;
        double convertedKilograms = numberOfPounds * 0.45359237;
        System.out.println("Kilograms = " + convertedKilograms);
        // 45.3592
        double pi = 3.14159;

    }
}
