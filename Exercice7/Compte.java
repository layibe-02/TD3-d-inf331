public class Compte {
    public String numero;
    public String proprietaire;
    public int solde;

    public Compte(String numero, String proprietaire, int solde) {
        this.numero = numero;
        this.proprietaire = proprietaire;
        this.solde = solde;
    }

    public void deposer(int montant) {
        solde += montant;
    }

    public void retirer(int montant) {
        solde -= montant;
    }
}
