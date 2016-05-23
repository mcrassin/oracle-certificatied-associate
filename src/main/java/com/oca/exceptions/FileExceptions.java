package com.oca.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Exception & files.
 *  new File("") does not throw any error, even if file does not exist.
 *  new FileInputStream(f) DOES throw a FileNotFoundException if file does not exist.
 *
 * @author mcrassin
 * @since 23/05/2016
 */
public class FileExceptions {

    public static void main(String[] args) {

        try {
            File myFile = new File("doesNotExist.txt");
            FileInputStream fis = new FileInputStream(myFile);  // throws FileNotFoundException !
            fis.close(); // never reach

        } catch (IOException e) { // FileNotFoundException extends IOException.
            e.printStackTrace();
        } /*catch (FileNotFoundException e) { // DOES NOT COMPILE, exception has already been caught.
            e.printStackTrace();
        }*/
    }

}
