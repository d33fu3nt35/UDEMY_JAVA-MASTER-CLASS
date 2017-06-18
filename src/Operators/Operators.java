package Operators;

/**
 * Created by daniel on 6/3/17.
 */
public class Operators {
    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(" - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("It is not an alien!");
        else if (isAlien == true)
            System.out.println("Its an alien!!");

        int topScore = 80;
        if(topScore == 100)
            System.out.println("High Score!!!");
        else if (topScore != 100)
            System.out.println("Sorry, you lose!");

        int secondTopscore = 95;
        if((topScore > secondTopscore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100!");

        if((topScore > 90)  || (secondTopscore <= 90))
            System.out.println("One of these tests is true!");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true!");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not suppose to happen!");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true!");

        // Exercise Start!

        double extwenty = 20;
        double exeighty = 80;

        double exresult = extwenty + exeighty;
        double initialresult = exresult;
        initialresult =  exresult * 25;
        System.out.println("Initial Result = " + initialresult);
        initialresult = exresult % 40;
        System.out.println("Remainder is = " + initialresult);
        if(initialresult <= 20)
            System.out.println("Total was over the limit!");




    }
}
