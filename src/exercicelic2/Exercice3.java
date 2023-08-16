package exercicelic2;
import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args){
        Scanner o=new Scanner(System.in);
        Scanner i=new Scanner(System.in);//Creation de l'objet o de la classe Scanner
        String rep="oui";
        
        while(rep=="oui" || rep=="OUI"){
            System.out.println("Saisi votre nom");
        String nom=i.nextLine();
        System.out.println("Saisi votre sexe");
        char sexe = o.next().charAt(0);
        System.out.println("Saisi votre age"); //Ecrire
        int age = o.nextInt(); //Lire
        if(sexe=='M' || sexe=='m'){
            System.out.println("Bonjour Monsieur "+nom+" Sexe: "+sexe+". Vous avez "+age+" ans");
        }else if(sexe=='F' || sexe=='f'){
            System.out.println("Bonjour madame "+nom+" Sexe: "+sexe+". Vous avez "+age+" ans");
        }else{
            System.out.println("Erreur");
        }
        
        System.out.println("Voulez-vous continuer?");
        rep=o.nextLine();
        }
        
        
    }
}
