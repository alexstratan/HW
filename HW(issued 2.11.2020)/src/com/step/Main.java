package com.step;

import java.util.List;
import java.util.ArrayList;
import com.step.PeopleManager.Person;

public class Main {


    public static void main(String[] args) {
        //region ex1
        List<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Cyan");
        colors.add("Purple");

        for(String color: colors){
            System.out.println("Color: "+color);
        }
        //endregion
        //region ex2
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0,2);
        integerList.add(0,5);
        integerList.add(0,4);
        integerList.add(0,1);
        integerList.add(0,3);
        integerList.add(0,2);
        integerList.add(0,5);
        integerList.add(0,4);
        integerList.add(0,1);
        integerList.add(0,3);

        for(Integer integer:integerList){
            System.out.println("Value: "+integer.intValue());
        }
        //endregion
        //region ex3
//        List<String> stringList = new ArrayList<>();
//        for(int i=0;i<10;i++){
//            stringList.add("string "+i);
//        }
//        System.out.println("The whole list: ");
//        for(String stringElement:stringList){
//            System.out.println(stringElement);
//        }
//        System.out.println("\nValue at index 3: "+stringList.get(3));

        //endregion
        //region ex4
        List<String> mainList = new ArrayList<>();
        List<String> secondaryList = new ArrayList<>();
        for(int i=0;i<5;i++){
            mainList.add("MainList, value"+i);
        }
        for(int i=0;i<7;i++){
            secondaryList.add("SecondaryList, value"+i);
        }

        System.out.println("-----------------\nMainList:");
        for(String stringElement: mainList){
            System.out.println(stringElement);
        }

        System.out.println("-----------------\nSecondaryList:");
        for(String stringElement: secondaryList){
            System.out.println(stringElement);
        }

        mainList.addAll(secondaryList);
        System.out.println("-----------------\nMainList joined with SecondaryList: ");
        for(String stringElement: mainList){
            System.out.println(stringElement);
        }
        //endregion
        //region ex5
        //a)
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alex"));
        people.add(new Person("Marcus"));
        people.add(new Person("Wrench"));
        people.add(new Person("Sitara"));
        people.add(new Person("Josh"));


        for(Person person:people){
            if(person.equals(new Person("Marcus"))){

                System.out.println("\nFound a match: \n"+person.toString());
            }
        }

        //endregion
    }
}
