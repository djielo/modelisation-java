package mesexercices;

public class PoupeRusse {
    private double taille;
    private  boolean ouvert= false;
    private  PoupeRusse interieur;
    private  PoupeRusse exterieur;

    public PoupeRusse() {
    }

    public PoupeRusse(double taille, boolean ouvert, PoupeRusse interieur,PoupeRusse exterieur) {
        this.taille = taille;
        this.ouvert = ouvert;
        this.interieur = interieur;
        this.exterieur = exterieur;
    }

    public PoupeRusse getExterieur() {
        return exterieur;
    }

    public void setExterieur(PoupeRusse exterieur) {
        this.exterieur = exterieur;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public boolean isOuvert() {
        return ouvert;
    }

    public void setOuvert(boolean ouvert) {
        this.ouvert = ouvert;
    }

    public PoupeRusse getInterieur() {
        return interieur;
    }

    public void setInterieur(PoupeRusse interieur) {
        this.interieur = interieur;
    }
    public void ouvrir(){
        if(ouvert== false && interieur==null){
            ouvert=true;
        }
    }
    public void fermer(){
        if(ouvert == true && exterieur == null){
            ouvert=false;
        }
    }
    public  void placerDans(PoupeRusse p) {
        if (exterieur == null && p.interieur == null && p.ouvert == true && this.taille < p.taille) {
            p.setInterieur (this);
            this.setExterieur (p);

        }
    }
       public void sortirLaPoupeeDe(PoupeRusse p){
      if(p.interieur == this && this.exterieur==p && p.ouvert == true){
          p.interieur = null;
          this.exterieur = null;
      }
        }

}
