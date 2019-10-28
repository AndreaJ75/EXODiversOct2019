
public class Palindrome {

    public static void main(String[] args) {
        String chaine = "laval";

        boolean isPalind = checkIsPalind(chaine);

        if (isPalind == true){
            System.out.println(chaine + " est un palindrome");
        } else{
            System.out.println(chaine + " n\'est pas un palindrome");
        }
    }

    public static boolean checkIsPalind(String chaine) {

        //String chaine;
        String chaineInv = "";
        boolean isPalind = false;
        //long l = chaine.length();

        for (int i = chaine.length()-1; i != -1; i--) {
            chaineInv = chaineInv + chaine.charAt(i);
        }
        System.out.println(chaineInv);

        if (chaine.compareTo(chaineInv) == 0) {
            isPalind = true;
        } else {
            isPalind = false ;
        }
        // => autre possibilité : => on va d'un coté et de l'autre comparer que chaque caractère est identique à son symétrique
        // if chaine.charAt(i) != chaine.chartAt(chaine.length()-1)
        return isPalind;
    }

}

