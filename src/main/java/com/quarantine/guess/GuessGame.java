package com.quarantine.guess;

import java.util.Scanner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class GuessGame {
    private Player player[];
    int guessME;
    int flag = 1;
    String winner;

    final static Log logger = LogFactory.getLog(GuessGame.class);

    public void startGame(){
        int numOfPlayers =1;
//        System.out.println("Enter the number of players ");
        logger.debug("game start");
        try{
            Scanner sc = new Scanner(System.in);
            numOfPlayers = sc.nextInt();
        } catch (Exception e){
            System.out.println("oops! that's not a number");
            System.exit(0);
        }

        setUpPlayers(numOfPlayers);
        System.out.println("Players are ready to play");
        System.out.println("Game started!");
        while(true){
            guessME = (int) (Math.random() *10);
            System.out.println("----------------\n" +
                    "Computer making a guess\n\tcomputer guessed = "+guessME);
            if(logger.isDebugEnabled()){
                logger.debug("Computer guessed = "+guessME);
            }
            checkGuess();
            if(flag == 0) {
                System.out.println("The winner is "+winner + "\nCorrect guess was ="+guessME);
                System.exit(0);
            }
        }
    }


    public void setUpPlayers(int numOfPlayers) {
        player = new Player[numOfPlayers];
        for (int i = 0; i < player.length; i++) {
            System.out.print("Enter the name of player: ");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            player[i] = new Player(name);
        }
    }
    public void checkGuess(){
        for (int i = 0; i < player.length; i++) {
//            System.out.print(player[i].getName()+ " make a guess ");
            if(player[i].makeGuess() == guessME){
                winner = player[i].getName();
                flag = 0;
            }
        }
    }
}
