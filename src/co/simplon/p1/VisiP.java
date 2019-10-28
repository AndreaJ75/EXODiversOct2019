package co.simplon.p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.invoke.ConstantBootstraps;
import java.util.Scanner;

public class VisiP {


    private String question;
    private String answer;
    private int points;

   public VisiP(String question, String answer, int points){
            this.question= question;
            this.answer= answer;
            this.points= points;
        }


    public String getQuestion(){
        return question;
    }
    public void setQuestion(String question){
        this.question = question;
    }

   public static void main(String[] args) {

       message();
       VisiP ti = new VisiP("Quel langage à typage statique avez-vous vu en formation ?",
               "Java",
               3);
       // Dans tout ce qui est Static (lié à une classe) => on ne peut appeler d'instance (lié à du non statique)
       System.out.println();
       String Str = "Andréa";
       boolean Status = Str.equals("Test");
       System.out.println(Status);

       // Lecture du fichier csv

       boolean flag = false;
       String filepath = "QuestionAnswer.csv";
       Scanner sc1 = null;
       do {
           try {
               sc1 = new Scanner(new File(filepath));
               flag = true;
           } catch (FileNotFoundException e) {
               System.out.println(e + " No file found ");
//               Scanner sc2 = null;
//               System.out.println("Saisissez un nom/path de fichier : ");
//               sc2 = new Scanner(System.in);
//               filepath = sc2.nextLine();
           }
       }
       while (flag == false);
       for (int i = 0; sc1.hasNextLine(); ++i) {
           System.out.println("[" + i + "]:" + sc1.nextLine());


       }




   }

    public static String GREETINGS = "Hello" ; //création d'une classe de type Constante (GREETINGS)

     static void message() {
         System.out.println( GREETINGS + " from VisiP ! ");
     }
}

