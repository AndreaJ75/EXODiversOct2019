public class Step3 {

    public static void main(String[] args) {
        // write your code here


        System.out.println("Mystere = " + mystere(0.01f));
    }

    public static float mystere(float epsilon){
        System.out.println(Float.MAX_VALUE);
        return mystere(0.f, Float.MAX_VALUE, epsilon);
    }

    public static float mystere(float min, float max, float epsilon){
        while((max != min)){
            float m = max/2 + min/2;
            if((m + epsilon) > m){
                min = Math.nextUp(m);
            }else{
                max = m;
            }
        }
        return min;
    }
}
