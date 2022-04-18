package com.school.media;

public abstract class Mediateke{
    private String fileName;
    private String itemType;
    private int sizeInMb;
    private String author;

    public Mediateke(String fname,String iType, int size, String author){
        this.fileName = fname;
        this.itemType = iType;
        setsizeInMb(size);      // besoj se eshte ok me perdor function per data inicialisation ? (ne kete menyr kontrollon input edhe tek konstruktori)
        this.author = author;
    }

    abstract void openFile();

    abstract void read();

    abstract void playVideo();

    abstract void playMusic();
    
    abstract String getTitle();
    
    abstract String getLength();
    
    abstract String getGenre();
    
    abstract int getNumberOfPages();
    
    abstract int getBitrate();
    
    abstract String getFeaturedArtists();
    
    abstract int getVideoQuality();

    @Override
    public String toString(){   // toString default class function override

        return "File Name : " + this.fileName
                + "\nFile Size : " + this.sizeInMb
                + "\nFile Type : " + this.itemType
                + "\nAuthor : " + this.author;

    }

    public void setfileName(String data){
        this.fileName = data;
    }
    public void setitemType(String data){
        this.itemType = data;
    }
    public void setsizeInMb(int data){      // per kontroll input

        if(data >= 0)
            this.sizeInMb = data;
        else
            this.sizeInMb = -1;

    }
    public void setauthor(String data){
        this.author = data;
    }

    public String getfileName(){
        return this.fileName;
    }
    public String getitemType(){
        return this.itemType;
    }
    public int getsizeInMb(){
        return this.sizeInMb;
    }
    public String getauthor(){
        return this.author;
   }

}
