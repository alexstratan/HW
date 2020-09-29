package com.step.model.gadgets.everyDayLiabilities;

public class Kettle {
    private boolean steamWhistle;
    private boolean cordlessKettle;

    public void StartBoiling(float temperature){System.out.println("Started boiling at "+temperature+" Celsius");}
    public void RaiseCover(){System.out.println("The kettle has just raised its cover! Pour water in!");};
}
