package com.step.model.gadgets.everyDayLiabilities;

public class Printer {
    private enum type{
        LaserPrinter,
        SolidInkPrinter,
        LEDPrinter,
        BusinessInkjetPrinter,
        HomeInkjetPrinter,
        MultifunctionPrinter,
        DotMatrixPrinter,
        Printer3D
        }
    private String company;

    public void Print(String message){System.out.println(message);};
    public void ShutDown(){System.out.println("The printer has been shut down");}
}
