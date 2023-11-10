public class Point {
    private int x; // Coordonnée en abscisse
    private int y; // Coordonnée en ordonnée

    public void initialiser(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplacer(int deplacement_x, int deplacement_y) {
        this.x += deplacement_x;
        this.y += deplacement_y;
    }

    public void afficher() {
        System.out.println("Je suis un point de coordonnées " + x + " et " + y);
    }
}