package com.step.model.gadgets.mainGadget.usageHelp;

public class Monitor {
    private double rezolutie;
    private double culoare;
    private double refreshRate;
    private boolean on;

    public void turnOn(){on=true;}
    public void display(String message){System.out.println("The monitor has displayed "+ message);}


}
