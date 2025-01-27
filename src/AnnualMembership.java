class AnnualMembership extends Membership {

    public AnnualMembership(int membershipId, int memberId) {
        super(membershipId, memberId);
        this.cost = 300.0;
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public String toString() {
        return "AnnualMembership, Cost: " + cost + ", Duration: 12 months";
    }
}
