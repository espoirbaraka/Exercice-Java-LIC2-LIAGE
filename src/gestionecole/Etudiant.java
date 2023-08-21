package gestionecole;

public class Etudiant extends Personne {
    private String promotion;
    private String faculte;

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getFaculte() {
        return faculte;
    }

    public void setFaculte(String faculte) {
        this.faculte = faculte;
    }
    
    public void faireExamen(){
        System.out.println("L'etudiant fait un examen");
    }
    public void inscription(){
        System.out.println("L'etudiant"+getNom()+" prend son inscription");
    }
}
