package Javapackage;

public class Testpack {



    public static void main(String[] args) {

        int[][] data = new int[2][];
        for (int i = 0; i != data.length; ++i) {
            data[i] = new int[2 + i];
        }
        int[][] other = new int[data.length][];
        for (int i = 0; i != data.length; ++i) {
            other[i] = data[i];
        }

        boolean test = other[0].equals(data[0]);
        System.out.println(test);

        boolean test2 = other.equals(data);
        System.out.println(test2);

    }
}
