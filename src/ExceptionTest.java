//import java.io.FileNotFoundException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class ExceptionTest {
    public static void main(String[] args) {

        Scanner sc = null;

        try {
            sc = new Scanner(new File("inputFile.txt"));
            for (int i = 0; sc.hasNextLine(); ++i) {
                System.out.println("[" + i + "]:" + sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println(e + " No file found ");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

        try {
            Scanner sc2 = new Scanner(new File("input2File.txt"));
            for (int i = 0; sc2.hasNextLine(); ++i) {
                System.out.println("[" + i + "]:" + sc2.nextLine());
            }

        } catch (FileNotFoundException e) {

            System.out.println(e + " No file Sc2 found ");
            e.printStackTrace();
        }
    }
}
