package gestionecole;

public class Personne {
    private String nom;
    private String postnom;
    public String datenaiss;
    
    public Personne(){
        this.nom = "MESSI";
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPostnom() {
        return postnom;
    }

    public void setPostnom(String postnom) {
        this.postnom = postnom;
    }
    
    public void manger(String nourriture){
        System.out.println(nom+" mange "+nourriture);
    }
    public void marcher(){
        System.out.println(nom+" marche");
    }
}
