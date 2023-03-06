package exo3;

public class Operation extends Thread {

    private CompteBancaire cb;
    private int op;

    public Operation(CompteBancaire cb, int op) {
        this.cb = cb;
        this.op = op;
    }

    public void run() {
        if (this.op > 0) {
            cb.credit(this.op);
        } else if (this.op < 0) {
            cb.debit(-this.op);
        } else {
            System.out.println("Le solde est de " + this.cb.consultation() + "€");
        }
    }
}
