package com.oppsproject.khalid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Patient patient = new Patient("Tanvir", 25,
               new Eye("Left Eye", "Short Shited", "Blue", true),
               new Heart("Heart", "Normal", 65),
               new Stomach("Stomach","PUD", false),
               new Skin( "Skin", "Burned", "white", 40));


        System.out.println("name " + patient.getName());
        System.out.println("age "+ patient.getAge());

        Scanner scan = new Scanner(System.in);

        boolean shouldFinish = false;
        while (!shouldFinish){
            System.out.println("Choose an organ: " +
                    "\n\t1. Left Eye" +
                    "\n\t2. Heart" +
                    "\n\t3. Stomach"+
                    "\n\t4. Skin" +
                    "\n\t5. Quit"
                    );




            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    patient.getEye().getDetails();
                    if (patient.getEye().isOpend()){
                        System.out.println("\t\t1. close the eye.");
                        if (scan.nextInt() == 1){
                            patient.getEye().close();
                        }else {
                            continue;
                        }
                    }
                    else {
                        System.out.println("\t\t1. Open the eye.");

                        if (scan.nextInt() == 1){
                            patient.getEye().open();
                        }
                        else {
                            continue;
                        }
                    }

                    break;

                case 2:
                    patient.getHeart().getDetails();
                    patient.getHeart().getRate();
                    System.out.println("\t\t1. Change the hearte rate.");
                    if (scan.nextInt() == 2){
                        System.out.println("Enter the new heart rate.");
                        int newHeartRate = scan.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate change to: " + patient.getHeart().getRate());
                    }else {
                        continue;
                    }break;

                case 3:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish = true;
                    break;
            }
        }
    }
}
