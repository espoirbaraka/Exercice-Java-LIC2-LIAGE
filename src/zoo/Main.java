package zoo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Crocodile c1=new Crocodile();
        Lion l1=new Lion();
        Scanner obj=new Scanner(System.in);
        
        c1.setNom("CROCO");
        c1.setCouleur("Grise");
        System.out.println("Le crocodile "+c1.getNom()
                +" est de la couleur "+c1.getCouleur());
        System.out.println("Saisi le nbre de pattes");
        int nbrepatte=obj.nextInt();
        System.out.println("le crocodile marche avec "
                +c1.marcher(nbrepatte)+" pattes");
        c1.manger("poissonnnnn");
    }
}
