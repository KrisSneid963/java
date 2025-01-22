package Tasks;

import Players.PlayerInfo;

import java.util.List;

public class UpdatingScores {
    public static void main(String[] args) {

        List<PlayerInfo> players = PlayerInfo.ChoosePlayers();
        players.get(0).score = 10; // Set bc its not coming from playerinfo
        players.get(1).score = 15;
        players.get(2).score = 20;

        players.replaceAll(player -> {
            player.score *= 2;
            return player;
        });

        System.out.println(players);
    }
}
