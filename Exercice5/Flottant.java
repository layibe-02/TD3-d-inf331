class Flottant extends Affichable {
    float valeur;

    public Flottant(float valeur) {
        this.valeur = valeur;
    }

    public void affiche() {
        System.out.println("Je suis un flottant de valeur " + valeur);
    }
}