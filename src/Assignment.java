public class Assignment {
    private String description;

    // Constructor to create an assignment with a description
    public Assignment(String description) {
        this.description = description;
    }

    // Getter for the assignment description
    public String getDescription() {
        return description;
    }

    // Override toString method to return assignment description
    @Override
    public String toString() {
        return description;
    }
}
