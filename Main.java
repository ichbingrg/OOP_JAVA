package com.company;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//This is the main class to test the whole project
public class Main {
    public static void main(String[] args) {
	// write your code here

        University jsu = new University("JavaStateUniversity");
        Professor adams = new Professor("Adams", Professor.Rank.ASSOC);
        Professor baker = new Professor("Baker", Professor.Rank.ASST);
        Professor cohen = new Professor("Cohen", Professor.Rank.PROF);
        Set<Professor> profs = new HashSet<Professor>();

        Collections.addAll(profs, adams, baker, cohen);

        jsu.addDepartment("Computer Science", profs);
        Professor davis = new Professor("Davis", Professor.Rank.ASST);
        Professor evans = new Professor("Evans", Professor.Rank.INSTR);
        profs.clear();
        Collections.addAll(profs, davis, evans, baker);

        jsu.addDepartment("Biology", profs);
        adams.setRank(Professor.Rank.PROF);

        for (String deps : jsu.departments()){
            System.out.println("***************  " + deps + "  **************");
            for(Professor profes : jsu.getDepartmentMembers(deps)){
                System.out.println(profes.getName() + " - " + profes.getRank());
            }
            System.out.println();
        }



    }
}
