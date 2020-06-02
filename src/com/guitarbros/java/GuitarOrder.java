package com.guitarbros.java;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GuitarOrder {

    private List<Guitar> myOrder;
    private int orderSize, varType;
    private Scanner in;
    private String instrumentType;
    private String thingType;
    private boolean isValueRight;

    public GuitarOrder() {
        myOrder = new ArrayList<>();
    }

    public void welcomeMessage() {
        System.out.println("Welcome to Guitar Bros.");
        System.out.println("We specialize in Guitars");
        buildHouse();
    }

    private void buildHouse() {
        System.out.println("Your dream guitar is waiting");
        varChoice();
        /*varChoice2();
        varChoice3();
        varChoice4();
        //myOrder.add(new Guitar(instrumentType,thingType,orderSize));*/
        //orderDone();
    }

    private void printResult() {
        System.out.println("THANK YOU");
        System.out.println("Your order has the following:");
        for(Guitar myGuitar : myOrder) {

        }
    }

    private void orderDone() {
        System.out.println("Does this complete your order? Y for yes, N for no");
        String val = in.next();
        switch (val) {
            case "Y":
            case "y":
                printResult();
                break;
            case "N":
            case "n":
                buildHouse();
                break;
            default:
                System.out.println("You have entered an incorrect value. Please try again");
                orderDone();
                break;
        }

    }

    private void varChoice() {
        System.out.println("What guitar type would you prefer?");
        System.out.println("Press 1 for Electric, 2 for Acoustic or 3 for Hybrid");
        if(!verifyNumberInput()) {
            System.out.println("You have entered an incorrect value. Please try again");
            varChoice();
        } else {
            if(varType > 3) {
                System.out.println("You have entered a number larger than 3. Please try again");
                varChoice();
            } else {
                switch (varType) {
                    case 1:
                        instrumentType = "Electric";
                        varChoice2();
                        break;
                    case 2:
                        instrumentType = "Acoustic";
                        varChoice3();
                        break;
                    default:
                        instrumentType = "Hybrid";
                        varChoice4();
                        break;
                }
            }
        }
    }

    private void varChoice2() {
        System.out.println("What style would you prefer?");
        System.out.println("Press 1 for Fender Stratocaster: $700, 2 for Gibson Les Paul: $600 or 3 for Gibson Flying V: $1200");
        if(!verifyNumberInput()) {
            System.out.println("You have entered an incorrect value. Please try again");
            varChoice2();
        } else {
            if(varType > 3) {
                System.out.println("You have entered a number larger than 3. Please try again");
                varChoice2();
            } else {
                switch (varType) {
                    case 1:
                        thingType = 700 + "$700 Fender Stratocaster - model#EG6400, UPC# 1132438488";
                        orderDone();
                        break;
                    case 2:
                        thingType = "$600 Gibson Les Paul - model#EG7400, UPC# 1135327446";
                        orderDone();
                        break;
                    default:
                        thingType = "$1200 Gibson Flying V - model#EG8600, UPC# 1136433398";
                        orderDone();
                        break;
                }
            }
        }
    }

    private void varChoice3() {
        System.out.println("What style would you prefer?");
        System.out.println("Press 1 for Dreadnaught: $200, 2 for Parlour: $250 or 3 for Auditorium: $400");
        if(!verifyNumberInput()) {
            System.out.println("You have entered an incorrect value. Please try again");
            varChoice3();
        } else {
            if(varType > 3) {
                System.out.println("You have entered a number larger than 3. Please try again");
                varChoice3();
            } else {
                switch (varType) {
                    case 1:
                        thingType = "$200 Dreadnought - model#  AG3219, UPC# 3534019753";
                        orderDone();
                        break;
                    case 2:
                        thingType = "$250 Parlour - model# AG3319, UPC# 3536528647";
                        orderDone();
                        break;
                    default:
                        thingType = "$400 Auditorium - model# AG4019, UPC# 3538607326";
                        orderDone();
                        break;
                }
            }
        }
    }

    private void varChoice4() {
        System.out.println("Our specialty hybrid guitar is $2000.");
        System.out.println("Would you like to proceed. Y for yes, N for no.");
        String val = in.next();
        switch (val) {
            case "Y":
            case "y":
                thingType = "$2000 Acoustic/electric hybrid - model# HB00001,  UPC# 3538600001";
                System.out.println("You have chosen our specialty Hybrid guitar. Congratulations!");
                orderDone();
                break;
            case "N":
            case "n":
                buildHouse();
                break;
            default:
                System.out.println("You have entered an incorrect value. Please try again");
                orderDone();
                break;
        }
    }

    /*
    private void shipSize() {
        System.out.println("How many guitars would you like?");
        in = new Scanner(System.in);
        isValueRight = false;
        try {
            orderSize = in.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("You have entered an incorrect value. Please try again");
            shipSize();
        }
    }

     */

    private boolean verifyNumberInput() {
        in = new Scanner(System.in);
        try {
            varType = in.nextInt();
            isValueRight = true;
        } catch (InputMismatchException ex) {
            isValueRight = false;
        }
        return isValueRight;
    }

}
