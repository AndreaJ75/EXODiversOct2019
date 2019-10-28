public class Classeur {

    public static void main(String[] args) {


        //String col;          // colonne du classeur
        String lin;          // ligne du classeur


        long n = 5;          // compteur de ligne
        long i = 3;           // compteur de colonne


        if (n > 0 && i > 0) {
            String classe1 = faireclasseur(n);
            String clasVide ;
            System.out.println(classe1);
            for (int cpt = 1; cpt <= i; cpt++) {
                clasVide = classeurVide(n);
                System.out.println(clasVide);
            }
            System.out.println(classe1);
        } else {
            System.out.println(" les longueurs fournies sont invalides");
        }

    }

    public static String faireclasseur(long n) {
        String classe1;
        String classe;

        classe1 = "+";

        for (int cpt = 1; cpt <= n; cpt++) {
            classe1 = classe1 + "-";
        }

        classe1 = classe1 + "+";

        classe = classe1;
        return classe;
    }


    public static String classeurVide(long n) {

        String classe = "|";

        for (int cpt = 1; cpt <= n ; cpt++) {

            classe = classe + " ";
        }
        classe = classe + "|";
        return classe;


    }

}


