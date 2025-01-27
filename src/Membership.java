abstract class Membership {
    protected final int membershipId;
    protected final int memberId;
    protected double cost;

    public Membership(int membershipId, int memberId) {
        this.membershipId = membershipId;
        this.memberId = memberId;
    }

    public int getId() {
        return memberId;
    }

    public abstract double getCost();

    @Override
    public String toString() {
        return "Membership ID: " + membershipId + ", Cost: " + cost;
    }
}
