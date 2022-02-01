package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    public CD(String name, int maxCapacity, int usedCapacity, String type) {
        super(name, maxCapacity, usedCapacity, type);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200-500 rpm");
    }

    @Override
    public void readData() {
        System.out.println("Wow, this is my jam!");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
