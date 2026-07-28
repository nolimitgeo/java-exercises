package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Type Casting
 *
 * Learn how to convert between different data types in Java.
 * Widening (implicit): smaller type -> larger type (e.g., int -> double)
 * Narrowing (explicit): larger type -> smaller type (e.g., double -> int)
 */
public class TypeCasting {

    public static void main(String[] args) {

        // TODO: 1 - Widen an int to a double (implicit casting)
        // Declare an int variable with any value, then assign it to a double variable.
        // Print both variables to see the result.
        int numOne = 10;
        double numTwo = numOne;

        System.out.println(numOne);
        System.out.println(numTwo);

        // TODO: 2 - Narrow a double to an int (explicit casting)
        // Declare a double variable (e.g., 9.78), then cast it to an int.
        // Print both variables to see what happens to the decimal part.
        double numThree = 5.67;
        int numFour = (int) numThree;
        System.out.println(numThree);
        System.out.println(numFour);

        // TODO: 3 - Cast an int to a char to get the character it represents
        // Hint: int value 65 corresponds to 'A' in ASCII
        // Print the resulting char.
        int numFive = 65;
        char charOne = (char) numFive;
        System.out.println(charOne);


        // TODO: 4 - Cast a char to an int to get its ASCII value
        // Hint: char 'Z' has an ASCII value of 90
        // Print the resulting int.
        char charTwo = 'Z';
        int numSix = (int) charTwo;
        System.out.println(numSix);

        // TODO: 5 - Convert a String "42" to an int using Integer.parseInt()
        // Declare a String variable with the value "42", then parse it to an int.
        // Print the result.
        String stringOne = "42";
        int numSeven = Integer.parseInt(stringOne);
        System.out.println(numSeven);

        // TODO: 6 - Convert an int 42 to a String using String.valueOf()
        // Declare an int variable with the value 42, then convert it to a String.
        // Print the result.
        int numEight = 42;
        String stringTwo = String.valueOf(numEight);
        System.out.println(stringTwo);
    }
}
