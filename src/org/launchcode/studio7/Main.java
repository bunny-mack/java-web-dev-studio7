package org.launchcode.studio7;

import java.util.HashMap;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("It's Britney, Bitch", 700, 350, "CD-R");
        DVD dvd = new DVD("Pride and Prejudice", 5000, 3000, "DVD-RW");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();

        System.out.println(cd.writeData(300));
        System.out.println(dvd.writeData(1000000));

    }
}
