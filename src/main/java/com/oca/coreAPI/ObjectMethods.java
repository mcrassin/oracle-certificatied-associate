package com.oca.coreAPI;

/**
 * Shows default Object equals method behavior: identical to obj1 == obj2
 *
 * @author mcrassin
 * @since 31/05/2016
 */

class Object1 {
    int data;

    public Object1(int data) {
        this.data = data;
    }
}
class Object2 {
    int data;

    public Object2(int data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj instanceof Object2 &&
                data == ((Object2) obj).data;
    }
}

public class ObjectMethods {

    public static void main(String[] args) {
        /**
         *
         */
        Object1 obj11 = new Object1(1);
        Object1 obj12 = new Object1(1);

        System.out.println("Object1 checks, default equals method:");
        if (obj11 == obj12) {
            System.out.println("Object addresses equal");
        } else {
            System.out.println("Object addresses NOT equal");
        }
        if (obj11.equals(obj12)) {
            System.out.println("Objects equal");
        } else {
            System.out.println("Objects NOT equal");
        }
        System.out.println();

        /**
         *
         */
        Object2 obj21 = new Object2(1);
        Object2 obj22 = new Object2(1);

        System.out.println("Object2 checks, overridden equals method:");
        if (obj21 == obj22) {
            System.out.println("Object addresses equal");
        } else {
            System.out.println("Object addresses NOT equal");
        }
        if (obj21.equals(obj22)) {
            System.out.println("Objects equal");
        } else {
            System.out.println("Objects NOT equal");
        }
        System.out.println();
    }

}
