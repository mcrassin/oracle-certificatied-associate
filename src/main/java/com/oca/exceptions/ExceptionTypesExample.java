package com.oca.exceptions;

/**
 * Show 3 main types of Throwable:
 *  - Error (ExceptionInInitializerError,...)
 *  - Exception (IOException, ...)
 *      - RuntimeException (NullPointerException,...)
 *
 * @author mcrassin
 * @since 19/05/2016
 */
public class ExceptionTypesExample {

    public void methodWithError() {
        throw new NoClassDefFoundError("major crash, stop it!!");
    }
    public void methodWithRuntimeException() {
        throw new RuntimeException("runtime exception");
    }
    public void methodWithException() throws Exception {
        throw new Exception("any exception ...");
    }

    public static void main(String[] args) {
        ExceptionTypesExample exceptionTypesExample = new ExceptionTypesExample();

        // it's possible to handle Error, even if you shouldn't.
        try {
            exceptionTypesExample.methodWithError();
        } catch (Error error) {

        }

        // no need to declare or catch a runtime=unchecked exception (like Error)
        exceptionTypesExample.methodWithRuntimeException();

        // checked exception should be "declare or handle"
//        exceptionTypesExample.methodWithException();    // DOES NOT COMPILE, unhandled exception
    }
}
