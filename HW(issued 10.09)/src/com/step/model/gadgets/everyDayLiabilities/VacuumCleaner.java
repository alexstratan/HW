package com.step.model.gadgets.everyDayLiabilities;

public class VacuumCleaner {
    private enum type{
        UprightVacuum,
        HandheldVacuum,
        Sweeper,
        StickVacuum,
        PetVacuum,
        RoboticVacuum,
    }
    private float airWatts;

    public void StartVacuuming(){System.out.println("Started vacuuming! Soon your room will get clean :)");}
    public void RunOutOfLiquid(){System.out.println("Refill the tank! Otherwise the vacuum cleaner won't work");};
}
