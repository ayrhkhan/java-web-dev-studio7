package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCd = new CD("loud", 640,"CD-R",200);
        DVD myDvd = new DVD("Cherry", 5000, "DVD-R",200);
        // TODO: Call each CD and DVD method to verify that they work as expected.

        myDvd.spinDisc();

        myCd.spinDiscMaxSpeed("CD");

//        parent abstract class methods
//        benefis of abstract class: share behavior amoung related classes; abstraction  - separate what from how

//        call a public method in the abstract class
//        characteristics: doesnt refer to child class fields; doesnt have to be overridden in child class
        System.out.println(myCd.writeData(3));
        System.out.println(myDvd.diskInfo());

//      call abstact class abstract methods
//        have to be implemented in child class
        myCd.setTrackList(new ArrayList<>(Arrays.asList("idk", "morning glory", "tea and talking to jenay", "what time")));
        myCd.printNumberOfTotalSections();



//        child methods
//        methods that are specific to this one type of object; methods that refer to child class fields
        myDvd.makeBlueRayCompatible();
        myDvd.printNumberOfTotalSections();


    }
}
