package com.example.mehenditheart;

public class ListModel {

    public ListModel(int imageID){
        this.imageID = imageID ;
    }
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    private String count ;
    private int imageID;

}
