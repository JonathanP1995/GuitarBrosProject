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
        //myOrder.add(new Guitar(instrumentType,thingType,orderSize));
        orderDone();*/
    }

    private void printResult() {
        System.out.println("THANK YOU");
        for (Guitar myGuitar : myOrder) {
            System.out.println("You have ordered the:" + "");
            System.out.println(myGuitar.getThingType() + "");
            System.out.println();
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
        System.out.println("Press 1 for Fender Stratocaster, 2 for Gibson Les Paul or 3 for Gibson Flying V");
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
                        thingType = "Fender Stratocaster";
                        orderDone();
                        break;
                    case 2:
                        thingType = "Gibson Les Paul";
                        orderDone();
                        break;
                    default:
                        thingType = "Gibson Flying V";
                        orderDone();
                        break;
                }
            }
        }
    }

    private void varChoice3() {
        System.out.println("What style would you prefer?");
        System.out.println("Press 1 for Dreadnaught, 2 for Parlour or 3 for Auditorium");
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
                        thingType = "Dreadnaught";
                        orderDone();
                        break;
                    case 2:
                        thingType = "Parlour";
                        orderDone();
                        break;
                    default:
                        thingType = "Auditorium";
                        orderDone();
                        break;
                }
            }
        }
    }

    private void varChoice4() {
        System.out.println("You have chosen our specialty Hybrid guitar. Congradulations!");
        orderDone();
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
