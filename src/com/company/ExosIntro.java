public class ExosIntro {

    public static void main(String[] args) {
        // write your code here


        String firstName;
        String Name;
        double age;
        double size;               // Taille en cm

        String Why;                //  Quelques lignes qui expliquent pourquoi vous rejoignez la formation
        double bankAccountAmount;  //  Le montant d'un compte bancaire

        // char bisexYear ;             // indique le fait qu'une année soit bissextile (valeur 'L') ou non (valeur 'N')
        String cardColor;           // La couleur d'une carte de jeu de cartes
        String color;              // Une couleur ‽

        double prixHT = 5;
        double tauxTVA = 0.20;
        double prixTTC = prixHT * (1 + tauxTVA);
        System.out.println(prixTTC);
        int year = 2020;
        System.out.println("Annee = " + year);
        boolean bisexYear = isLeapYear(year);
        System.out.println("Anne bisex = " + bisexYear);

// => utiliser plutôt 1 boulean pour les contrôles Leapyear
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0)
                        || (year % 400 == 0) ;
    }

}
