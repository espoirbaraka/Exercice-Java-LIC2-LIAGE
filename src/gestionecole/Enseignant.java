package gestionecole;

public class Enseignant extends Personne {
    private float salaire;
    public float getSalaire() {
        return salaire;
    }
    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }
    
    public void coter(){
        System.out.println("l'enseignant "
                + ""+getNom()+" cote");
    }
    
    public void donnerCours(){
        System.out.println("l'enseignant "
                + ""+getNom()+" donne cours");
    }
    
}
