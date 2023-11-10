class Pointcol extends Point {
    byte couleur;

    public Pointcol(int x, int y, byte couleur) {
        super(x, y);
        this.couleur = couleur;
    }

    public void colorer(byte couleur) {
        this.couleur = couleur;
    }

    public void identifie() {
        System.out.println("Je suis un point coloré de couleur " + couleur);
    }
}