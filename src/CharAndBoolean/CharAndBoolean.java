package CharAndBoolean;

/**
 * Created by daniel on 5/31/17.
 */
public class CharAndBoolean {
    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output is: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char registeredSign = '\u00AE';
        System.out.println("Registered Unicode output is: " + registeredSign);
    }
}
