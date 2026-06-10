# Tasca S01 E02 - Exceptions

Java exercises focused on exception handling, custom exceptions, and safe user input.

## Technologies

- Java 25

Check your installed Java version with:

```bash
java --version
```

## Repository Structure

```text
Tasca_S01_E02/
├── README.MD
└── Tasca_S01_E02_Exceptions/
    ├── Tasca_S01_E02_Exceptions.iml
    ├── src/
    │   ├── nivell01/
    │   │   ├── EmptySaleException.java
    │   │   ├── Main.java
    │   │   ├── Product.java
    │   │   └── Sale.java
    │   └── nivell02/
    │       ├── ConsoleReader.java
    │       ├── Main.java
    │       └── exceptions/
    │           ├── MinimumLengthException.java
    │           ├── NotOnlyOneCharacterException.java
    │           └── NotValidBooleanException.java
    └── out/
        └── production/
            └── Tasca_S01_E02_Exceptions/
                ├── nivell01/
                └── nivell02/
```

## Setup

Clone the repository:

```bash
git clone https://github.com/hmoa575/Tasca_S01_E02.git
```

Open the project in IntelliJ IDEA or another Java IDE.

## Task Description

This project belongs to Sprint 01 - Exercise 02 and focuses on Java exception handling.

The main goal is to build more robust applications by preventing crashes caused by invalid input or incorrect operations.

The project covers:

- standard exception handling
- custom exception creation
- input validation
- separation of responsibilities
- clean code practices

## Level 1 - Custom Exceptions and Error Handling

This level simulates a simple sales system.

A sale may include several products, and the application must calculate the total sale amount. If no products have been added, the program throws a custom exception to prevent an invalid calculation.

It also includes a test for `IndexOutOfBoundsException` to show how standard Java exceptions can be caught and handled.

### Classes

#### `Product`
Represents a product with a name and a price.

#### `Sale`
Stores a list of products and calculates the total sale amount.

#### `EmptySaleException`
Custom exception thrown when trying to calculate the total of an empty sale.

#### `Main`
Tests the functionality of Level 1, including:
- calculating the total price
- throwing and catching `EmptySaleException`
- triggering and catching `IndexOutOfBoundsException`

## Level 2 - Safe Keyboard Input Reading

This level focuses on safe user input from the keyboard.

A utility class called `ConsoleReader` provides static methods to safely read different data types. If the user enters invalid data, the application catches the error, shows a message, and asks again until the input is correct.

### Implemented Methods

#### Standard exception handling
- `readByte(String message)`
- `readInt(String message)`
- `readFloat(String message)`
- `readDouble(String message)`

These methods handle `InputMismatchException`.

#### Custom exception handling
- `readChar(String message)`
- `readString(String message)`
- `readYesNo(String message)`

These methods use custom exceptions for rules not covered by standard Java exceptions.

### Classes

#### `ConsoleReader`
Utility class with static methods for safe keyboard input reading.

#### `Main`
Tests all `ConsoleReader` methods with different data types.

#### `MinimumLengthException`
Thrown when the entered text is shorter than the required minimum length.

#### `NotOnlyOneCharacterException`
Thrown when the user enters more than one character in `readChar()`.

#### `NotValidBooleanException`
Thrown when the user enters an invalid option in `readYesNo()`.

## How to Run

Compile the project:

```bash
javac Tasca_S01_E02_Exceptions/src/nivell01/*.java Tasca_S01_E02_Exceptions/src/nivell02/*.java Tasca_S01_E02_Exceptions/src/nivell02/exceptions/*.java
```

Run Level 1:

```bash
java -cp Tasca_S01_E02_Exceptions/src nivell01.Main
```

Run Level 2:

```bash
java -cp Tasca_S01_E02_Exceptions/src nivell02.Main
```
