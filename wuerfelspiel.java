import java.util.Random;

public class wuerfelspiel {
    public static void main(String[] args){
        Random dice = new Random();
        int counter;

        
        counter = 1+ dice.nextInt(6);
        System.out.println(counter);
    
    }
}