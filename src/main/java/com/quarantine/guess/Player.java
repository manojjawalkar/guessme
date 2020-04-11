package com.quarantine.guess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    private String name;
    private int age;
    private int myGuess;

    Player(String x, int y){
        name = x;
        age = y;
    }
    Player(){

    }

    public String getName() {
        return name;
    }
    public  void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  int myGuess(){
        Scanner sc = new Scanner(System.in);
        try{
            myGuess = sc.nextInt();

        } catch(InputMismatchException ime){
            System.out.println("The input was not a number");
        }
        return myGuess;
    }
}
