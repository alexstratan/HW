package com.step.model.nonGadget.entertainment;

public class ComicBook {
    private String[] heroes;
    private String mainHero;
    private int volume;

    public void WriteHeroLines(String line, String hero){
        System.out.println(hero+" said: \""+line+"\"");
    }

    public void DrawAHero(String hero){
        System.out.println(hero+" is being drawn");
    }

}
