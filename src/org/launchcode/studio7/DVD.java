package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String name, int maxCapacity, int usedCapacity, String type) {
        super(name, maxCapacity, usedCapacity, type);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570-1600 rpm");
    }

    @Override
    public void readData() {
        System.out.println("I love this movie!");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
