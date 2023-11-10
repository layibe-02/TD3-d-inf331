public class CompteSecurise extends Compte {
    public CompteSecurise(String numero, String proprietaire, int solde) {
        super(numero, proprietaire, solde);
    }

    public void retirer(int montant) {
        if (montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant");
        }
    }
}
