package Tasks;

import Players.PlayerInfo;

import java.util.List;

public class SortingPlayers {
    public static void main(String[] args) {

        List<PlayerInfo> players = PlayerInfo.ChoosePlayers();
        players.get(0).score = 15;
        players.get(1).score = 20;
        players.get(2).score = 20;
        players.get(3).score = 10;

        players.sort((p1, p2) -> {
            int scoreComparison = Integer.compare(p2.score, p1.score);
            return scoreComparison != 0 ? scoreComparison : p1.name.compareTo(p2.name);
        });

        System.out.println(players);
    }
}
