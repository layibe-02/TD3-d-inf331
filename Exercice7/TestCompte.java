public class TestCompte {
    public static void main(String[] args) {
        Compte compte1 = new Compte("1234", "Alice", 1000);
        CompteEpargne compte2 = new CompteEpargne("5678", "Bob", 2000, 0.05);
        CompteSecurise compte3 = new CompteSecurise("9012", "Charlie", 3000);

        compte1.deposer(500);
        compte1.retirer(200);

        compte2.appliquerInteret();

        compte3.retirer(4000);
        compte3.retirer(2000);

        System.out.println("Compte 1: " + compte1.solde);
        System.out.println("Compte 2: " + compte2.solde);
        System.out.println("Compte 3: " + compte3.solde);
    }
}
