package com.company;

import java.util.ArrayList;

class Chord {

    String name;
    //private String Position;
    private ArrayList<String []> list = new ArrayList<>();
    private String [] T1 = new String[3], T2 = new String[3], T3 = new String[3], T4 = new String[3], T5 = new String[3], T6 = new String[3], T7 = new String[3], T8 = new String[3], T9 = new String[3], T10 = new String[3], T11 = new String[3], T12 = new String[3];

    Chord (String [] chordStuff) {
        name = chordStuff[1];
        //Position = chordStuff[2];
        //simple
        T1[0] = chordStuff[3];
        T1[1] = chordStuff[4];
        T1[2] = chordStuff[5];
        T2[0] = chordStuff[6];
        T2[1] = chordStuff[7];
        T2[2] = chordStuff[8];
        T3[0] = chordStuff[9];
        T3[1] = chordStuff[10];
        T3[2] = chordStuff[11];
        T4[0] = chordStuff[12];
        T4[1] = chordStuff[13];
        T4[2] = chordStuff[14];
        //intermediate
        T5[0] = chordStuff[15];
        T5[1] = chordStuff[16];
        T5[2] = chordStuff[17];
        T6[0] = chordStuff[18];
        T6[1] = chordStuff[19];
        T6[2] = chordStuff[20];
        T7[0] = chordStuff[21];
        T7[1] = chordStuff[22];
        T7[2] = chordStuff[23];
        T8[0] = chordStuff[24];
        T8[1] = chordStuff[25];
        T8[2] = chordStuff[26];
        //advanced
        T9[0] = chordStuff[27];
        T9[1] = chordStuff[28];
        T9[2] = chordStuff[29];
        T10[0] = chordStuff[30];
        T10[1] = chordStuff[31];
        T10[2] = chordStuff[32];
        T11[0] = chordStuff[33];
        T11[1] = chordStuff[34];
        T11[2] = chordStuff[35];
        T12[0] = chordStuff[36];
        T12[1] = chordStuff[37];
        T12[2] = chordStuff[38];
        list.add(T1);list.add(T2);list.add(T3);list.add(T4);list.add(T5);list.add(T6);list.add(T7);list.add(T8);list.add(T9);list.add(T10);list.add(T11);list.add(T12);
    }
    void suggestChords() {
        System.out.println("Simple Transitions");
        System.out.println(T1[0] + " like in " + T1[2]);
        System.out.println(T2[0] + " like in " + T2[2]);
        System.out.println(T3[0] + " like in " + T3[2]);
        System.out.println(T4[0] + " like in " + T4[2]);
        System.out.println();
        System.out.println("Intermediate Transitions");
        System.out.println(T5[0] + " like in " + T5[2]);
        System.out.println(T6[0] + " like in " + T6[2]);
        System.out.println(T7[0] + " like in " + T7[2]);
        System.out.println(T8[0] + " like in " + T8[2]);
        System.out.println();
        System.out.println("Advanced Transitions");
        System.out.println(T9[0] + " like in " + T9[2]);
        System.out.println(T10[0] + " like in " + T10[2]);
        System.out.println(T11[0] + " like in " + T11[2]);
        System.out.println(T12[0] + " like in " + T12[2]);
    }
    String[] getTransition(int num) {
        if (num == 1) {
            return T1;
        }
        if (num == 2) {
            return T2;
        }
        if (num == 3) {
            return T3;
        }
        if (num == 4) {
            return T4;
        }
        if (num == 5) {
            return T5;
        }
        if (num == 6) {
            return T6;
        }
        if (num == 7) {
            return T7;
        }
        if (num == 8) {
            return T8;
        }
        if (num == 9) {
            return T9;
        }
        if (num == 10) {
            return T10;
        }
        if (num == 11) {
            return T11;
        }
        else {
            return T12;
        }
    }
}