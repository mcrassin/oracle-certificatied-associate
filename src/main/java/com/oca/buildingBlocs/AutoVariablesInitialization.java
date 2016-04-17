package com.oca.buildingBlocs;

/**
 * @author mcrassin
 * @since 10/04/2016
 */
public class AutoVariablesInitialization {

    static int static1;

    boolean instanceVariable1;
    int instanceVariable2;
    double instanceVariable3;
    char instanceVariable4;

    public AutoVariablesInitialization() {
        // no initialization here, only default values
        System.out.println("constructor");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
        super.finalize();
    }

    public static void main(String[] args) {
        AutoVariablesInitialization testClass = new AutoVariablesInitialization();
        System.out.println("1/ Automatically init");
        System.out.println("boolean class variable, instanceVariable1:" + testClass.instanceVariable1);
        System.out.println("int class variable, instanceVariable1:" + testClass.instanceVariable2);
        System.out.println("double class variable, instanceVariable2:" + testClass.instanceVariable3);
        System.out.println("char class variable, instanceVariable2:" + testClass.instanceVariable4 + " (intValue=" + (int) testClass.instanceVariable4 + ")");
        System.out.println("long static class variable, static1:" + AutoVariablesInitialization.static1);

        System.out.println("2/ NOT Automatically init");
        int local1;
        double local2;
//        System.out.println("int local variable, local1:" + local1);
//        System.out.println("double local variable, local1:" + local2);
    }

}
