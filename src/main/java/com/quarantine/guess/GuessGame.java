package com.quarantine.guess;


import java.util.Scanner;

import static java.lang.System.exit;

public class GuessGame {
    private Player player[];
    int guessME;
    int flag = 1;
    String winner;

    public void startGame(){
        int numOfPlayers =1;
        System.out.println("Enter the number of players:");
        try{
            Scanner sc = new Scanner(System.in);
            numOfPlayers = sc.nextInt();
        } catch (Exception e){
            System.out.println("oops! that's not a number");
            exit(0);
        }

        setUpPlayers(numOfPlayers);
        System.out.println("Players are ready to play");
        System.out.println("Game started!");
        System.out.println("Guess any number till 50..");
        guessME = (int) (Math.random() *50);
        while(true){

            System.out.println("----------------\n" +
                    "Computer making a guess\n\tcomputer guessed = "+guessME);
            checkGuess();
            if(flag == 0) {
                System.out.println("The winner is "+winner + "\nCorrect guess was ="+guessME);
                exit(0);
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
            int guess=player[i].makeGuess();
//            System.out.print(player[i].getName()+ " make a guess ");
            if(guess == guessME){
                winner = player[i].getName();
                System.out.println(winner+" "+"Congrats!!");
                exit(0);
                flag = 0;
            }
            else if(guess < guessME)
            {
                System.out.println("Guess is low");

            }
            else if(guess > guessME)
            {
                System.out.println("Guess is high");
            }

        }


    }
}
