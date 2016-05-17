package com.oca.classDesign.abstractClasses;

/**
 * Class access modifier allowed on top level class: default or public.
 *
 * Created by Mat on 17/05/2016.
 */
public abstract class Building {

//    final abstract String printName();    // DOES NOT COMPILE, illegal combination
//    private abstract String printName();  // DOES NOT COMPILE, illegal combination
    protected abstract String printName();

}

/**
 * Default class access modifier.
 */
class HiddenBuilding extends Building {
    protected String printName() {
        return "I'm a default access modifier Building.";
    }
}