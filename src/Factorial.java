public class Factorial {

    public static void main(String[] args) {


        long res = factorial(8) ;
        System.out.println("Factoriel = " + res);
    }

    public static long factorial(long n) {
        if (n < 0) {
            return -999 ;
        } else if (n < 2) {
            return 1;
        }
        // on pourrait avoir un else
        long res = n * factorial(n-1);
        return res;
    }

}
