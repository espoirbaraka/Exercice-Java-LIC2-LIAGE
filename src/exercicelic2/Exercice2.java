package exercicelic2;
import java.util.*;

public class Exercice2 {
    public static void main(String[] args){
        Scanner lire = new Scanner(System.in);
        System.out.println("Saisi votre nom");
        String nom=lire.nextLine();
        System.out.println("Saisi votre age");
        int age = lire.nextInt();
        System.out.println("Bonjour "+nom+" "
                + "vous avez "+age+" ans");    } 
}
