package zoo;

public class Lion extends Animal{
    private float poids;

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }
    
    public void chasser(){
        System.out.println("Le lion chasseee");
    }
    
}
