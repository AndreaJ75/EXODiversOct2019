/*import java.io.File;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ExoCollection2 {
    public static void main(String[] args) throws Exception {

        // Acces au fichier mot.txt
        Scanner sc = new Scanner(new File("/home/bnp-renault-005/Bureau/Andrea/GITHUB2/java-project-books/books/motsAndy.txt"));
        //Scanner sc = new Scanner(new File("/home/bnp-renault-005/Bureau/Andrea/GITHUB2/java-project-books/books/mots.txt"));
        // Creation d'une collection 'data'
        ArrayList data = new ArrayList();

        // on créé une instance de Hashtable
        HashMap myMap = new HashMap();

        // Tant que la cle de la liste (mot considéré) est = cle lu précedemment
        // on met à jour la cle de la liste en rajoutant 1 au compteur de cle
        // Sinon, on crée un nouveau couple (clé compteur) (avec compteur à 1)

        System.out.println("data = " + data);

        System.out.println("taille collection = " + data.size());


        // Lecture du fichier mot.txt et chargement des mots du fichier dans la Collection 'data' créée
        for (int i = 0; sc.hasNextLine(); ++i) {
            // charger chaque element dans ma collection
            data.add(sc.nextLine());
        }
        sc.close();
        System.out.println(data.size());

        for (int i = 0; sc.hasNextLine(); ++i) {
            int cpt = 0;
            int j;
            myMap.put(sc.nextLine(), cpt);
            for (j = 0; (sc.hasNextLine()) || (data.get(i).equals(data.get(j))); ++j) {
                System.out.println("champ i " + data.get(i));
                System.out.println("champ j " + data.get(j));
                cpt = cpt + 1;
                myMap.put(data.get(j), cpt);
                sc.nextLine();
            }
            myMap.put(data.get(j), cpt);
            cpt = 0 ;
            System.out.println("Precedent 2: " + "HT" + myMap + "data.get " + data.get(j) +  cpt);
        }
        sc.close();

        // On trie les données du fichier avant de compter le nombre d'occurence par mot :
        //ArrayList dataTrie = new ArrayList();
        //dataTrie.add(Collections.sort(data));
        Collections.sort(data);



    }

}*/

