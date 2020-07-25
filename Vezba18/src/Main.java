import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    String[] niz = {"Heart","Cherry","Coin","Melon","Jocker"};
        System.out.println("Combination is:");
        for (int i =0;i<niz.length;i++){
            Random r = new Random();
            int rand = r.nextInt(niz.length);
            System.out.print(" "+niz[rand]);
        }
    }
}
