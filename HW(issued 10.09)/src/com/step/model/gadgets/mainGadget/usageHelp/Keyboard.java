package com.step.model.gadgets.mainGadget.usageHelp;

public class Keyboard {
    private enum Tip{
        MEMBRANA,
        MECANICA
    }
    private enum Connection{
        WIRELESS,
        USB,
        PS2
    }
    private String color;
    private String company;

    public void type(String message){
        System.out.println(message);
    }
    public void chargeWireless(){for(int i=0;i<101;i++){System.out.println(i+"% charged");}}
}
