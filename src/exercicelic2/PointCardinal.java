package exercicelic2;
import java.util.Scanner;

public class PointCardinal {
    public static void main(String[] args){
       char rep;
       do{
        System.out.println("Saisi un point cardinal");
        Scanner obj = new Scanner(System.in);
        char point = obj.next().charAt(0);
        if(point=='N' || point=='n'){
            System.out.println("Vous etes au nord");
        }else if(point=='S' || point=='s'){
            System.out.println("Vous etes au sud");
        }else if(point=='O' || point=='o'){
            System.out.println("Vous etes à l'ouest");
        }else if(point=='E' || point=='e'){
            System.out.println("Vous etes à l'Est");
        }else{
            System.out.println("Invalide");
        } 
        
        System.out.println("Voulez-vous continuer?");
        rep = obj.next().charAt(0);
       }while(rep=='o' || rep=='O');
    }
}
