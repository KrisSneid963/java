import java.util.HashMap;
import java.util.Map;

class Class {
    private Map<Integer, Member> members;
    private Map<Integer, Membership> memberships;
    private Map<String, GymClass> gymClasses;


    public Class() {
        members = new HashMap<>();
        memberships = new HashMap<>();
        gymClasses = new HashMap<>();
    }

    public void addMember(int id, String name, int age) {
        if (members.containsKey(id)) {
            System.out.println("Member with ID " + id + " already exists.");
            return;
        }
        members.put(id, new Member(id, name, age));
    }

    public void assignMembership(Membership membership) {
        int memberId = membership.getId();
        if (!members.containsKey(memberId)) {
            System.out.println("Member ID not found.");
            return;
        }
        memberships.put(memberId, membership);
    }

    public void addGymClass(String className, String schedule) {
        if (gymClasses.containsKey(className)) {
            System.out.println("Class " + className + " already exists.");
            return;
        }
        gymClasses.put(className, new GymClass(className, schedule));
    }

    public void enrollMemberInClass(int memberId, String className) {
        if (!members.containsKey(memberId)) {
            System.out.println("Member ID not found.");
            return;
        }
        if (!gymClasses.containsKey(className)) {
            System.out.println("Class not found.");
            return;
        }
        gymClasses.get(className).enroll(members.get(memberId));
    }

    public void printMembers() {
        members.values().forEach(System.out::println);
    }

    public void printMemberships() {
        memberships.values().forEach(System.out::println);
    }

    public void printClassEnrollments() {
        gymClasses.values().forEach(System.out::println);
    }
}

