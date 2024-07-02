import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentTracker {
    private ArrayList<Assignment> assignments;
    private Scanner input;

    // Constructor to initialize the assignment tracker
    public AssignmentTracker() {
        assignments = new ArrayList<>();
        input = new Scanner(System.in);
    }

    // Method to run the assignment tracker application
    public void run() {
        while (true) {
            displayMenu();
            int action = getInputInt("Choose an action: ");
            handleAction(action);
        }
    }

    // Display the menu options
    private void displayMenu() {
        System.out.println("1. Enter a new assignment");
        System.out.println("2. Mark assignment as complete");
        System.out.println("3. Clear assignment list");
        System.out.println("4. View assignments");
        System.out.println("5. Exit");
    }

    // Handle user action based on menu choice
    private void handleAction(int action) {
        switch (action) {
            case 1:
                addNewAssignment();
                break;
            case 2:
                markAssignmentAsComplete();
                break;
            case 3:
                clearAssignments();
                break;
            case 4:
                viewAssignments();
                break;
            case 5:
                exitApp();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    // Add a new assignment to the list
    private void addNewAssignment() {
        String description = getInputString("Enter a new assignment: ");
        assignments.add(new Assignment(description));
    }

    // Mark an assignment as complete and remove it from the list
    private void markAssignmentAsComplete() {
        if (assignments.isEmpty()) {
            System.out.println("No assignments to mark as complete.");
            return;
        }
        viewAssignments();
        int index = getInputInt("Select an assignment to mark as complete (by number): ");
        if (index > 0 && index <= assignments.size()) {
            assignments.remove(index - 1);
            System.out.println("Assignment marked as complete.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    // Clear all assignments from the list
    private void clearAssignments() {
        assignments.clear();
        System.out.println("All assignments cleared.");
    }

    // View the list of assignments
    private void viewAssignments() {
        if (assignments.isEmpty()) {
            System.out.println("No assignments.");
            System.out.println();
            return;
        }
        System.out.println("List of Assignments:");
        for (int i = 0; i < assignments.size(); i++) {
            System.out.println((i + 1) + ". " + assignments.get(i));
            System.out.println();
        }
    }

    // Exit the application
    private void exitApp() {
        System.out.println("Exiting app...");
        System.exit(0);
    }

    // Helper method to get a string input from the user
    private String getInputString(String prompt) {
        System.out.print(prompt);
        return input.nextLine();
    }

    // Helper method to get an integer input from the user
    private int getInputInt(String prompt) {
        System.out.print(prompt);
        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            input.next();
            System.out.print(prompt);
        }
        int number = input.nextInt();
        input.nextLine(); // Consume newline character
        return number;
    }
}
