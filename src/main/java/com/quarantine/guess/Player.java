package com.quarantine.guess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    private String name;
    private int myGuess;

    Player(String x){
        name = x;
    }
    Player(){

    }

    public String getName() {
        return name;
    }
    public  void setName(String name){
        this.name = name;
    }

    public  int makeGuess(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print(this.getName()+" make a guess ");
            myGuess = sc.nextInt();

        } catch(InputMismatchException ime){
            System.out.println("The input was not a number");
        }
        return myGuess;
    }
}
