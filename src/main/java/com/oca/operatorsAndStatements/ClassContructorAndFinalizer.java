package com.oca.operatorsAndStatements;

/**
 * Constructor is always called.
 * Finalizer is called 0 or 1 time - java is deciding that.
 *
 * This example will show that we can't predict how java will call the finalize method, even if we ask him to clean up,
 *  the number of time it will call finalize depends on the memory usage !
 * Creating a very large number of object will force java to clean up at some point (and call finalize method),
 *  even without System.gc() as it will really needs to free memory.
 *
 * @author mcrassin
 * @since 10/04/2016
 */
public class ClassContructorAndFinalizer {

    static int count = 0;

    public ClassContructorAndFinalizer() {
        // no initialization here, only default values
        System.out.println("constructor of our object");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize " + count++);
        super.finalize();
    }

    public static void main(String[] args) {
        {
            for (int i=0; i<1000; i++)
            {
                ClassContructorAndFinalizer testClass = new ClassContructorAndFinalizer();
                System.out.println("Object will be destroy");

            } // after this point, every objects created are not accessible anymore, and thus should be destroyed, but now right away!
        }

        System.out.println("Finalize is not called all the time, depends on java memory at the time.");

        // ask java to perform a garbage collection => as we created a lot of object,
        //  it will call finalize on our objects ClassContructorAndFinalizer, to free up memory if needed !
        System.gc();
    }

}
