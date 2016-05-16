package com.oca.classDesign;

/**
 * @author mcrassin
 * @since 16/05/2016
 */
public class PenguinProgram {

    public static void main(String[] args) {
        Penguin p = new Penguin("Jay");
        System.out.println(p);

        System.out.println("p instanceof Object:" + (p instanceof Object));
    }

}
