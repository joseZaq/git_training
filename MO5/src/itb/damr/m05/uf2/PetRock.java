package itb.damr.m05.uf2;

public class PetRock {
    private String nom;
    private boolean happy;
    //contructor
    public PetRock(String nom,Boolean happy) {
        this.nom = nom;
        this.happy = happy;
    }
    //contructor
    public PetRock(boolean happy) {
        this.happy = happy;
    }
    public PetRock(String nom) {
        this.nom = nom;
    }

    public boolean isHappy() {
        return this.happy;
    }
    //getters
    public String getNom() {
        return nom;
    }

}
