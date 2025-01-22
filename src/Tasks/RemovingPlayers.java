package Tasks;

import Players.PlayerInfo;

import java.util.List;

public class RemovingPlayers {
    public static void main(String[] args) {

        List<PlayerInfo> players = PlayerInfo.ChoosePlayers();
        players.removeIf(player -> player.score < 25);
        System.out.println(players);
    }
}
