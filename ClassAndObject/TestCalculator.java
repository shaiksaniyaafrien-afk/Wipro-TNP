package ClassAndObject;

public class TestCalculator {

    public static void main(String[] args) {

        System.out.println("Power (int) = " +
                Calculator.powerInt(2, 5));

        System.out.println("Power (double) = " +
                Calculator.powerDouble(2.5, 3));
    }
}

/*
Compile the Code : javac ClassAndObject\*.java
Run the Code-
    To run the Box program: java ClassAndObject.TestBox
    To run the Calculator program: java ClassAndObject.TestCalculator 
 */