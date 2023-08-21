package gestionecole;

public class Main {
    public static void main(String[] args){
        Etudiant e1=new Etudiant();
        Enseignant p1=new Enseignant();
        e1.setNom("Fatshi");
        p1.setNom("Glody");
        e1.manger("Foufou");
        p1.manger("Foufou");
    }
}
