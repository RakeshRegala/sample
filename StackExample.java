import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push an element");
            System.out.println("2. Pop an element");
            System.out.println("3. Display the stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Push
                    System.out.print("Enter an element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    System.out.println(element + " has been pushed onto the stack.");
                    break;

                case 2: // Pop
                    if (!stack.isEmpty()) {
                        int poppedElement = stack.pop();
                        System.out.println(poppedElement + " has been popped from the stack.");
                    } else {
                        System.out.println("The stack is empty. Nothing to pop.");
                    }
                    break;

                case 3: // Display
                    System.out.println("Current stack: " + stack);
                    break;

                case 4: // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
