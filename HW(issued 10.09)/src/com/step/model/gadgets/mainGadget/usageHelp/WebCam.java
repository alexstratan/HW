package com.step.model.gadgets.mainGadget.usageHelp;

public class WebCam {
    private int degreesFOV;
    private boolean autoFocus;
    private int frameRate;
    private double resolution;
    private boolean microphone;

    public void SetFocus(boolean _focus){autoFocus=_focus;}
    public void SetMic(boolean _mic){microphone=_mic;}
}
