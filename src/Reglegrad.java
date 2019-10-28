public class Reglegrad {

    public static void main(String[] args) {


        long n;
        n = 21;
        String regle = (n > 0) ? faireRegleGrad(n) : "La longueur de regle fournie doit être positive";
        System.out.println(regle);
    }

    public static String faireRegleGrad(long n) {
        String regle1;
        String regle;

        regle1 = "";


        for (int cpt1 = 1; cpt1 <= n; cpt1++) {
            //regle1 = "-";

            if (cpt1 % 5 != 0) {                     // Si division modulo par 5 rend un chiffre <> 0 => on ecrit '+'
                regle1 = regle1 + "-";
            } else {
                regle1 = regle1 + "+";
            }
        }


        regle = "[" + regle1 + "]";
        return "regle = " + regle;
    }
// Autre choix possible !!!!

    public static String regle(int n) {
        /*
        String chaine = "[";
        for (int compteur = 0; compteur < n; ++compteur) {
            chaine+= ((compteur + 1)% 5 == 0)?  "+" :  "-";
        }
        chaine = chaine + "]";
        return chaine;

         */
        return regle(n, "[", '-', '+', "]", 5);
    }

    public static String regle(int n, String begin, char fill, char div, String end, int unit) {
        String chaine = begin;
        for (int compteur = 0; compteur < n; ++compteur) {
            chaine += ((compteur + 1) % unit == 0) ? div : fill;
        }
        chaine = chaine + end;
        return chaine;
    }
}
