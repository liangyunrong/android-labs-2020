package edu.hzuapps.androidlabs.net1814080903237;

public class Thing {
    private String name;
    private int imageId;
    public Thing(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
