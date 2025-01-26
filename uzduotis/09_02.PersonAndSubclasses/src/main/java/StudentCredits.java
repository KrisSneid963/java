public class StudentCredits {
    private int credits;

    public StudentCredits() {
        this.credits = 0;
    }

    public void study() {
        this.credits++; //+1
    }

    public int credits() {
        return this.credits;
    }
}
