package Tasks;

import Players.PlayerInfo;

import java.util.List;

public class LoggingNames {
    public static void main(String[] args) {

        List<PlayerInfo> players = PlayerInfo.ChoosePlayers(); //from PlayerInfo
        players.forEach(player -> System.out.println("Player: " + player.name + ", Score: " + player.score));
    }
}

//if they are not in PlayerInfo then we need to do Array in each task
//
// List<List<Object>> players = new ArrayList<>(
//                Arrays.asList(
//                        Arrays.asList("Alice", 20),
//                        Arrays.asList("Bob", 30),
//                        Arrays.asList("Charlie", 25)
//                ));
//and then function to add remove or smth
