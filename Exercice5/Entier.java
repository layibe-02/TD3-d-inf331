class Entier extends Affichable {
    int valeur;

    public Entier(int valeur) {
        this.valeur = valeur;
    }

    public void affiche() {
        System.out.println("Je suis un entier de valeur " + valeur);
    }
}