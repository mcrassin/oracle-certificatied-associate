package com.oca.operatorsAndStatements;

/**
 * @author mcrassin
 * @since 10/04/2016
 */
public class ClassContructorAndFinalizer {

    public ClassContructorAndFinalizer() {
        // no initialization here, only default values
        System.out.println("constructor of our object");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
        super.finalize();
    }

    public static void main(String[] args) {
        {
            {
                ClassContructorAndFinalizer testClass = new ClassContructorAndFinalizer();
                System.out.println("Object will be destroy");
            }
        }
        System.out.println("Finalize is not called all the time.");
    }

}
