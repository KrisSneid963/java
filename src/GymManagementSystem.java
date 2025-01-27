
public class GymManagementSystem {
    public static void main(String[] args) {

        System.out.println("----------------------------------");

        Member freshMember = new Member(18, "Jurgis", 60);
        System.out.println(freshMember);

        System.out.println("----------------------------------");

        Membership membership = new MonthlyMembership(9, 30, 8);
        System.out.println(membership);

        Membership annualMembership = new AnnualMembership(70, 82);
        System.out.println(annualMembership);

        System.out.println("-------------------------------");

        GymClass pilates = new GymClass("Pilates", "Tuesday 7PM");
        System.out.println(pilates);
        pilates.enroll(new Member(157, "Michael", 55));
        System.out.println(pilates);
        pilates.enroll(new Member(28, "Ernesto", 81));
        System.out.println(pilates);
        GymClass yoga = new GymClass("Yoga", "Friday 9AM");
        yoga.enroll(new Member(78, "Jeffery", 54));
        System.out.println(yoga);

    }

}
