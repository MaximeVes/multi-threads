package exo3;

public class Transfert extends Thread {

    private CompteBancaire cb1;
    private CompteBancaire cb2;
    private int montant;

    public Transfert(CompteBancaire p_cb1, CompteBancaire p_cb2, int p_montant) {
        this.cb1 = p_cb1;
        this.cb2 = p_cb2;
        this.montant = p_montant;
    }

    public void run() {
        CompteBancaire.transfert(this.cb1, this.cb2, this.montant);
    }
}
