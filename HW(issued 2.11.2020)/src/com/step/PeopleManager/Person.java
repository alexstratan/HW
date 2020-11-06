package com.step.PeopleManager;

public class Person {
    String name;

    public Person(String name){
        this.name=name;
    }
    public String getName(){return this.name;}
    public void setName(String name){this.name=name;}

    @Override
    public boolean equals(Object object){
        if(object==this){
            return true;
        }

        if(!(object instanceof Person)){
            return false;
        }

        Person p = (Person)object;

        return this.name.equals((p.getName()));
    }

    @Override
    public String toString(){
        return String.format("Person{\n   name=%s\n}",this.name);
    }

}
