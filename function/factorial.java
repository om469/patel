import java.util.Scanner;

public class factorial {
    public static int factorial(int n) {
      
        int f=1;

        for (int i=1; i<=n; i++){
         f= f*i;
        }
        return f;
        /* BINOMIAL COEFFICIENT */

    }
    public static int bicoeffi(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial (n-r);

        int bicoeffi= fact_n/ (fact_nmr * fact_r);
        return bicoeffi;
    
    }
    /////////////////////////////////////////////////
    // FUNCTOION TO CALL INT SUM.
    public static int sum(int a, int b ) {
        return a+b;
    }
    
    //function to call float sum
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args []){
    // System.out.println(bicoeffi(5, 2));
     System.out.println(sum(3,5));
     System.out.println(sum(2.2f, 5.8f));
    }
}
