public enum Choice {
    ROCK,
    PAPER,
    SCISSORS;

    public static Choice chooseHand(){
        int rand = (int) Math.floor(Math.random()*3);

        switch (rand) {
            case 0:
                return Choice.ROCK;
            case 1:
                return Choice.PAPER;
            case 2:
                return Choice.SCISSORS;
            default:
                return null;
        }
    }
}
