package Tasks;

import Players.PlayerInfo;

import java.util.List;

public class AddingPrefixToNames {
    public static void main(String[] args) {
        List<PlayerInfo> players = PlayerInfo.ChoosePlayers();
        players.get(0).score = 25; // Set bc its not coming from playerinfo its there and here we can change
        players.get(1).score = 30;
        players.get(2).score = 35;


        players.replaceAll(player -> new PlayerInfo("Player -" + player.name, player.score));
        System.out.println(players);
    }
}
