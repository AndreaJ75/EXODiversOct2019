import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;




public class PrintStreamDemo {
    public static void main(String[] args) {
        boolean flag = false;
        String filepath = "input2File.txt";
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
        }

    }
}


