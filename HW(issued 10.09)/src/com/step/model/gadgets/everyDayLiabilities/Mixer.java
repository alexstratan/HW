package com.step.model.gadgets.everyDayLiabilities;

public class Mixer {
    private float  currentRotationSpeed;
    private float maxRotationSpeed;
    private float minRotationSpeed;

    public void reachMaxRotationSpeed (){currentRotationSpeed=maxRotationSpeed;System.out.println("Max rotation speed has been reached");}
    public void reachMinRotationSpeed (){currentRotationSpeed=minRotationSpeed;System.out.println("Min rotation speed has been reached");}
}
