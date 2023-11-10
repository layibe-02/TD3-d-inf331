//import Narcisse.Programs.Entrainement.td3_INF331.Point;

public class TestPoint {
    public static void main(String[] args) {
        // Création d'un objet Point
        Point point = new Point();

        // Initialisation du point avec des coordonnées
        System.out.println("Initialisation du point");
        point.initialiser(0, 0);

        // Affichage du point
        point.afficher();

        // Déplacement du point
        System.out.println("\nAprès le déplacement");
        point.deplacer(7, -3);

        // Affichage du point après le déplacement
        point.afficher();
    }
}