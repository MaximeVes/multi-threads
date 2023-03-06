package exo3;

public class CompteBancaire {

    // Attributs
    private int solde;

    // Construteur
    public CompteBancaire(int p_solde) {
        this.solde = p_solde;
    }

    // Getter
    public int consultation() {
        return this.solde;
    }

    // Autres méthodes
    public synchronized void debit(int val) {
        System.out.println("[Débit] solde avant op  = " + this.solde);
        this.solde -= val;
        System.out.println("[Débit] après opération = " + this.solde);
    }

    public synchronized void credit(int val) {

        System.out.println("[Crédit] solde avant op = " + this.solde);
        this.solde += val;
        System.out.println("[Crédit] après op       = " + this.solde);
    }

    public static synchronized void transfert(CompteBancaire cb1, CompteBancaire cb2, int montant) {
        System.out.println("[Transfert] solde Compte N°1 = " + cb1.solde + "(AVANT)");
        System.out.println("[Transfert] solde Compte N°2 = " + cb2.solde + "(AVANT)");
        cb1.solde -= montant;
        cb2.solde += montant;
        System.out.println("[Transfert] solde Compte N°1 = " + cb1.solde + "(APRÈS)");
        System.out.println("[Transfert] solde Compte N°2 = " + cb2.solde + "(APRÈS)");
    }
}
