class MonthlyMembership extends Membership {
    private final int duration;


    public MonthlyMembership(int membershipId, int memberId, int duration) {
        super(membershipId, memberId);
        this.duration = duration;
        this.cost = calculateCost();
    }
    
    private double calculateCost() {
        return duration * 30.0;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "MonthlyMembership, Cost: " + cost + ", Duration: " + duration + " months";
    }
}
