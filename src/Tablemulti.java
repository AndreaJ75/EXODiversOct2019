import javax.swing.*;

public class Tablemulti {


    public static void main(String[] args) {

        //  long alpha = ctrleExtInt(sc);


        long n = 3 ;
        long m = 4 ;
        String lignMult = "";
        //long[] tabLignei ;

        for (int i = 1; i < n +1 ; i++) {
            for (int j = 1 ; j < m+1 ; j++) {
                int mult = i*j ;

                lignMult = lignMult + " " + mult  ;

            }
            System.out.println(lignMult) ;
            lignMult = " " ;
        }



    /*        for (int j = 1 ; j!= n ;j++) {
                long lignei = i + j ;

                long[] tabLignei = tabLignei[i].append();
                System.out.println("Ligne de table = " + tabLignei[0] + tabLignei[1]);
            }

        }

*/


    }




}