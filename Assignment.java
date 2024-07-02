import java.util.*;

// Class representing the assignment tracker application
public class Assignment {
    // Static list to store assignments
    static ArrayList<String> Assignments = new ArrayList<>();
    // Static scanner for user input
    static Scanner input = new Scanner(System.in);

    // Method to create and manage the assignment tracker
    public void createNewTracker() {
        // Infinite loop to continuously display the menu until user chooses to exit
        while (true) {
            // Display menu options to the user
            System.out.println("Choose an action: ");
            System.out.println("1. Enter a new assignment");
            System.out.println("2. Mark assignment as complete");
            System.out.println("3. Clear assignment list");
            System.out.println("4. View assignments");
            System.out.println("5. Exit");
            
            // Read user's choice
            int action = input.nextInt();
            
            // Handle user choice
            if (action == 1) {
                // Enter a new assignment
                System.out.print("Enter a new assignment: ");
                String assignment = input.next();
                Assignments.add(assignment);
            } else if (action == 2) {
                // Mark an assignment as complete
                System.out.println("Select an assignment to mark as complete: ");
                for (int i = 0; i < Assignments.size(); i++) {
                    System.out.println(Assignments.get(i));
                }
                String completed = input.next();
                if (Assignments.contains(completed)) {
                    Assignments.remove(completed);
                    System.out.println("Assignment marked as complete.");
                }
            } else if (action == 3) {
                // Clear assignment list
                System.out.println("Assignments cleared.");
                Assignments.clear();
            } else if (action == 4) {
                // View assignments
                System.out.println("List of Assignments: ");
                for (int i = 0; i < Assignments.size(); i++) {
                    System.out.println("  -- " + Assignments.get(i));
                }
                if (Assignments.isEmpty()) {
                    System.out.println("No assignments");
                }
            } else if (action == 5) {
                // Exit the loop
                break;
            }
        }
        // Print exit message
        System.out.println("Exiting app...");
    }
}

