import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> members;

    public Herd() {
        this.members = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.members.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable member : members) {
            member.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Movable member : members) {
            builder.append(member.toString()).append("\n");
        }
        return builder.toString().trim();
    }
}
