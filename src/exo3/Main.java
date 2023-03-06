package exo3;

public class Main {

    public static void main(String[] args) {

        // Première partie
        CompteBancaire cb = new CompteBancaire(100);
        Operation op1 = new Operation(cb, 10);
        Operation op2 = new Operation(cb, -30);
        Operation op3 = new Operation(cb, 0);

        op1.start();
        op2.start();
        op3.start();

        // Seconde Partie
        CompteBancaire cb1 = new CompteBancaire(50);
        CompteBancaire cb2 = new CompteBancaire(50);
        Transfert t1 = new Transfert(cb1, cb2,30);
        Transfert t2 = new Transfert(cb2, cb1,10);
        Transfert t3 = new Transfert(cb1, cb2,30);

        t1.start();
        t2.start();
        t3.start();
    }
}
