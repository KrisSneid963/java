import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class GymClass {
    private final String className;
    private final String schedule;
    private final List<Member> enrolledMembers;


    public GymClass(String className, String schedule) {
        this.className = className;
        this.schedule = schedule;
        this.enrolledMembers = new ArrayList<>();
    }

    public void enroll(Member member) {
        enrolledMembers.add(member);
    }

    @Override
    public String toString() {
        String result = className + " (" + schedule + ")";
        if (!enrolledMembers.isEmpty()) {
            result += ": " + enrolledMembers.stream()
                    .map(Member::getName)
                    .collect(Collectors.joining(", "));
        }
        return result;
    }
}
