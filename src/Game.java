public class Game {
    private int roundNumber;
    private Player player1;
    private Player player2;

    public void startGame(String playerOne, String playerTwo, int pointsToWin){
        if (pointsToWin <= 0) {
            throw new IllegalArgumentException("Points to win should a positive integer.");
        }

        player1 = new Player(playerOne);
        player2 = new Player(playerTwo);

        System.out.println("---------------------\n" + "LET'S PLAY ROCK PAPER SCISSORS!");
        System.out.println(player1.getName() + " is facing " + player2.getName() + "\n" + "---------------------");

        while (player1.getWinCount() != pointsToWin && player2.getWinCount() != pointsToWin) {
            roundNumber++;
            player1.makeChoice();
            player2.makeChoice();

           if (player1.getChoice().equals(player2.getChoice())) {
               System.out.println("Both players chose " + player1.getChoice() + " thats a draw!" );
           } else if (player1.getChoice().equals(Choice.ROCK) && player2.getChoice().equals(Choice.SCISSORS) ||
                   player1.getChoice().equals(Choice.PAPER) && player2.getChoice().equals(Choice.ROCK) ||
                   player1.getChoice().equals(Choice.SCISSORS) && player2.getChoice().equals(Choice.PAPER)){
               player1.roundWon();
               printResults(player1, player2);
           } else {
               player2.roundWon();
               printResults(player2, player1);
            }
            System.out.println("---------------------");
        }
    }

    private void printResults(Player winner, Player loser) {
        System.out.println(winner.getName() + " chose " + winner.getChoice());
        System.out.println(loser.getName() + " chose " + loser.getChoice());
        System.out.println(winner.getName() + " wins round " + roundNumber);
        System.out.println("RESULT: " + player1.getName() + " - " + player1.getWinCount() + " " +
                player2.getName() + " - " + player2.getWinCount());
    }
}
