package com.step.model.gadgets.everyDayLiabilities;

public class Hairdryer {
    private float wattage;
    private boolean foldableHandle;
    private boolean coldMode;

    public void ActivateColdMode(){coldMode=true;};
    public void ActivateHotMode(){coldMode=false;};
    public boolean GetColdMode(){return coldMode;};
}
