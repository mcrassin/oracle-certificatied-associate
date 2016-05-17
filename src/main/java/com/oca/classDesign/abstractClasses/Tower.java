package com.oca.classDesign.abstractClasses;

/**
 * Created by Mat on 17/05/2016.
 */
public class Tower extends Building {

    protected String printName() {
        return null;
    }

    public static void main(String[] args) {
        HiddenBuilding hiddenBuilding = new HiddenBuilding();   // Same package, hiddenBuilding is accessible
        hiddenBuilding.printName();

    }
}
