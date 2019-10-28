/*
// Class utilisé pour tester les fonctions de la Class ExosFunctions
public class ExosDebug {
    public static void main(String[] args) {
        System.out.println("DEBUG");
        debugRectangle();
    }

    private static void debugRectangle() {
        System.out.println("DEBUG : Affichage Rectangle");
        int[][] rectangle = {{1,1}, {2, 1}, {3,2}};

        for (int i = 0; i != rectangle.length; ++i) {
            System.out.println(ExosFunctions.showRectangle(rectangle[i][0],rectangle[i][1]));
        }
    }
}

// Class des fonctions à développer
public class ExosFunctions {

    public static void main(String[] args) {

    }

    public static String showRectangle(int cols, int ligs) {
        String result = "";
        for (int lig = 0; lig != ligs + 2; ++lig) {
            result += (lig == 0 || lig == ligs + 1) ? showLineExtreme(cols + 2) + "\n" : showLineInternal(cols + 2) + "\n";
        }
        return result;
    }

    public static String showLineExtreme(int cols) {
        String result = "";
        for (int col = 0; col != cols; ++col) {
            result += (col == 0 || col == cols - 1) ? "+" : "-";
        }
        return result;
    }

    public static String showLineInternal(int cols) {
        String result = "";
        for (int col = 0; col != cols; ++col) {
            result += (col == 0 || col == cols - 1) ? "|" : " ";
        }
        return result;
    }
}

 */