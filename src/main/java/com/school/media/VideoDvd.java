package com.school.media;

public class VideoDvd extends Mediateke {
    private String genre;
    private String length;
    private int videoQuality;
    private String title;

    public VideoDvd(String fname,String iType, int size, String author,String title, String length, int quality, String genre){
        super(fname, iType, size, author);
        this.length = length;
        this.videoQuality = quality;
        this.genre = genre;
        this.title = title;
    }
    
    @Override
    void read(){
        System.out.println("Cant open this file.");
    }
    
    @Override
    void playMusic(){
        System.out.println("Cant open this file.");
    }
    
    @Override
    void playVideo(){
        System.out.println("Video Playing ... ");
    }

    @Override
    void openFile(){
        System.out.println("Opening file ... ");
        playVideo();
    }

    @Override
    public String toString(){

        return "Music Filename : " + getfileName()
                + "\nMusic format : " + getitemType()
                + "\nMusic size : " + getsizeInMb() + "mb"
                + "\nMusic Author : " + getauthor()
                + "\nVideo Title : " + this.title
                + "\nVideo Duration : " + this.length
                + "\nVideo genre : " + this.genre
                + "\nVideo quality : " + this.videoQuality;

    }

    
    void setGenre(String data){
        this.genre = data;
    }
    void setTitle(String data){
        this.title = data;
    }
    void setVideoQuality(int data){
        this.videoQuality = data;
    }
    void setLength(String data){
        this.length = data;
    }
    String setGenre(){
        return this.genre;
    }
    String setTitle(){
        return this.title;
    }
    int setVideoQuality(){
        return this.videoQuality;
    }
    String setLength(){
        return this.length;
    }
    
    @Override
    public int getNumberOfPages(){
        return -1;
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
    String getTitle(){
        return this.title;
    }
    @Override
    String getLength(){
        return this.length;
    }
    @Override
    int getVideoQuality(){
        return this.videoQuality;
    }
    @Override
    String getGenre(){
        return this.genre;
    }
}
