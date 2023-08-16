package exercicelic2;
import java.util.*;

public class Souligner {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Saisi votre nom");
        String nom=obj.nextLine();
        System.out.println(nom);
        int taille=nom.length();
        for(int i=1; i<=taille; i++){
            System.out.print("=");
        }
    }
}
