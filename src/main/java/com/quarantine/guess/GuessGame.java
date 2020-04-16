package com.quarantine.guess;


public class GuessGame {
    private Player p1;
    private Player p2;
    private Player p3;
    private player p4;
    int guessME;
    int flag = 1;
    String winner;

    public void startGame(){
        System.out.println("Game started!");
        setUpPlayers();
        System.out.println("Players are ready to play");
        while(true){
            guessME = (int) (Math.random() *10);
            checkGuess(p1);
            checkGuess(p2);
            checkGuess(p3);
	    checkGuess(p4);
            System.out.println("-----------------------------------");
            if(flag == 0) {
                System.out.println("The winner is "+winner + "\nCorrect guess was ="+guessME);
                System.exit(0);
            }
        }
    }


    public void setUpPlayers() {
        System.out.println("Setting up players");
        p1 = new Player("Shrikant", 13);
        p2 = new Player("Prachi", 13);
        p3 = new Player("Manoj", 13);
	p4=new Player("Ruturaj",12);
    }
    public void checkGuess(Player p){
        System.out.println(p.getName()+" Making a guess = ");
        if(p.myGuess() == guessME){
            flag = 0;
            winner = p.getName();
        }
    }
}
