import java.util.Scanner;

public class JavaQuestion {

    public static void main(String[] args) {

        //String[] question= new String[3];
        String[] question = {
                "Quel langage à typage statique avez-vous vu en formation ? :",
                "Quel IDE utilisez-vous ? : ",
                "Quel langage à typage dynamique avez-vous vu en formation ? : "        };

        //String[] bonneReponse = new String[3];
        String[] bonneReponse = {
                "Java",
                "IntelliJ",
                "Python"
        };

        //int[] pointReponse = new int[3];
        int[] pointReponse = {
                3,
                1,
                2
        };

        String[] reponse= new String[3];

        int nbrPointtotal = 0;

        for (int i = 0; i < question.length; i++) {

            reponse[i] = enregReponseQuestion(question[i]);

            if (reponse[i].equals(bonneReponse[i])) {
                nbrPointtotal = nbrPointtotal + pointReponse[i];
            }
        }

        System.out.println("Nbr point total : " + nbrPointtotal);


    }

    public static String enregReponseQuestion(String question) {
        Scanner sc = new Scanner(System.in); // lecture depuis l'entrée standard (clavier)
        String res = "";
        System.out.println(question);
        res = sc.nextLine();
        return res;
    }


}
