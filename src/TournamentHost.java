package src;

/*
Name: Grant Hartley
Student ID: 678984
Email: ghartley@una.edu
Course Information: CIS 315-01
Program Source File Name: TournamentHost.java
Programming Assignment: #1
Program Description: This Aprogram is a simple class to track a tournament host
References:
Due Date: 1 Decemnber 2023
In keeping with the honor code policies of the University of University of North Alabama, the
School of Business, and the Department of Computer Science and Information Systems, I
affirm that I have neither given nor received on this programming assignment. This
assignment
represents my individual, original effort.
... My Signature is on File.
*/
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
