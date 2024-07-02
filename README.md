## Homework Tracker App

### Overview
The Homework Tracker App is a simple Java-based console application designed to help users manage their assignments efficiently. Users can add new assignments, mark them as complete, view all pending assignments, and clear the entire list of assignments. The app leverages Object-Oriented Programming (OOP) principles to ensure a clean and maintainable code structure.

### Features
- **Add New Assignment**: Users can input a description of their new assignment, which will be added to the list.
- **Mark Assignment as Complete**: Users can mark any assignment as complete, which will remove it from the list.
- **Clear Assignment List**: Users can clear all assignments from the list.
- **View Assignments**: Users can view the list of all pending assignments.
- **Exit**: Users can exit the application gracefully.

### Class Structure
- **HomeworkTrackerApp**: The main class that initializes and starts the application.
- **Assignment**: A class representing individual assignments, encapsulating their description.
- **AssignmentTracker**: A class responsible for managing the list of assignments, user interactions, and application logic.

### Usage
1. **Run the Application**: Compile and run the `HomeworkTrackerApp` class to start the application.
2. **Main Menu**: The application will display a menu with options to add, mark complete, clear, view, and exit.
3. **Add New Assignment**: Select option `1` and enter the description of the assignment.
4. **Mark Assignment as Complete**: Select option `2`, view the list, and choose the assignment number to mark as complete.
5. **Clear Assignment List**: Select option `3` to clear all assignments.
6. **View Assignments**: Select option `4` to view all pending assignments.
7. **Exit**: Select option `5` to exit the application.


### How to Compile and Run
1. **Compile**: 
   ```
   javac HomeworkTrackerApp.java Assignment.java AssignmentTracker.java
   ```
2. **Run**:
   ```
   java HomeworkTrackerApp
   ```

### Conclusion
The Homework Tracker App is a straightforward console application designed to help users manage their assignments efficiently. With its simple menu-driven interface and clear structure, it provides a practical example of using OOP principles in Java.
