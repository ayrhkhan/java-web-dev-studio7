package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc{

    private ArrayList<String> trackList = new ArrayList<>();

    public CD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    @Override
    public int printNumberOfTotalSections(){
        System.out.println(String.format("This CD has %o tracks on it", trackList.size()));
        return trackList.size();
    }

    @Override
    public void spinDisc() {
//        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
        System.out.println("Weee! This is an interface-declared method implemented by the CD class");
    }


    public ArrayList<String> getTrackList(){
        return trackList;
    }

    public void setTrackList(ArrayList<String> trackList){
        this.trackList = trackList;
    }

    // TODO: Implement your custom interface.



    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

//
//    private String artist;
//    private String album;
//    private String genre;

}
