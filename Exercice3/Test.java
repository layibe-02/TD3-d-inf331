class Test {
    public static void main(String[] args) {
        Point[] tab = new Point[3];
        tab[0] = new Point(1, 2);
        tab[1] = new Pointcol(3, 4, (byte) 5);
        tab[2] = new Point(6, 7);

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] instanceof Pointcol) {
                ((Pointcol) tab[i]).afficher();
            } else {
                System.out.println("Point de coordonnées (" + tab[i].x + ", " + tab[i].y + ")");
            }
        }
    }
}