package com.step.model.gadgets.mainGadget.usageHelp;

public class Mouse {
    private double dpi;
    private String companie;
    private int nrButaone;
    private enum tip{
        Trackball,
        Optical,
        Laser
    };
    private boolean isUSB;

    public void Click(){};
    public void Scroll(){};
}
