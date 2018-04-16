package com.company;

public class Chord {

    String name;
    String Position;
    String [] T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12;

    public Chord (String [] chordStuff) {
        this.name = chordStuff[1];
        this.Position = chordStuff[2];
        //simple
        this.T1[0] = chordStuff[3];
        this.T1[1] = chordStuff[4];
        this.T1[2] = chordStuff[5];
        this.T2[0] = chordStuff[6];
        this.T2[1] = chordStuff[7];
        this.T2[2] = chordStuff[8];
        this.T3[0] = chordStuff[9];
        this.T3[1] = chordStuff[10];
        this.T3[2] = chordStuff[11];
        this.T4[0] = chordStuff[12];
        this.T4[1] = chordStuff[13];
        this.T4[2] = chordStuff[14];
        //intermediate
        this.T5[0] = chordStuff[15];
        this.T5[1] = chordStuff[16];
        this.T5[2] = chordStuff[17];
        this.T6[0] = chordStuff[18];
        this.T6[1] = chordStuff[19];
        this.T6[2] = chordStuff[20];
        this.T7[0] = chordStuff[21];
        this.T7[1] = chordStuff[22];
        this.T7[2] = chordStuff[23];
        this.T8[0] = chordStuff[24];
        this.T8[1] = chordStuff[25];
        this.T8[2] = chordStuff[26];
        //advanced
        this.T9[0] = chordStuff[27];
        this.T9[1] = chordStuff[28];
        this.T9[2] = chordStuff[29];
        this.T10[0] = chordStuff[30];
        this.T10[1] = chordStuff[31];
        this.T10[2] = chordStuff[32];
        this.T11[0] = chordStuff[33];
        this.T11[1] = chordStuff[34];
        this.T11[2] = chordStuff[35];
        this.T12[0] = chordStuff[36];
        this.T12[1] = chordStuff[37];
        this.T12[2] = chordStuff[38];
    }

}
