import javax.swing.plaf.ActionMapUIResource;
import java.util.Scanner;

public class FonctionException {


    public static void main(String[] args) {

      //  long alpha = ctrleExtInt(sc);


}

    public static long ctrleExInt(int vaInt){

        Scanner sc = new Scanner(System.in); // lecture depuis l'entrée standard (clavier)
        System.out.println("Saisissez un entier:");

        boolean err = false;
        int i = 0;
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
    return i ;
    }
}

