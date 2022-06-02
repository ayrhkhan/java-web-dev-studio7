package org.launchcode.studio7;

import java.lang.reflect.Array;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String diskType;


//    private String discName;
//    private int discCapacity;
//    private int yearReleased;

//    private String genre;
//    private static final int STORAGELIMIT;
//    private double storageAmountUsed;



//constructor

//    public BaseDisc(String discName, int discCapacity, int yearReleased) {
//        this.discName = discName;
//        this.discCapacity = discCapacity;
//        this.yearReleased = yearReleased;
//    }

    public BaseDisc(String aName, int maxCapacity, String aType, int someUsedCapacity ) {
        name = aName;
        storageCapacity = maxCapacity;
        diskType = aType;
        capacityUsed =  checkCapacity(someUsedCapacity);
        remainingCapacity = spaceLeft();
    }


//Methods


    private int checkCapacity(int dataWritten){
        if(storageCapacity < dataWritten){
            return storageCapacity;
        }
        return dataWritten;
    }

    private int spaceLeft(){
        return storageCapacity - capacityUsed;
    }


    public String diskInfo(){
        String output = String.format("\nDisk name: %s\nMax capacity: %d" +
                "\nSpace used: %d +" +
                "\nAvailable space: %d\n", name, storageCapacity,capacityUsed,remainingCapacity);
        return output;
    }

    public String writeData(int dataSize){
        if(dataSize > remainingCapacity){
            return "Not enough disc space!";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;

        return "Data written to disc. Remaining space = " + remainingCapacity;
    }

    public abstract int printNumberOfTotalSections();



//    public void reportDiscInformation(){
//        System.out.println(discName);
//    }

//    public boolean checkCompatibility(String deviceType){
//        if(deviceType.matches("Computer")){
//            return true;
//        }else if(deviceType.matches("CD Player")){
//            return true;
//        }else if(deviceType.matches("DVD Player")){
//            return true;
//        }else{
//            return false;
//        }
//
//    }
//
//
//    public void skipTrack(Array tracks){
//        //if at current index move to the next index number
//        int currentTrackIndex = 0;
//
//        while(tracks.length < currentTrackIndex){
//
//
//        }
//    }

//    i belive in ammaarah and mara and ammarah


}
