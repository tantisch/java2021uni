import java.util.Random;

public class ex3_3{
    public static Random random = new Random();

    public static int RollDie(){
        return random.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        for(int i=0; i<6; i++)
            System.out.println("The result of rolling a die is: " + RollDie());
    }
}