package com.quarantine.guess;

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
        myGuess = sc.nextInt();
        return myGuess;
    }
    public static void main(String a[]){
        Player p = new Player();
        p.setAge(24); p.setName("Ravan");
        System.out.println("Name is "+p.getName()+ " and age is "+p.age);
    }
}
