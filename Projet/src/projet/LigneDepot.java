/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet;

/**
 *
 * @author 33765
 */
public class LigneDepot {
    // 1. Les 4 champs demandés
    private String numero;
    private int quantite;         // J'utilise "quantite" sans accent pour éviter les soucis
    
    private LigneDepot[] Ligne;   // Tableau de LigneDepot
    private int nbLignes;         // Compteur
    
    // Constructeur : J'ai retiré "Article article" des paramètres
    public LigneDepot(String numero, int quantite) {
        this.numero = numero;
        this.quantite = quantite;
        
        // IMPORTANT : On doit initialiser le tableau pour pouvoir l'utiliser
        this.Ligne = new LigneDepot[100]; 
        this.nbLignes = 0;
    }

    // --- GETTERS ---
    
    public String getNumero() {
        return numero;
    }

    public int getQuantite() {
        return quantite;
    }

    // Getters pour la structure tableau
    public LigneDepot[] getLigne() {
        return Ligne;
    }

    public int getNbLignes() {
        return nbLignes;
    }

    // --- SETTERS ---

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    public void setLigne(LigneDepot[] Ligne) {
        this.Ligne = Ligne;
    }

    public void setNbLignes(int nbLignes) {
        this.nbLignes = nbLignes;
    }
    
    // --- METHODE D'AJOUT (Utile puisque tu as un tableau) ---
    
    public void ajouterLigne(LigneDepot nouvelleLigne) {
        if (nbLignes < Ligne.length) {
            Ligne[nbLignes] = nouvelleLigne;
            nbLignes++;
        }
    }
    
    // --- TOSTRING ---
    
    @Override
    public String toString() {
        // J'ai retiré l'affichage de l'article car il n'existe plus
        return "Ligne n°" + numero + " : quantité = " + quantite;
    }
}