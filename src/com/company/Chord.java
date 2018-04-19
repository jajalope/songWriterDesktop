package com.company;

class Chord {

    String name;
    //private String Position;
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
}
