import java.util.Random;

public class ex3_6{
    static Random random = new Random();

    private static int Alice(){
        int count = 2;
        int prev = random.nextInt(2);
        int cur = random.nextInt(2);
        while(prev + cur < 2){
            prev = cur;
            cur = random.nextInt(2);
            count++;
        }
        return count;
    }

    private static int Bob(){
        int count = 2;
        int prev = random.nextInt(2);
        int cur = random.nextInt(2);
        while(cur >= prev){
            prev = cur;
            cur = random.nextInt(2);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 1000;
        double suc = 0;
        for(int i=0; i<n; i++)
            if (Alice() <  Bob()) suc++;
        System.out.println("my answer: " + suc/n);
        System.out.println("correct answer: " + 39.0/121.0);
    }
}