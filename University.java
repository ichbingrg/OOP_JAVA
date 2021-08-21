package com.company;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class University {

    //University incldes Subclass/Object Departments
    private static class Department{
        final String name;
        Set<Professor> members;

        public Department(String name){
            this.name = name;
            this.members = new HashSet<Professor>();
        }

        public void add(Professor professor){
            members.add(professor);
        }

        public Set<Professor> professors(){
            return members;
        }


    }

    //University needs members name and departments for it's name and a map for it's diff Departments
    private final String name;
    private Map<String, Department> departments;

    public University(String name) {
        this.name =  name;
        this.departments = new TreeMap<String,Department>();
    }

    public String getName(){
        return new String(name);
    }

    public void addDepartment(String name, Set<Professor> members){
        Department dept = new Department(name);
        departments.put(name, dept);

        //iterates through every elements of the Set members
        for(Professor prof : members){
            dept.add(prof);
        }
    }

    public Set<Professor> getDepartmentMembers(String name){
        if (departments.containsKey(name)){
            return departments.get(name).members;
        }else{
            throw new RuntimeException(name + " Dopartment does not exist");
        }
    }

    //Adding a new professor to the department
    public void add(Professor prof, String deptName){
        Department dept = departments.get(deptName);
        if(dept == null){
            throw new RuntimeException(deptName + "does not exist");
        }else{
            dept.add(prof);
        }
    }


    //nameoftheuni.departments() returns all the existing names of the departments in the uni
    public Set<String> departments(){
        return departments.keySet();
    }




}
