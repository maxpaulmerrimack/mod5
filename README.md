# Module5

Module5 is a Java program that reads a list of integer numbers from the user input and saves them into a Stack. The program then sorts the Stack in ascending order using the Collections Framework and displays the sorted Stack.

## Usage

To use the Module5 program, follow these steps:

1. Compile the Java source file:

   ```shell
   javac module5.java
   ```

2. Run the compiled program:

   ```shell
   java module5
   ```

3. Enter a list of integers when prompted, separating each number by a space.

4. The program will then display the sorted Stack containing the entered integers.

   Example:
   ```
   Enter a list of integers (space-separated): 9 5 2 7 1
   Sorted Stack:
   1 2 5 7 9
   ```

Note: If an invalid number is entered (non-integer), the program will display an error message and continue with the next number.

## Dependencies

This program uses the following import:

```java
import java.util.*;
```

The import statement allows the usage of classes from the `java.util` package, such as `Scanner`, `Stack`, and `Collections`.

## Method

### main

The `main` method is the entry point of the program. It performs the following steps:

1. Creates a new `Scanner` object to read user input.
2. Creates a new `Stack` object to store the integer numbers.
3. Prompts the user to enter a list of integers.
4. Reads the input line and stores it in the `input` variable.
5. Splits the input string into individual numbers using the space character as a delimiter.
6. Converts each number from a string to an integer and pushes it onto the stack.
7. If an invalid number (non-integer) is encountered, it displays an error message.
8. Sorts the stack in ascending order using the `Collections.sort` method.
9. Prints the sorted stack by popping elements from the stack.

## License

This program is released under the [MIT License](LICENSE). Feel free to modify and use it as needed.