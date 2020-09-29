package com.step.model.gadgets.mainGadget.usageHelp;

public class HeadSet {
    private String company;
    private enum frequencyResponse{
        Hz12_22,
        KHz20_22,
    }
    private enum sizeOfSpeakers{
        between10_20mm,
        between20_40mm,
    }

    public void setVolume(double percentage){
        if(percentage<=100&percentage>=0){
            System.out.println("The volume is at "+percentage+"%");
        }
        else{
            System.out.println("Invalid percentage");
        }
    };

    public void bassBoostState(boolean on){
        System.out.println("BassBoost mode is on: "+ on);
    };
}
