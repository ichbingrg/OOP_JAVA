package com.company;

public class Professor extends Person{

    /*
    * Rank can only take 4 values;
    *
    * for eg : enum Bool {True, False} could be a possible initialisation for datatype Bool
    * */
    public static enum Rank {INSTR, ASST, ASSOC, PROF}

    private Rank rank;

    public Professor(String name, Rank rank){
        super(name) ;
        this.rank = rank;
    }

    public Rank getRank(){
        return rank;
    }

    public void setRank(Rank rank){
        this.rank = rank ;
    }
}
