class Pointcol extends Point {
    byte couleur;

    public Pointcol(int x, int y, byte couleur) {
        super(x, y);
        this.couleur = couleur;
    }

    public void colorer(byte couleur) {
        this.couleur = couleur;
    }

    public void afficher() {
        System.out.println("Point de coordonnées (" + x + ", " + y + ") et de couleur " + couleur);
    }
}