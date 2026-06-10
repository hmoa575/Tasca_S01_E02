Tasca_S01_E02_Exceptions

Technologies
Java --version 25

Project structure
.
├── README.MD
├── Tasca_S01_E02_Exceptions.iml
├── out
│   └── production
│       └── Tasca_S01_E02_Exceptions
│           ├── nivell01
│           │   ├── EmptySaleException.class
│           │   ├── Main.class
│           │   ├── Product.class
│           │   └── Sale.class
│           └── nivell02
│               ├── ConsoleReader.class
│               ├── Main.class
│               └── exceptions
│                   ├── MinimumLengthException.class
│                   ├── NotOnlyOneCharacterException.class
│                   ├── NotValidBooleanException.class
│                   ├── NotValidCharException.class
│                   └── NotValidStringException.class
└── src
├── nivell01
│   ├── EmptySaleException.java
│   ├── Main.java
│   ├── Product.java
│   └── Sale.java
└── nivell02
├── ConsoleReader.java
├── Main.java
└── exceptions
├── MinimumLengthException.java
├── NotOnlyOneCharacterException.java
└── NotValidBooleanException.java

Application setup.
Clone from github
git clone https://github.com/hmoa575/Tasca_S01_E02/tree/main/Tasca_S01_E02_Exceptions/src

Tasca Sprint 01 - Exercise 02 Description

Level 1 - Custom Exceptions and Error Handling
Description
This level simulates a simple sales system.
A sale may include multiple products, and the program must calculate the total sale amount.
If no products have been added, the program throws a custom exception to prevent an invalid calculation.
It also includes a test for IndexOutOfBoundsException to demonstrate how standard Java exceptions can be caught and handled.
Classes
Product
Represents a product with a name and a price.
Sale
Stores a list of products and calculates the total sale amount.
EmptySaleException
Custom exception thrown when trying to calculate the total of an empty sale.
Main
Tests the functionality of the level 1 classes, including.
calculating the total price
throwing and catching EmptySaleException
triggering and catching IndexOutOfBoundsException

Level 2 - Safe Keyboard Input Reading
Description
This level focuses on safe user input handling from the keyboard.
A utility class called ConsoleReader provides static methods to read different types of values safely.
If the user enters invalid data, the program catches the error, displays a message, and asks again until the input is correct.
Implemented Methods
Standard exception handling
readByte(String message)
readInt(String message)
readFloat(String message)
readDouble(String message)
These methods handle InputMismatchException.
Custom exception handling
readChar(String message)
readString(String message)
readYesNo(String message)
These methods use custom exceptions for validation rules not covered by standard Java exceptions.
Classes
ConsoleReader
Utility class with static methods for safe keyboard input reading.
Main
Tests all ConsoleReader methods with different data types.
MinimumLengthException
Custom exception thrown when the entered text is shorter than the required minimum length.
NotOnlyOneCharacterException
Custom exception thrown when the user enters more than one character in readChar().
NotValidBooleanException
Custom exception thrown when the user enters an invalid option in readYesNo().

