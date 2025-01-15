public class Agent {
    private String firstName;
    private String lastName;

    // Constructor
    public Agent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // the toString
    @Override
    public String toString() {
        return "My name is " + this.lastName + ", " + this.firstName + " " + this.lastName;
    }
}
