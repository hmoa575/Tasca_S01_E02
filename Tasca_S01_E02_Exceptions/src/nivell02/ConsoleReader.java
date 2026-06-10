package nivell02;

import java.util.InputMismatchException;
import nivell02.exceptions.NotOnlyOneCharacterException;
import nivell02.exceptions.MinimumLengthException;
import nivell02.exceptions.NotValidBooleanException;

import java.util.Scanner;

public class ConsoleReader {

   private static final Scanner INDATA = new Scanner(System.in);

    // Metodes amb tractament d'InputMismatchException

    public static byte readByte(String message) {
        byte oneByte = 0;
        boolean error;
        do {
            error = false;
            System.out.println(message);
            try {
                oneByte = INDATA.nextByte();
                INDATA.nextLine();
            } catch (InputMismatchException exception) {
                System.out.println("Incorrect data: " + exception.getMessage());
                INDATA.nextLine();
                error = true;
            }
        } while (error);
        return oneByte;
    }

    public static void spendNextLine() {
        INDATA.nextLine();
    }

    public static int readInt(String message) {
        int oneInteger = 0;
        boolean error;
        do {
            error = false;
            System.out.println(message);
            try {
                oneInteger = INDATA.nextInt();
                INDATA.nextLine();
            } catch (InputMismatchException exception) {
                System.out.println("Incorrect data: " + exception.getMessage());
                INDATA.nextLine();
                error = true;
            }
        } while (error);
        return oneInteger;

    }

    public static float readFloat(String message) {
        float oneFloat = 0;
        boolean error;
        do {
            error = false;
            System.out.println(message);
            try {
                oneFloat = INDATA.nextFloat();
                INDATA.nextLine();
            } catch (InputMismatchException exception) {
                System.out.println("Incorrect data: " + exception.getMessage());
                INDATA.nextLine();
                error = true;
            }
        } while (error);
        return oneFloat;
    }

    public static double readDouble(String message) {
        double oneDouble = 0;
        boolean error;
        do {
            error = false;
            System.out.println(message);
            try {
                oneDouble = INDATA.nextDouble();
                INDATA.nextLine();
            } catch (InputMismatchException exception) {
                System.out.println("Incorrect data: " + exception.getMessage());
                INDATA.nextLine();
                error = true;
            }
        } while (error);
        return oneDouble;
    }


    //Metodes amb una excepció personalitzada


    // Only accepts a single character. If more than one is entered, it throws a custom exception.
    public static char readChar(String message){
        char string = ' ';
        boolean error;
        do {
            error = false;
            System.out.println(message);
            String text = INDATA.nextLine();
            try{
            if(text.length() == 1){
                string = text.charAt(0);
            }else {
                throw new NotOnlyOneCharacterException("Incorrect data (no one character): ");
            }
            } catch(NotOnlyOneCharacterException exception){
                System.out.println(exception.getMessage());
                error = true;
            }
        } while (error);
        return string;
    }

    // Reads a string as it is received, but you could validate minimum length or content if necessary.
    public static String readString(String message) {
        String text = "";
        boolean error;
        do {
            error = false;
            System.out.println(message);
            text = INDATA.nextLine();
            try {
                if (text.length() >= 6) {
                    return text;
                } else {
                    throw new MinimumLengthException("Type more than 6 characters.");
                }
                } catch(MinimumLengthException exception){
                    System.out.println(exception.getMessage());
                    error = true;
                }
        } while (error) ;
        return text;
    }


    // If the user enters “s” (lowercase), it returns true. If they enter “n”, it returns false.
// Any other input should generate a custom exception.
    public static boolean readYesNo(String message) {
        boolean result = false;
        boolean error;

        do {
            error = false;
            System.out.println(message);
            String text = INDATA.nextLine().trim().toLowerCase();
            try {
                if (text.equals("s")) {
                    return true;
                } else if (text.equals("n")) {
                    return false;
                } else {
                    throw new NotValidBooleanException("Invalid response: Type 's' for yes or 'n' for not.");}
                }catch(NotValidBooleanException exception){
                    System.out.println(exception.getMessage());
                    error = true;
                }
            } while (error) ;
            return result;
        }

    public static void close() {
        INDATA.close();
    }
}

