package exo2;

import java.util.Random;

public class Courreur implements Runnable {

    // Attributs
    private Course course;
    private int numEquipe;
    private int numero;

    // Constructeur
    public Courreur(Course p_course, int p_numEquipe, int p_numero) {
        this.course = p_course;
        this.numEquipe = p_numEquipe;
        this.numero = p_numero;


    }

    // Autres méthodes
    @Override
    public void run() {
        try {
            if ((-1 < this.numero - 1) && (this.numero - 1 < this.course.getNbCourreur())) {
                this.course.getEquipes().get(this.numEquipe).get(this.numero - 1).join();
            }
            Thread.sleep(new Random().nextLong(2000));
            System.out.println(this);
            if (this.numero == this.course.getNbCourreur() - 1) {
                this.course.interrompre();
            }
        } catch (InterruptedException e) {
            System.out.println("Mon équipe ( la n°" + this.numEquipe + ") a perdu...");
        }
    }

    @Override
    public String toString() {
        return "Courreur{" +
                "numEquipe=" + numEquipe +
                ", numero=" + numero +
                '}';
    }
}
