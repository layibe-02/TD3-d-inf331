public class CompteEpargne extends Compte {
    private double tauxInteret;

    public CompteEpargne(String numero, String proprietaire, int solde, double tauxInteret) {
        super(numero, proprietaire, solde);
        this.tauxInteret = tauxInteret;
    }

    public void appliquerInteret() {
        solde += solde * tauxInteret;
    }
}
