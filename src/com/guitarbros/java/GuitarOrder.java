package com.guitarbros.java;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import com.guitarbros.java.SerialNumbers;

public class GuitarOrder{

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
        System.out.println("We specialize in Guitars.");
        buildHouse();
    }

    private void buildHouse() {
        System.out.println("Your dream guitar is waiting.");
        varChoice();
        shipSize();
        myOrder.add(new Guitar(instrumentType,thingType,orderSize));
        orderDone();
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
        System.out.println("Press 1 for Fender Stratocaster:$700, 2 for Gibson Les Paul:$600 or 3 for Gibson Flying V:$1200");
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
                        thingType = "Fender Stratocaster - model#EG6400, UPC# 1132438488";
                        break;
                    case 2:
                        thingType = "Gibson Les Paul - model#EG7400, UPC# 1135327446";
                        break;
                    default:
                        thingType = "Gibson Flying V - model#EG8600, UPC# 1136433398";
                        break;

                }
            }
        }
    }

    private void varChoice3() {
        System.out.println("What style would you prefer?");
        System.out.println("Press 1 for Dreadnaught:$200, 2 for Parlour:$250 or 3 for Auditorium:$400");
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
                        thingType = "Dreadnought - model#AG3219, UPC# 3534019753";
                        break;
                    case 2:
                        thingType = "Parlour - model#AG3319, UPC# 3536528647";
                        break;
                    default:
                        thingType = "Auditorium - model#AG4019, UPC# 3538607326";
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
                break;
            case "N":
            case "n":
                varChoice();
                break;
            default:
                System.out.println("You have entered an incorrect value. Please try again");
                break;
        }
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

/*   private void printResult() {
        System.out.println("THANK YOU");
        System.out.println("Your guitar order has the following: ");
        for (Guitar myGuitar : myOrder) {
            System.out.println(myGuitar.getorderSize() +" guitars ");
            System.out.println(myGuitar.getGuitarType() + "");
            System.out.println(myGuitar.getThingType() + "");
*/

    private void showStarBorder() {
        for (int i = 0; i < 92; i++) {
            System.out.print("*");
        }
    }
    private void printResult() {
        showStarBorder();
        String company = String.format("%51s", "Guitar Bros");
        String address = String.format("%54s", "777 Awesome Avenue");
        String cityState = String.format("%54s", "Showcase City, MO");
        System.out.println();
        System.out.println(company);
        System.out.println(address);
        System.out.println(cityState);
        showStarBorder();
        showColumns();
    }


    private void showColumns () {
        for (Guitar myGuitar : myOrder) {
            String quantity = String.format("%5s", "QTY");
            String price = String.format("%15s", "PRICE");
            String GuitarName = String.format("%25s", "Guitar Name");
            String GuitarType = String.format("%15s", "Guitar Type");
            String Model = String.format("%15s", "Model#");
            String UPC = String.format("%15s", "UPC");
            System.out.println();
            System.out.print(quantity);
            System.out.print(price);
            System.out.print(GuitarName);
            System.out.print(GuitarType);
            System.out.print(Model);
            System.out.println(UPC);
            System.out.println(myGuitar.getOrderSize());
            System.out.println(myGuitar.getGuitarType() + "");
            System.out.println(myGuitar.getThingType() + "");
        }

        showStarBorder();
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
                break;

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
