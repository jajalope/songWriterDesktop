package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Key> keys = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        File file = new File("We'll Fix This In Post");
        Scanner fileReader = new Scanner(file);
        int count = 0;
        while(fileReader.hasNextLine()) {
            String [] temp = fileReader.nextLine().split(",");
            if (temp[0].equalsIgnoreCase("Key")) continue;

            if ((count-1)%7==0) {
                Key x = new Key(temp[0]);
                keys.add(x);
            }

            Chord x = new Chord(temp);
            keyFinder(temp[0]).chords.add(x);

            count++;
        }
    }

    public static Key keyFinder(String keyName) {
        for (Key temp: keys) {
            if (temp.name.equalsIgnoreCase(keyName)) {
                return temp;
            }
        }
        return null;
    }
}
