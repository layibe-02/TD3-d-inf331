class Test {
    public static void main(String[] args) {
        Affichable[] tab = new Affichable[2];
        tab[0] = new Entier(25);
        tab[1] = new Flottant(1.25f);

        for (int i = 0; i < tab.length; i++) {
            tab[i].affiche();
        }
    }
}