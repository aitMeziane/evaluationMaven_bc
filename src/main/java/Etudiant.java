public class Etudiant {

    private String nom;

    private String prenom;

    private String adresse;

    private int anneeNaissance;

    public int anneActuel= 2016;

    public Etudiant(String nom, String prenom, String adresse, int anneeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.anneeNaissance = anneeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int calculAge (){
        int age = anneActuel - anneeNaissance;
        return age;
    }
}


