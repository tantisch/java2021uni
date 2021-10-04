import java.util.Random;

public class ex3_2{
    final static int NUM = 5;

    public static void dice(){
        Random random = new Random();
        int a = random.nextInt(20);
        for(int i=0; i<NUM; i++){
            int x = random.nextInt(20);
            if(x < a){
                System.out.printf("%d < %d\n", a, x);
            }
            if(x > a){
                System.out.printf("%d > %d\n", a, x);
            }
            if(x == a){
                System.out.printf("%d == %d\n", a, x);
            }
        }
    }

    public static void main(String[] args) {
        dice();
    }
}