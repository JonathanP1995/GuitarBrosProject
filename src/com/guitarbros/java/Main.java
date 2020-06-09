package com.guitarbros.java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //guitarOrder();
        // exampleSerial();
    }

    public static void guitarOrder() {
        GuitarOrder kiosk = new GuitarOrder();
        kiosk.welcomeMessage();
    }

    public static void exampleSerial() {
        ArrayList<AbstractAcoustic> upc = new ArrayList<>();
        for(int i = 0; i > upc.size(); i++) {
            System.out.println(upc.get(i).getSerialUPC());
        }

    }

}
