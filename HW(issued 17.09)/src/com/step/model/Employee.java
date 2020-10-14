package com.step.model;

import java.util.Date;
public class Employee {

    private String name;
    private String surname;
    private Date birthdate;

    public Employee(){}

    public Employee(String name, String surname){
        this.name=name;
        this.surname=surname;
    }

    public Employee(String name, String surname, Date birthdate){
        this.name=name;
        this.surname=surname;
        this.birthdate=birthdate;
    }

    public String getName(){ return  this.name;}
    public String getSurname(){ return  this.surname;}
    public Date getBirthdate(){ return  this.birthdate;}

}
