package com.quarantine.test;

import com.quarantine.guess.GuessGame;
import com.quarantine.guess.Player;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PlayerDebug {
    private final PrintWriter	writer;

    PlayerDebug(String dirName, GuessGame game) throws IOException {
        File dir = new File(dirName);
        dir.mkdirs();
        File file = new File(dir,"player_"+ System.currentTimeMillis() / 1000 + ".csv");
        writer = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        writer.printf("Date=%s,game status=%s\n", System.currentTimeMillis() / 1000, game.toString());
        if (writer != null)
            writer.close();
    }
    public static void main(String a[]){
        try {
            PlayerDebug debug = new PlayerDebug(".debug");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
