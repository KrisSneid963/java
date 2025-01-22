package Players;

import java.util.ArrayList;
import java.util.List;

public class PlayerInfo {

    public String name;
    public int score;


    public PlayerInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static List<PlayerInfo> ChoosePlayers() {
        return new ArrayList<>(List.of(
                new PlayerInfo("Alice", 20),
                new PlayerInfo("Bob", 30),
                new PlayerInfo("Charlie", 25),
                new PlayerInfo("Daisy", 10)
        ));
    }


    @Override
    public String toString() {
        return "Player{name='" + name + "', score=" + score + "}";
    }
}
