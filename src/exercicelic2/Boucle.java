package exercicelic2;

public class Boucle {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 100);

        int h = 1;
        while (h <= 100) {
            System.out.println(h);
            h++;
        }
    }
}
