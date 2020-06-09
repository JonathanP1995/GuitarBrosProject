package com.guitarbros.java;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GuitarOrder{

    private int price = 10;
    private int total = 0;
    private List<Guitar> myOrder;
    private int orderSize, varType;
    private Scanner in;
    private String instrumentType;
    private String thingType, thingColor1;
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
        //shipSize();
        myOrder.add(new Guitar(instrumentType,thingType,orderSize,thingColor1));
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
                        instrumentType = "Acoustic/Electric Hybrid";
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
                        thingType = "$700     -     Fender Stratocaster     -    Electric       -      #EG6400     -    1132438488       -       000001";
                        total = total + 700;
                        varChoice5();
                        break;
                    case 2:
                        thingType = "$600     -       Gibson Les Paul      -     Electric       -      #EG7400     -    1135327446       -       000002";
                        total = total + 600;
                        varChoice5();
                        break;
                    default:
                        thingType = "$1,200     -     Gibson Flying V      -     Electric       -      #EG8600     -    1136433398       -       000003";
                        total = total + 1200;
                        varChoice5();
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
                        thingType = "$200       -       Dreadnought      -       Acoustic       -      #AG3219     -    3534019753       -       000004";
                        total = total + 200;
                        varChoice5();
                        break;
                    case 2:
                        thingType = "$400         -       Parlour        -       Acoustic       -      #AG3319     -    3536528647       -       000005";
                        total = total + 400;
                        varChoice5();
                        break;
                    default:
                        thingType = "$250           -   Auditorium       -       Acoustic        -     #AG4019     -    3538607326       -       000006";
                        total = total + 250;
                        varChoice5();
                        break;

                }
            }
        }
    }

    private void varChoice4() {
        System.out.println("Our Hybrid guitar is $2000.");
        System.out.println("Would you like to proceed. Y for yes, N for no.");
        String val = in.next();
        switch (val) {
            case "Y":
            case "y":
                thingType = "$2000      -       Specialty       -         Hybrid       -      #HB00001     -    3538600001      -       000007";
                total = total + 2000;
                varChoice5();
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

    private void varChoice5() {
        System.out.println("What color do you prefer?");
        System.out.println("Options 1-3 have no added cost");
        System.out.println("Options 4-6 have $10 cost");
        System.out.println("Press 1 for Solid Color, 2 for Multi Color or 3 for Wood Grain");
        System.out.println("Press 4 for RED, 5 for BLUE or 6 for YELLOW");
        if(!verifyNumberInput()) {
            System.out.println("You have entered an incorrect value. Please try again");
            varChoice5();
        } else {
            if(varType > 6) {
                System.out.println("You have entered a number larger than 6. Please try again");
                varChoice5();
            } else {
                switch (varType) {
                    case 1:
                        thingColor1 = "No added charge:  Solid White";
                        break;
                    case 2:
                        thingColor1 = "No added charge:  Multi Color";
                        break;
                    case 3:
                        thingColor1 = "No added charge:  Wood Grain";
                        break;
                    case 4:
                        thingColor1 = "$10      -             RED";
                        total = total + 10;
                        break;
                    case 5:
                        thingColor1 = "$10      -             BLUE";
                        total = total + 10;
                        break;
                    default:
                        thingColor1 = "$10      -            YELLOW";
                        total = total + 10;
                        break;

                }
            }
        }
    }


   /* private void shipSize() {
        System.out.println("How many guitars would you like?");
        in = new Scanner(System.in);
        isValueRight = false;
        try {
            orderSize = in.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("You have entered an incorrect value. Please try again");
            shipSize();
        }
    }*/

/*   private void printResult() {
        System.out.println("THANK YOU");
        System.out.println("Your guitar order has the following: ");
        for (Guitar myGuitar : myOrder) {
            System.out.println(myGuitar.getorderSize() +" guitars ");
            System.out.println(myGuitar.getGuitarType() + "");
            System.out.println(myGuitar.getThingType() + "");
*/

    private void showStarBorder() {
        for (int i = 0; i < 70; i++) {
            System.out.print("\uD83C\uDFB8");
        }
    }
    private void printResult() {
        showStarBorder();
        //---------Main Header----------------------
        String company = String.format("%67s", "Guitar Bros");
        String address = String.format("%70s", "777 Awesome Avenue");
        String cityState = String.format("%70s", "Showcase City, MO");
        String finalTotal = String.format("%5s", "TOTAL:") + "   $" + total;
        System.out.println();
        System.out.println(company);
        System.out.println(address);
        System.out.println(cityState);
        showStarBorder();
        //------Column Header--------------------------
        String price = String.format("%5s", "Price");
        String GuitarName = String.format("%25s", "Guitar Name");
        String GuitarType = String.format("%20s", "Type");
        String Model = String.format("%22s", "Model");
        String UPC = String.format("%18s", "UPC#");
        String Serial = String.format("%24s", "Serial#");
        String GuitarColor1 = String.format("%27s", "Color");
        System.out.println();
        System.out.print(price);
        System.out.print(GuitarName);
        System.out.print(GuitarType);
        System.out.print(Model);
        System.out.print(UPC);
        System.out.println(Serial);
        System.out.println(GuitarColor1);
        //----------------------------
        showColumns();

        System.out.println();
        System.out.println(finalTotal);


    }


    private void showColumns () {
        for (Guitar myGuitar : myOrder) {
            //System.out.println(myGuitar.getOrderSize());
            //System.out.println(myGuitar.getGuitarType() + "");
            System.out.println(myGuitar.getThingType() + "");
            System.out.println(myGuitar.getThingColor1() + "");
            System.out.println();
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
