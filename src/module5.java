import java.util.*;

/**

 This class reads a list of integer numbers from the scanned input and saves them into a Stack

 sorted from the smallest to the largest using the Collections Framework.
 */
public class module5 {

    /**

     The main method of the program.

     @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter a list of integers (space-separated): ");
        String input = scanner.nextLine();

        // Split the input string into individual integers
        String[] numbers = input.split(" ");

        // Convert and add each number to the stack
        for (String number : numbers) {
            try {
                int num = Integer.parseInt(number);
                stack.push(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + number);
            }
        }

        // Sort the stack in ascending order
        Collections.sort(stack);

        // Print the sorted stack
        System.out.println("Sorted Stack:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
