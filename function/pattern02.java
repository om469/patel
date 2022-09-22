public class pattern02 {
    public static void hollow_rectangle(int n, int m) {
        int totRow = n;
        int totCol = m;

        for (int i = 1; i <= totRow; i++) {
            for (int j = 1; j <= totCol; j++) {
                if (i == 1 || i == totRow || j == 1 || j == totCol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //// INVERTED HALF-PYRAMID////////
    }

    public static void inverted_rotated_half_pyramid(int n) {
        // outer
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        ////// INVERTED HALD-PYRAMID WITH NUMBERS///////

    }

    public static void inverted_rotated_half_pyramid_number(int n) {
        // outer
        for (int i = 1; i <= n; i++) {
            // iner
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //////////// FLOYD'S TRIANGLE//////////////

    public static void floyd_triangle(int n) {
        int counter = 1;
        // outer
        for (int i = 1; i <= n; i++) {
            // inner HOW MANY TIMES WILL COUNTER BE PRINTED
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    //////// ONE ZERO TRIANGEL////////////

    public static void one_zero_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    // even
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    ///// BUTTERFLY/////
    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2ND HALF
        for (int i = n; i >= 1; i--) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    ///// SOLID RHOMBUS////////

    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            /// star
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /////// HOLLOW RHOMBUS///////////

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            } /// hollow rectangle-star
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    

    //// KITE//////

    public static void kite(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            } // star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // hollow_rectangle(8,12);
        // inverted_rotated_half_pyramid(9);
        // inverted_rotated_half_pyramid_number(9);
        // floyd_triangle(15);
        // one_zero_triangle(12);
        // butterfly(4);
        // solid_rhombus(5);
        hollow_rhombus(5);
        // kite(5);
    }
}
