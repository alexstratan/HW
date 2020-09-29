package com.step.model.gadgets.entertainment;

public class TV {
    private double resolution;
    private double refreshRate;
    private enum typeOfScreen{
        LED,
        Q_LED,
        O_LED,
        Plasma
    }
    private int viewingAngle;

    public void OnOff(boolean state){System.out.println("The tv is on:" + state);}
    public void ChangeTheChannel(int ch){
        if(ch<=0)
            System.out.println("Invalid channel");
        else{
            System.out.println("We are watching channel "+ch);
        }
    }

}
