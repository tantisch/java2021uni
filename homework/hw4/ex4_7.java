public class ex4_7{

    public static int check_validity(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) return 0;
        return 1;
    }

    public static int check_for_obtuse(double a, double b, double c){
        if(check_validity(a, b, c) == 1)
            if (!(a*a + b*b <= c*c || a*a + c*c <= b*b || b*b + c*c <= a*a)) return 1;
        return 0;
    }

    public static void main(String[] args) {

        int n = 50000;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i<n; ++i) {
            double a = Math.random();
            double b = Math.random();
            double c = Math.random();
            int res1 = check_validity(a, b, c);
            int res2 = check_for_obtuse(a, b, c);
            if (res1 == 1) count1++;
            if (res2 == 1) count2++;
        }

        System.out.println("possibility that it is a triangle: " + (double)count1 / (double)n);
        System.out.println("possibility that the triangle is obtuse: " + (double)count2 / (double)n);

    }
}