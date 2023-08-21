package exercicelic2;

import java.util.Scanner;

public class MineurMajeur2 {
    public static void main(String[] args){
        Scanner objet=new Scanner(System.in);
        System.out.println("Saisi votre sexe");
        char sexe = objet.next().charAt(0);
        System.out.println("Saisi votre age");
        int age = objet.nextInt();
        MineurMajeur2 p = new MineurMajeur2();
        age(sexe,age);
    }
    
    static void age(char sx, int a){
        if((sx=='F' || sx=='f') && a>=18 ){
            System.out.println("Majeure");
        }else if((sx=='F' || sx=='f') && a<18 ){
            System.out.println("Mineure");
        }else if((sx=='M' || sx=='m') && a>=18 ){
            System.out.println("Majeur");
        }else if((sx=='M' || sx=='m') && a<18 ){
            System.out.println("Mineur");
        }else{
            System.out.println("Error");
        }
    }
}
