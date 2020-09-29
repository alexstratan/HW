package com.step.model.gadgets.everyDayLiabilities;

public class MicroWave {
    private double timeToCookSeconds;
    private enum mode{
        Defrost,
        Crisp,
        FanOven,
        Steam,
        FullGrill,
        PartGrill,
        PizzaSetting,
    }

    public void Cook(String food){System.out.println("Cooking " +food+" right now!");}
    public void ProduceThermalEnergy(){System.out.println("Producing thermal energy");}
}
