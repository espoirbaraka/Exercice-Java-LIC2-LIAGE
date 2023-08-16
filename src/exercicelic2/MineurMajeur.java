package exercicelic2;
import java.util.*;

public class MineurMajeur {
    public static void main(String[] args){
        age();
    }
    
    static void age(){
        Scanner objet=new Scanner(System.in);
        System.out.println("Saisi votre sexe");
        char sexe = objet.next().charAt(0);
        System.out.println("Saisi votre age");
        int age = objet.nextInt();
        if((sexe=='F' || sexe=='f') && age>=18 ){
            System.out.println("Majeure");
        }else if((sexe=='F' || sexe=='f') && age<18 ){
            System.out.println("Mineure");
        }else if((sexe=='M' || sexe=='m') && age>=18 ){
            System.out.println("Majeur");
        }else if((sexe=='M' || sexe=='m') && age<18 ){
            System.out.println("Mineur");
        }else{
            System.out.println("Error");
        }
    }
}
