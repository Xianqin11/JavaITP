package de.tum.cit.ase;

import org.checkerframework.checker.nullness.qual.NonNull;

public class Penguin {
    private String name;
    private String dna;
    //Penguin & conviction是聚合关系
    //Conviction[]类数组作为Penguin类的成员变量，成员变量名叫convictionHistory
    private Conviction[] convictionHistory;

    //Constructor
    public Penguin(String name, String dna, Conviction[] convictionHistory) {
        this.name = name;
        this.dna = dna;
        this.convictionHistory = convictionHistory;
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public String getDna() {
        return dna;
    }
    public String[] getConvictionHistory() {
        return convictionHistory; //???
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setDna(String dna) {
        this.dna = dna;
    }
    public void setConvictionHistory(String[] convictionHistory) {
        this.convictionHistory = convictionHistory;
    }
}
