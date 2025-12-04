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
    public Etablissement(String nom) {
        this.nom = nom;
        this.stock = new Article[1000]; 
        this.archives = new BonDepot[500];
        
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
    
    public String getNom() { return nom; }
    
    @Override
    public String toString() {
        return "Etablissement : " + nom + "\n" +
               "Nombre d'articles en stock : " + nbArticles + "\n" +
               "Nombre de bons de dépôt : " + nbDepots;
    }
}
