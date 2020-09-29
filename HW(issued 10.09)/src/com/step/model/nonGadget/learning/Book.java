package com.step.model.nonGadget.learning;

public class Book {
    private int nrOfPages;
    private String author;
    private String publishingHouse;

    public void OpenAt(int page){System.out.println("The book is opened at page "+page);}
    public void CloseTheBook(){System.out.println("The book has been closed");};
}
