
/*
 La directive import suivante per
 avoir à écrire java.util.Scanner
*/

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // lecture depuis l'entrée standard (clavier)
        System.out.println("Saisissez un entier:");

        boolean err = false;
        int i= 0;
        do {
            try {
                i = sc.nextInt();
                err = true;
            }catch (Exception e){
                sc.nextLine();
                System.out.println("La valeur saisie est incorrect, saisissez un nombre entier : ");
                err = false ;

            }
        } while (err==false) ;

//        System.out.println("Vous avez saisi: " + i);
//
//
//        System.out.println("Saisissez un double (penser à la localisation!):");
//        double d = sc.nextDouble(); // /!\ Si l'ordinateur est configuré en fr_FR, le séparateur décimal attendu est une virgule !
//        System.out.println("Vous avez saisi: " + d);
//        System.out.println("Saisissez une ligne de caractères");
        sc.nextLine(); // /!\ le dernier appel à nextDouble() n'avait pas consommé la fin de ligne !
        String line = sc.nextLine();
        System.out.println("Vous avez saisi: " + line);
    }
}
