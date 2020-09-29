package com.step.model.gadgets.everyDayLiabilities;

public class Fan {
    private float maxSpeed;
    private float voltageDC;
    private float currentSpeed;

    public void RotateBlades(){System.out.println("The fan started to rotate its blades");}
    public void ReachedMaxSpeed(){currentSpeed=maxSpeed;System.out.println("The fan has reached its max speed");}
}
