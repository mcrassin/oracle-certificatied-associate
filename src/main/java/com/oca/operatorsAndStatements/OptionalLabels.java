package com.oca.operatorsAndStatements;

/**
 * @author mcrassin
 * @since 17/04/2016
 */
public class OptionalLabels {

    public static void main(String[] args) {
        // not an infinite loop
        int code = 0;
        WHILE_LABEL: do {
            System.out.println("while code=" + code);

            if (code >= 10) {
                break WHILE_LABEL;
            }
            code++;

        } while (true);

        System.out.println();

        // optional labels 'for' loops
        System.out.print("regular search: ");
        searchFunction(6);
        System.out.print("optional label break search: ");
        labelSearchFunction(6);

        System.out.println();

        //
        whileAndSwitch();
        System.out.println();

        // 'continue'
        continueLbael();
        System.out.println();
    }

    private static void whileAndSwitch() {
        System.out.println("Switch statement inside a for with optional label:");

        FOR_LABEL: for (int i=0; i<5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i=0");
                    break;
                case 1:
                    System.out.println("i=1");
                    break;
                case 3:
                    break FOR_LABEL;
                case 4:
                    System.out.println("i=4");
                    break;
                default:
                    System.out.println("default");
                    break;
            }
        }
    }

    private static void continueLbael() {
        System.out.println("Example of continue & optional label:");

        int ind = 0;
        MAIN_WHILE: while (ind < 10) {
            ind++;

            for (int i=0; i<2; i++) {
                if (ind <= 9) {
                    continue MAIN_WHILE;
                }
            }
            System.out.println("while at index " + ind);
        }
    }

    static void labelSearchFunction(int value) {
        int[][] values = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int count = 0;
        int positionX=-1, positionY=-1;
        MAIN_LOOP: for (int i=0; i<values.length; i++) {
            for (int j=0; j<values[i].length; j++) {
                count++;
                if (values[i][j] == value) {
                    positionX = i;
                    positionY = j;
                    break MAIN_LOOP;
                }
            }
        }

        if (positionX != -1 && positionY != -1) {
            System.out.println("Value '" + value + "'" + " at (" + positionX + "," + positionY + ") in count=" + count);
        }
    }
    static void searchFunction(int value) {
        int[][] values = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int count = 0;
        int positionX=-1, positionY=-1;
        MAIN_LOOP: for (int i=0; i<values.length; i++) {
            for (int j=0; j<values[i].length; j++) {
                count++;
                if (values[i][j] == value) {
                    positionX = i;
                    positionY = j;
                    break;
                }
            }
        }

        if (positionX != -1 && positionY != -1) {
            System.out.println("Value '" + value + "'" + " at (" + positionX + "," + positionY + ") in count=" + count);
        }
    }

}
