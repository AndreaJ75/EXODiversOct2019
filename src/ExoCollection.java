import java.io.File;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ExoCollection {
    public static void main(String[] args) throws Exception {

        // Acces au fichier mot.txt
        Scanner sc = new Scanner(new File("/home/bnp-renault-005/Bureau/Andrea/GITHUB2/java-project-books/books/motsAndy.txt"));
        //Scanner sc = new Scanner(new File("/home/bnp-renault-005/Bureau/Andrea/GITHUB2/java-project-books/books/mots.txt"));
        // Creation d'une collection 'data'
        ArrayList data = new ArrayList();
        // on créé une instance de HashMap
        HashMap<String, Integer> wordNumber = new HashMap<>();

        // Lecture du fichier mot.txt et chargement des mots du fichier dans la Collection 'data' créée
        for (int i = 0; sc.hasNextLine(); ++i) {
            // charger chaque element dans ma collection
            data.add(sc.nextLine());
            String keyRead = wordNumber.put(sc.nextLine());
            if (wordNumber.containsKey(keyRead)){
                int wordCount = wordNumber.get(keyRead);
                wordNumber.put(keyRead, wordCount);
                System.out.println("wordCount = " + wordCount);
            }
        }
        sc.close();
        System.out.println("Nbr de lignes dans fichier : " + data.size());

        //       Collections.sort(data);  Tri de la collection (à utiliser à la fin)

        //System.out.println(data);
    }

}

