public class TestGameData {

    public static void main(String[] args) {
        // Testing the Gamer class
        System.out.println("Testing the Gamer class:");
        Gamer gamer = new Gamer("PlayerName", "PlayerAddress", 5);

        // Adding game scores
        gamer.addGameScore(101, 80);
        gamer.addGameScore(102, 95);

        // Printing scores
        gamer.printScore();

        // Finding average score
        double averageScore = gamer.getAverageScore();
        System.out.println("Average Score: " + averageScore);

        // Testing the TournamentHost class
        System.out.println("\nTesting the TournamentHost class:");
        TournamentHost host = new TournamentHost("HostName", "HostAddress");

        // Populating gameIDs array with 3 gameIDs
        host.addGame(201);
        host.addGame(202);
        host.addGame(203);

        // Adding a gameID that already exists
        host.addGame(201);

        // Removing gameIDs
        host.removeGame(202);
        host.removeGame(204); // Removing a non-existing gameID

        // Printing gameIDs
        System.out.println("Games after addition and removal:");
        for (int id : host.getGameIDs()) {
            if (id != -1) {
                System.out.println("Game ID: " + id);
            }
        }
    }
}
