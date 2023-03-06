package exo2;

import java.util.ArrayList;

public class Course {

    // Attributs
    private ArrayList<ArrayList<Thread>> equipes;
    private int nbEquipe;
    private int nbCourreur;

    // Construteur
    public Course(int p_nbEquipe, int p_nbCourreur) {
        this.nbEquipe = p_nbEquipe;
        this.nbCourreur = p_nbCourreur;

        this.equipes = new ArrayList<>(this.nbEquipe);

        // Ajout des équipes
        for (int i = 0; i < this.nbEquipe; i++) {
            this.equipes.add(new ArrayList<>(this.nbCourreur));
        }

        // Ajout Joueurs
        for (int i = 0; i < this.nbEquipe; i++) {
            for (int j = 0; j < this.nbCourreur; j++) {
                this.equipes.get(i).add(new Thread(new Courreur(this, i, j)));
            }
        }
    }

    // Getter
    public ArrayList<ArrayList<Thread>> getEquipes() {
        return this.equipes;
    }

    public int getNbCourreur() {
        return this.nbCourreur;
    }

    // Autres méthodes
    public void start() {
        for (int i = 0; i < this.nbEquipe; i++) {
            for (int j = this.nbCourreur - 1; j >= 0; j--) {
                this.equipes.get(i).get(j).start();
            }
        }
    }

    public void interrompre() {
        for (int i = 0; i < this.nbEquipe; i++) {
            for (int j = 0; j < this.nbCourreur; j++) {
                this.equipes.get(i).get(j).interrupt();
            }
        }
    }
}
