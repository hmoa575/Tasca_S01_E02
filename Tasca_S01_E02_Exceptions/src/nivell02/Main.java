package nivell02;

public class Main {
    public static void main(String[] args){
        System.out.println("=== ConsoleReader Test *****\n");

        byte age = ConsoleReader.readByte("Type your current age: ");
        System.out.println("Your age is: " + age + " years old.");

        int quantity = ConsoleReader.readInt("Type a quantity number, please: ");
        System.out.println("The quantity number is: " + quantity);

        float price = ConsoleReader.readFloat("Type an article price: ");
        System.out.println("The price is: " + price);

        double balance = ConsoleReader.readDouble("Type the balance: ");
        System.out.println("The balance is: " + balance);

        char character = ConsoleReader.readChar("Enter a single character: ");
        System.out.println("Character: " + character);

        String string = ConsoleReader.readString("Type your pet's name: ");
        System.out.println("Your pet's name is: " + string);

        boolean answer = ConsoleReader.readYesNo("Do you want exit from the application (s/n): ");
        System.out.println("Answer: " + ( answer? "Yes" : "No"));
        ConsoleReader.close();
    }
}
