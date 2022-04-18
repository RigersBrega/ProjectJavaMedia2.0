package com.school.media;

public class MusicCd extends Mediateke {
    private String length;
    private int bitrate;
    private String featuredArtists;
    private String title;
    private String genre;

    public MusicCd(String fname, String iType, int size, String author,String title, String length, int bitrate, String featured, String genre){
        super(fname, iType, size, author);
        this.length = length;
        this.bitrate = bitrate;
        this.featuredArtists = featured;
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString(){
        
        return "Music Filename : " + getfileName()
                + "\nMusic format : " + getitemType()
                + "\nMusic size : " + getsizeInMb() + "mb"
                + "\nMusic Author : " + getauthor()
                + "\nMusic Title : " + this.title
                + "\nMusic Duration : " + this.length
                + "\nMusic bitrate : " + this.bitrate
                + "\nMusic Featured Artist : " + this.featuredArtists
                + "\nMusic genre : " + this.genre;

    }
    @Override
    void playVideo(){
        System.out.println("Cant open This item");
    }
    
    @Override
    void read(){
        System.out.println("Cant open This item");
    }
    
    @Override
    void playMusic(){
        System.out.println("Music Playing ... ");
    }

    @Override
    void openFile(){
        System.out.println("\nOpening file ...");
        playMusic();
    }

    public void setLength(String data){
        this.length = data;
    }
    public void setBitrate(int data){
        this.bitrate = data;
    }
    public void setFeaturedArtists(String data){
        this.featuredArtists = data;
    }
    public void setTitle(String data){
        this.title = data;
    }
    public void setGenre(String data){
        this.genre = data;
    }
    
    @Override
    public int getVideoQuality(){
        return -1;
    }
    @Override
    public int getNumberOfPages(){
        return -1;
    }
    @Override
    String getLength(){
        return this.length;
    }
    @Override
    public int getBitrate(){
        return this.bitrate;
    }
    @Override
    public String getFeaturedArtists(){
        return this.featuredArtists;
    }
    @Override
    String getTitle(){
        return this.title;
    }
    @Override
    public String getGenre(){
        return this.genre;
    }
}
