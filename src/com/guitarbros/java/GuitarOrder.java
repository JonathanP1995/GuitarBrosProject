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
        varChoice2();
        varChoice3();
        varChoice4();
        shipSize();
        myOrder.add(new Guitar(instrumentType,thingType,orderSize));
        orderDone();
    }

    private void printResult() {
        System.out.println("THANK YOU");
        for (Guitar myGuitar : myOrder) {
            System.out.println("Your guitar order has the following: ");
            System.out.println(myGuitar.getorderSize() +" guitars ");
            //NEED A PLURALIZATION SYSTEM IN CASE MORE THAN 1 IS CHOSEN! "guitar or guitar's
            System.out.println(myGuitar.getGuitarType() + "");
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
                        break;
                    case 2:
                        instrumentType = "Acoustic";
                        break;
                    default:
                        instrumentType = "Hybrid";
                        break;
                } if(varType == 1) {
                    varChoice2();
                } if(varType == 2) {
                    varChoice3();
                } if(varType == 3) {
                    varChoice4();
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
                        break;
                    case 2:
                        thingType = "Gibson Les Paul";
                        break;
                    default:
                        thingType = "Gibson Flying V";
                        break;
                } if(varType == 1) {
                    shipSize();
                } if(varType == 2) {
                    shipSize();
                } if(varType == 3) {
                    shipSize();
                }
            }
        }
    }

    private void varChoice3() {
        System.out.println("What style would you prefer?");
        System.out.println("Press 1 for Dreadnaught, 2 for Parlour or 3 for Auditorium");
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
                        thingType = "Dreadnaught";
                        break;
                    case 2:
                        thingType = "Parlour";
                        break;
                    default:
                        thingType = "Auditorium";
                        break;
                } if(varType == 1) {
                    shipSize();
                } if(varType == 2) {
                    shipSize();
                } if(varType == 3) {
                    shipSize();
                }
            }
        }
    }

    private void varChoice4() {
        System.out.println("You have chosen our specialty Hybrid guitar. Congradulations!");

    }

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
