import java.util.Arrays;

public class TournamentHost extends Person {
    private int numGamesPlaying;
    private int[] gameIDs;

    public TournamentHost(String name, String address) {
        super(name, address);
        numGamesPlaying = 0;
        gameIDs = new int[5];
        Arrays.fill(gameIDs, -1);
    }

    public boolean addGame(int gameID) {
        if (numGamesPlaying >= gameIDs.length) {
            System.out.println("Maximum number of games reached for this tournament!");
            return false;
        }

        if (findGameIndex(gameID) != -1) {
            System.out.println("Game already exists!");
            return false;
        }

        gameIDs[numGamesPlaying] = gameID;
        numGamesPlaying++;
        System.out.println("GameID " + gameID + " has been added.");
        return true;
    }

    public boolean removeGame(int gameID) {
        int gameIndex = findGameIndex(gameID);
        if (gameIndex == -1) {
            System.out.println("Game not found!");
            return false;
        }

        for (int i = gameIndex; i < numGamesPlaying - 1; i++) {
            gameIDs[i] = gameIDs[i + 1];
        }
        gameIDs[numGamesPlaying - 1] = -1;
        numGamesPlaying--;
        System.out.println("GameID " + gameID + " has been removed.");
        return true;
    }

    public int[] getGameIDs() {
        return gameIDs;
    }

    private int findGameIndex(int gameID) {
        for (int i = 0; i < numGamesPlaying; i++) {
            if (gameIDs[i] == gameID) {
                return i;
            }
        }
        return -1;
    }
}
