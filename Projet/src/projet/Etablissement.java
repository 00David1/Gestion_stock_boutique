/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet;

import java.time.LocalDate;

/**
 *
 * @author 33765
 */
public class Etablissement {
    private String nom;
    private Article[] stock;
    private BonDepot[] archives;
    private int nbArticles;
    private int nbDepots;
    
    // Constructeur
    public Etablissement(String nom, int maxArticles, int maxDepots) {
        this.nom = nom;
        this.stock = new Article[maxArticles]; 
        this.archives = new BonDepot[maxDepots];
        
        this.nbArticles = 0;
        this.nbDepots = 0;
    }
    
    public void ajouterLivre(String description, double prix, int qte, String isbn, int nbPages) {
        if (nbArticles < stock.length) {
            Livre nouveauLivre = new Livre(description, prix, qte, isbn, nbPages);
            stock[nbArticles] = nouveauLivre;
            nbArticles++;
        } else {
            System.out.println("Erreur : Le stock est plein !");
        }
    }

    public void ajouterManuel(String description, double prix, int qte, String isbn, int nbPages, String matiere, String niveau) {
        if (nbArticles < stock.length) {
            Manuels nouveauManuel = new Manuels(description, prix, qte, isbn, nbPages, matiere, niveau);
            stock[nbArticles] = nouveauManuel;
            nbArticles++;
        } else {
            System.out.println("Erreur : Le stock est plein !");
        }
    }

    public void ajouterMagazine(String description, double prix, int qte, String issn, String periodicite, LocalDate datePub) {
        if (nbArticles < stock.length) {
            Magazines nouveauMag = new Magazines(description, prix, qte, issn, periodicite, datePub); // [cite: 79]
            stock[nbArticles] = nouveauMag;
            nbArticles++;
        } else {
            System.out.println("Erreur : Le stock est plein !");
        }
    }
    
    public Article rechercher(String numeroRef) {
        for (int i = 0; i < this.nbArticles; i++) {
            if (this.stock[i].getNumero().equals(numeroRef)) {
                return this.stock[i];
            }
        }
        return null;
    }
    
    public void lister() {
        if (nbArticles == 0) {
            System.out.println("Aucun article en stock.");
            return;
        }

        Article[] triParQuantite = new Article[nbArticles];
        for (int i = 0; i < nbArticles; i++) {
            triParQuantite[i] = stock[i];
        }

        for (int i = 0; i < nbArticles - 1; i++) {
            for (int j = 0; j < nbArticles - 1 - i; j++) {
                if (triParQuantite[j].getNbExemplaire() > triParQuantite[j + 1].getNbExemplaire()) {
                    Article temp = triParQuantite[j];
                    triParQuantite[j] = triParQuantite[j + 1];
                    triParQuantite[j + 1] = temp;
                }
            }
        }
        System.out.println("--- LISTE DES ARTICLES (Triés par quantité croissante) ---");
        for (int i = 0; i < nbArticles; i++) {
            Article a = triParQuantite[i];
            
            // On affiche la description et le prix calculé (avec réductions)
            System.out.println("--------------------------------");
            System.out.println(a.toString()); // Affiche Description, ISBN/ISSN...
            System.out.println("- Quantité : " + a.getNbExemplaire());
            
            // ICI C'EST IMPORTANT : On appelle calculerPrix() pour avoir le prix réduit
            System.out.println("- PRIX ACTUEL : " + a.get_prix_initial() + " €");
        }
        System.out.println("--------------------------------");
    }
    
    public String getNom() { return nom; }
    
    @Override
    public String toString() {
        String res = "Etablissement : " + nom + "\n";
        res += "\n--- ARTICLES EN STOCK (" + nbArticles + ") ---\n";
        for (int i = 0; i < nbArticles; i++) {
            res += stock[i].toString() + "\n"; 
        }
        
        res += "\n--- BONS DE DÉPÔT (" + nbDepots + ") ---\n";
        for (int i = 0; i < nbDepots; i++) {
            if (archives[i] != null) {
                res += archives[i].toString() + "\n";
            }
        }
        return res;
    }
}
