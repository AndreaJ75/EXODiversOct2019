public class MaxLongTab {

    public static void main(String[] args) {

        long[] num = {3, 1, 18, 15, 5};
        long maxNum = ctrleMaxLong(num);
        System.out.println("Nombre max : " + maxNum);

        String[] name = {"Natacha", "Albert", "Philippe", "Marc", "Sandrine"};
        long maxNameLength = ctrleMaxLong(name);
        System.out.println("Longueur de chaine max : " + maxNameLength);

    }

    public static long ctrleMaxLong(long[] num) {

        long maxNum = 0;

        for (int i = 0; i != num.length; i++) {
            if (num[i] > maxNum) {
                maxNum = num[i] ;
            }
        }
        return maxNum;
    }

    public static long ctrleMaxLong(String[] name) {

    //    String maxName = "";
        long maxNameLength = 0 ;

        for (int i = 0; i != name.length; i++) {
            if (name[i].length() >  maxNameLength) {
                maxNameLength = name[i].length();
            }
        }
        return maxNameLength;
    }

}