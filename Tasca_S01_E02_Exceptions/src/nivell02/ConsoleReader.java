package nivell02;

import java.util.InputMismatchException;
import nivell02.exceptions.NotOnlyOneCharacterException;
import nivell02.exceptions.MinimumLengthException;
import nivell02.exceptions.NotValidBooleanException;

import java.util.Scanner;

public class ConsoleReader {

    static Scanner inData = new Scanner(System.in);

    // Metodes amb tractament d'InputMismatchException

    public static byte readByte(String message) {
        byte oneByte;
        boolean error;
        do {
            error = false;
            System.out.println(message);
            try {
                oneByte = inData.nextByte();
                return oneByte;
            } catch (InputMismatchException exception) {
                System.out.println("Incorrect data: " + exception.getMessage());
                inData.nextLine();
                error = true;
            }
        } while (error);
        return 0;
    }

    public static void spendNextLine() {
        inData.nextLine();
    }

    public static int readInt(String message) {
        int oneInteger;
        boolean error;
        do {
            error = false;
            System.out.println(message);
            try {
                oneInteger = inData.nextInt();
                return oneInteger;
            } catch (InputMismatchException exception) {
                System.out.println("Incorrect data: " + exception.getMessage());
                inData.nextLine();
                error = true;
            }
        } while (error);
        return 0;

    }

    public static float readFloat(String message) {
        float oneFloat;
        boolean error;
        do {
            error = false;
            System.out.println(message);
            try {
                oneFloat = inData.nextFloat();
                return oneFloat;
            } catch (InputMismatchException exception) {
                System.out.println("Incorrect data: " + exception.getMessage());
                inData.nextLine();
                error = true;
            }
        } while (error);
        return 0;
    }

    public static double readDouble(String message) {
        double oneDouble;
        boolean error;
        do {
            error = false;
            System.out.println(message);
            try {
                oneDouble = inData.nextDouble();
                return oneDouble;
            } catch (InputMismatchException exception) {
                System.out.println("Incorrect data: " + exception.getMessage());
                inData.nextLine();
                error = true;
            }
        } while (error);
        return 0;
    }


    //Metodes amb una excepció personalitzada


    // Only accepts a single character. If more than one is entered, it throws a custom exception.
    public static char readChar(String message){
        boolean error;
        do {
            error = false;
            System.out.println(message);
            String string = inData.nextLine();
            try{
            if(string.length() == 1){
                return string.charAt(0);
            }else {
                throw new NotOnlyOneCharacterException("Incorrect data (no one character): ");
            }
            } catch(NotOnlyOneCharacterException exception){
                System.out.println(exception.getMessage());
                error = true;
            }
        } while (error);
        return ' ';
    }

    // Reads a string as it is received, but you could validate minimum length or content if necessary.
    public static String readString(String message) {
        boolean error;
        do {
            error = false;
            System.out.println(message);
            String string = inData.nextLine();
            try {
                if (string.length() >= 6) {
                    return string;
                } else {
                    throw new MinimumLengthException("Type more than 6 characters.");
                }
                } catch(MinimumLengthException exception){
                    System.out.println(exception.getMessage());
                    error = true;
                }
        } while (error) ;
        return "";
    }


    // If the user enters “s” (lowercase), it returns true. If they enter “n”, it returns false.
// Any other input should generate a custom exception.
    public static boolean readYesNo(String message) {

        boolean error;

        do {
            error = false;
            System.out.println(message);
            String string = inData.nextLine().trim().toLowerCase();
            try {
                if (string.equals("s")) {
                    return true;
                } else if (string.equals("n")) {
                    return false;
                } else {
                    throw new NotValidBooleanException("Invalid response: Type 's' for yes or 'n' for not.");}
                }catch(NotValidBooleanException exception){
                    System.out.println(exception.getMessage());
                    error = true;
                }
            } while (error) ;
            return false;
        }

    public static void close() {
        inData.close();
    }
}

