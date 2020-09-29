package com.step.model.gadgets.mainGadget;

public class Phone {

    private double screenSize;
    private enum OS{
        IOS,
        Android,
        Windows,
        MIUI
    }
    private double cameraMegapixels;
    private boolean touchscreen;

    public void makeACall(String name){System.out.println("Calling "+name+"...");};
    public void sendMessage(String name,String message){System.out.println("To "+name+" : Message \""+message+"\"");};

}
