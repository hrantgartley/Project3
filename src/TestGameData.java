package src;

public class TestGameData {

    public static void main(String[] args) {
        System.out.println("Testing the Gamer class:");
        Gamer gamer = new Gamer("PlayerName", "PlayerAddress", 5);

        gamer.addGameScore(101, 80);
        gamer.addGameScore(102, 95);

        gamer.printScore();

        double averageScore = gamer.getAverageScore();
        System.out.println("Average Score: " + averageScore);

        System.out.println("\nTesting the TournamentHost class:");
        TournamentHost host = new TournamentHost("HostName", "HostAddress");

        host.addGame(201);
        host.addGame(202);
        host.addGame(203);

        host.addGame(201);

        host.removeGame(202);
        host.removeGame(204);

        System.out.println("Games after addition and removal:");
        for (int id : host.getGameIDs()) {
            if (id != -1) {
                System.out.println("Game ID: " + id);
            }
        }
    }
}
