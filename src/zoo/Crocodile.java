package zoo;

public class Crocodile extends Animal {
    private int nbreDent;

    public int getNbreDent() {
        return nbreDent;
    }

    public void setNbreDent(int nbreDent) {
        this.nbreDent = nbreDent;
    }
    
    public void nager(){
        System.out.println("Le crocodile nage");
    }
    
    @Override
    public void crier(){
        System.out.println("Le crocodile croasse");
    }
}
