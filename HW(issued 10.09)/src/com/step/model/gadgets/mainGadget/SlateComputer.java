package com.step.model.gadgets.mainGadget;

public class SlateComputer {
    private double screenSizeInches;
    private double resolution;
    private enum memory{
        CardSlot,
        Internal,
    }
    private boolean pencil;

    public void takePhotos(int amount){System.out.println("You've taken "+amount+" phots");}
    public void watchAVideo(String url){System.out.println("You are watching the video with the following link: "+url);}


}
