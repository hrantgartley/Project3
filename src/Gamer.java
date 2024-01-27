package src;
/*
Name: Grant Hartley
Student ID: 678984
Email: ghartley@una.edu
Course Information: CIS 315-01
Program Source File Name: Gamer.java
Programming Assignment: #1
Program Description: This program is a simple game score tracker.
References:
Due Date: 1 Decemnber 2023
In keeping with the honor code policies of the University of University of North Alabama, the
School of Business, and the Department of Computer Science and Information Systems, I
affirm that I have neither given nor received on this programming assignment. This
assignment
represents my individual, original effort.
... My Signature is on File.
*/

public class Gamer extends Person {
    private int numGames;
    private int[] gameCodes;
    private int[] scores;

    public Gamer(String name, String address, int maxGames) {
        super(name, address);
        numGames = 0;
        gameCodes = new int[maxGames];
        scores = new int[maxGames];
    }

    public void addGameScore(int gameID, int score) {
        if (numGames < gameCodes.length) {
            gameCodes[numGames] = gameID;
            scores[numGames] = score;
            numGames++;
        } else {
            System.out.println("Maximum number of games reached!");
        }
    }

    public void printScore() {
        System.out.println("Game Scores for " + getName() + ":");
        for (int i = 0; i < numGames; i++) {
            System.out.println("Game ID: " + gameCodes[i] + ", Score: " + scores[i]);
        }
    }

    public double getAverageScore() {
        if (numGames == 0) {
            return 0;
        }

        int totalScore = 0;
        for (int i = 0; i < numGames; i++) {
            totalScore += scores[i];
        }

        return (double) totalScore / numGames;
    }

}
