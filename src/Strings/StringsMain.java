package Strings;

/**
 * Created by daniel on 6/3/17.
 */
public class StringsMain {
    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string!";
        System.out.println(myString);
        myString = myString + " And this is extra..";
        System.out.println(myString);

        String numberString = " 250.55";
        numberString = numberString + "49.95";
        System.out.println("Result: " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to: " + lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);

    }
}
