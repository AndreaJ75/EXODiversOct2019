import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaQuestionFic {


    public static void main(String[] args) throws Exception {


        // Creation des Collections pour stockage des données lues du fichier

        ArrayList data = new ArrayList();  // Data de stockage de l'enregistrement lu
        ArrayList question = new ArrayList();
        ArrayList reponse = new ArrayList();
        ArrayList points = new ArrayList();


        // Lecture du fichier csv

        boolean flag = false;
        String filepath = "/home/bnp-renault-005/IdeaProjects/EXO_JAVA/Ressources/QuestionAnswer.csv";
        Scanner sc1 = null;
        do {
            try {
                sc1 = new Scanner(new File(filepath));
                flag = true;
            } catch (FileNotFoundException e) {
                System.out.println(e + " No file found ");
                Scanner sc2 = null;
                System.out.println("Saisissez un nom/path de fichier : ");
                sc2 = new Scanner(System.in);
                filepath = sc2.nextLine();
            }
        }
        while (flag == false);
        for (int i = 0; sc1.hasNextLine(); ++i) {
            System.out.println("[" + i + "]:" + sc1.nextLine());
           // data.add(sc1.nextLine()); // Allocation des données lues dans Collection list globale
        }


    //    System.out.println(data.get(0));

//    int nbrPointtotal = 0;
//
//        for (int i = 0; i < question.size(); i++) {
//
//        reponse[i] = enregReponseQuestion(question[i]);
//
//        if (reponse[i].equals(bonneReponse[i])) {
//            nbrPointtotal = nbrPointtotal + pointReponse[i];
//        }
//    }
//
//        System.out.println("Nbr point total : " + nbrPointtotal);

    }
}
