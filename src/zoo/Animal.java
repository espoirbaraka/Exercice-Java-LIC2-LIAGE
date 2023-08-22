package zoo;

public abstract class Animal {
    private String nom; 
    private String couleur;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
    public int marcher(int nbrepatte){
        return nbrepatte;
    }
    public String manger(String nourriture){
        return nourriture;
    }
    public abstract void crier();
}
