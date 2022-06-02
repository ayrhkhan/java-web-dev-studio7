package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc {

    private ArrayList<String> chapters = new ArrayList<>();
    private boolean isBlueRayCompatible = false;

    public DVD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    @Override
    public int printNumberOfTotalSections(){
        System.out.println(chapters.size());
        return chapters.size();
    }

    @Override
    public void spinDisc() {
//        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
        System.out.println("Weee! This is an interface-declared method implemented by the CD class");
    }

    public ArrayList<String> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<String> chapters) {
        this.chapters = chapters;
    }


    public void makeBlueRayCompatible(){
        this.isBlueRayCompatible = true;
        System.out.println("I set blue ray compatible to true in a method in the DVD class");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private String artist;
    private boolean doubleSided;
    private String genre;

}
