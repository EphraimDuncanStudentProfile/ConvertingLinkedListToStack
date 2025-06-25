import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;

/**
 * This program is a maintained version of last week's LinkedList implementation,
 * now using a Stack, this will sort, insert into stack, and show smallest to largest with smallest inserted first, also largest will be first out.
 * Stack is described as First In Last Out (FILO) or Last In First Out (LIFO) (my preference is LIFO) which we will include an optional commented code to show the pop mechanism of Stack. It's optional because
 * I'm only maintaining and tweaking code which limits changes and this would be considered a big change, I encourage the professor upon grading to uncomment and run to see how Stack works.
 * 
 * It reuses the Java Collections Framework to handle input and sorting,
 * maintaining the SOLID principle of being adaptable for change.
 * 
 * Input stops when a non-integer is entered.
 * 
 * @author Ephraim Duncan
 * @version 1.1.0
 * @since Week 5 of CSC6301
 * date: 06-17-2025
 */
public class StackConversion {

    /**
     * Main method: starts the stack program.
     * Input continues until the user enters a non-integer like a letter or symbol.
     *
     * @param args Unused command-line arguments.
     */
    public static void main(String[] args) {
        // Using built-in scanner parsing to avoid writing a parser which would take more lines of code.
        Stack<Integer> numberStack = new Stack<>();
        addIntegers(numberStack); // Read input
        showStack(numberStack);   // Sort and show
    }

    /**
     * Reads integers from the user until non-integer is entered.
     *
     * @param numberStack The stack to populate.
     */
    private static void addIntegers(Stack<Integer> numberStack) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers one at a time. Enter non-integer to finish:");
        while (scanner.hasNextInt()) {
            numberStack.push(scanner.nextInt());
        }
        scanner.close();
    }

    /**
     * Sorts the stack and displays the result.
     * The only added part of this entire code is optional, once the output is sorted and put into stack...if you want uncomment to see the pop
     * mechanism that show Last In First Out (LIFO) by popping the largest number after sorting, and inserting into stack.
     *
     * @param numberStack The stack to sort and display.
     */
    private static void showStack(Stack<Integer> numberStack) {
        Collections.sort(numberStack); // Still valid for Stack as it implements List
        System.out.println("Sorted stack contents (from smallest to largest): " + numberStack);

        // Optional: Demonstrate LIFO behavior below, comment out then run code and it will pop largest to smallest due to stack behavior.
        
       /*System.out.println("\nDemonstrating LIFO behavior by popping elements in the order for stack:");
        while (!numberStack.isEmpty()) {
            System.out.println("Popped: " + numberStack.pop());
        }
        */
        
    }
}
