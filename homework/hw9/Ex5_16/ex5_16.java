package hw9.Ex5_16;

public class ex5_16 {
    public static void main(String[] args){
        Flower flower = new Flower("green");

        System.out.println("is faded: " + flower.faded());
        flower.blossom();
        System.out.println("is faded: " + flower.faded());

        System.out.println("Bud color: " + flower.bud.color);
    }
}