public class Player {
    private String name;
    private int winCount;
    private Choice choice;

    public Player (String name){
        this.name = name;
    }

    public int getWinCount(){
        return winCount;
    }

    public String getName() {
        return name;
    }

    public Choice getChoice(){
        return choice;
    }

    public void makeChoice() {
         choice = Choice.chooseHand();
    }

    public void roundWon(){
        winCount++;
    }
}
