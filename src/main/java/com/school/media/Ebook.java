package com.school.media;

public class Ebook extends Mediateke {
    private int numberOfPages;
    private String genre;
    private String title;

    public Ebook(String fname, String iType, int size, String author, String title, int pages, String genre){
        super(fname, iType, size, author);
        this.numberOfPages = pages;
        this.title = title;
        this.genre = genre;
    }

    @Override
    void playVideo(){
        System.out.println("Cant open this file.");
    }
    
    @Override
    void playMusic(){
        System.out.println("Cant open this file.");
    }
    
    @Override
    void read(){
        System.out.println("Reading ... ");
    }

    @Override
    void openFile(){
        System.out.println("\nEbook Opening ... ");
        read();
    }

    @Override
    public String toString(){

        return "Music Filename : " + getfileName()
                + "\nMusic format : " + getitemType()
                + "\nMusic size : " + getsizeInMb() + "mb"
                + "\nMusic Author : " + getauthor()
                + "\nEbook Title : " + this.title
                + "\nEbook Number of pages : " + this.numberOfPages
                + "\nEbook genre : " + this.genre;

    }
    
    public void setNumberOfPages(int data){
        this.numberOfPages = data;
    }
    public void setGenre(String data){
        this.genre = data;
    }
    public void setTitle(String data){
        this.title = data;
    }
    
    @Override
    public int getBitrate(){
        return -1;
    }
    @Override
    public String getFeaturedArtists(){
        return "-1";
    }
    @Override
    public int getVideoQuality(){
        return -1;
    }
    @Override
    public int getNumberOfPages(){
        return this.numberOfPages;
    }
    @Override
    public String getGenre(){
        return this.genre;
    }
    @Override
    String getTitle(){
        return this.title;
    }
    @Override
    String getLength(){
        return "-1";
    }
}
