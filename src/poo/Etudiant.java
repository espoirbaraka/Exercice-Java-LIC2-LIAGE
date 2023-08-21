package poo;

public class Etudiant {
    private String nom;
    private String postnom;
    public String prenom;
    public int age;
    public String datenaissance;
    public Etudiant(){
        this.nom="LEO";
        this.postnom="MESSI";
        this.datenaissance="01-01-1970";
    }
    public Etudiant(String name, String second_name){
        this.nom=name;
        this.postnom=second_name;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String name){
       this.nom=name;
    }
    public void etudier(){
        System.out.println(nom+" etudie");
    }    
}
