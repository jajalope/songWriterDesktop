package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static ArrayList<Chord> c = new ArrayList<>();
    private static ArrayList<Key> keys = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        File file = new File("CMajorTest.csv");
        Scanner fileReader = new Scanner(file);
        int count = 0;
        while(fileReader.hasNextLine()) {
            String [] temp = fileReader.nextLine().split(",");
            if (temp[0].equalsIgnoreCase("Key")) continue;

            if ((count-1)%7==0 || count == 0) {
                Key x = new Key(temp[0]);
                keys.add(x);
            }

            Chord x = new Chord(temp);
            Objects.requireNonNull(keyFinder(temp[0])).chords.add(x);
            c.add(x);

            count++;
        }
        Scanner a = new Scanner(System.in);
        while(true) {
            System.out.println("press 0 to exit, 1 to search by chord, 2 to search by chord and key (WIP), and 3 to generate a chord progression.");
            String nextOpp = a.next();
            if (nextOpp.equals("0")) break;
            else if (nextOpp.equalsIgnoreCase("1")) {
                System.out.println("What chord would you like to search for?");
                String nextChord = a.next();
                Objects.requireNonNull(chordFinder(nextChord)).suggestChords();
            }
            else if (nextOpp.equalsIgnoreCase("2")) {
                System.out.println("What Key would you like to search for?");
                String nextKey = a.next();
                System.out.println("What chord would you like to search for?");
                String nextChord = a.next();
                Objects.requireNonNull(chordFinder(nextChord, nextKey)).suggestChords();
            }
            else if (nextOpp.equalsIgnoreCase("3")) {
                System.out.println("what chord would you like to start with?");
                String startChord = a.next();
                System.out.println("How long should the progression be");
                int len = a.nextInt();
                System.out.println("What is the maximum transition difficulty (easy = 1, intermediate = 2, advanced = 3)");
                int diff = a.nextInt();
                System.out.print(startChord + " ");
                suggestProgression(startChord, len, diff);
            }
            System.out.println();
        }
    }

    private static Key keyFinder(String keyName) {
        for (Key temp: keys) {
            if (temp.name.equalsIgnoreCase(keyName)) {
                return temp;
            }
        }
        return null;
    }
    private static Chord chordFinder(String chordName, String keyName) {
        try {
            for (Chord temp: Objects.requireNonNull(keyFinder(keyName)).chords) {
                if (temp.name.equalsIgnoreCase(chordName)) {
                    return temp;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("invalid key name");
        }
        return null;
    }
    private static Chord chordFinder(String chordName) {
        for (Chord temp: c) {
            if (temp.name.equalsIgnoreCase(chordName)) {
                return temp;
            }
        }
        return null;
    }
    static void suggestProgression(String chord, int length, int difficultyMax) {
        Chord temp = chordFinder(chord);
        int randIndex = (int)(Math.random()*(difficultyMax * 4)+1);
        if (length == 1) return;
        System.out.print(temp.getTransition(randIndex)[0] + " ");
        suggestProgression(temp.getTransition(randIndex)[0], length-1, difficultyMax);
    }
}

