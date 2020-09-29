package com.step.model.gadgets.everyDayLiabilities;

public class Scanner {
    private enum type{
        Flatbed,
        Sheet_fed,
        Handheld,
        DrumScanners,
    }

    private String company;

    public void Scan(){System.out.println("The scanner is scanning a document");};
    public void Convert(){System.out.println("The scanner is converting the scanned document");}
}
