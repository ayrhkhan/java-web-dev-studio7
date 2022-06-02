package org.launchcode.studio7;

public interface OpticalDisc {

     String name = "Andrea";
     int discSpinMaxSpeed = 500;

     //andies complete code
//     constants
     int cdMaxSpeed = 300;
     int dvdMaxSpeed = 600;

     void spinDisc();



     static String getName(){
          return name + "say hello";
     }

     static int returnMaxSpeed(){
          return discSpinMaxSpeed;
     }

     default int spinDiscMaxSpeed(String discType){
          System.out.println("i am a static method called from the interface");
          if(discType == "CD"){
               System.out.println(String.format("CDs can spin up to %o rpm", cdMaxSpeed));
               return cdMaxSpeed;
          }else{
               System.out.println(String.format("DVDs can spin up to %o rpm", dvdMaxSpeed));
               return dvdMaxSpeed;
          }
     }

     static int getCdMaxSpeed(){
          System.out.println(cdMaxSpeed);
          return cdMaxSpeed;
     }


     public int printNumberOfTotalSections();


}
