package com.step.model.gadgets.everyDayLiabilities;

public class Iron {
    private float lengthCM;
    private float maxTemperature;
    private float currentTemperature;

    public void ReachMaxTemp(){currentTemperature=maxTemperature; System.out.println("The iron has reached its max temp.");}
    public void GiveOffSteam(){System.out.println("The ironing is giving off steam");}
}
