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
public class BonDepot {
    private static int compteur = 1;
    
    private int numeroBon;
    private String telephone;
    private LocalDate dateDepot;
    private int nbLignes;
    private LigneDepot[]lignes; 
    
    public BonDepot(String telephone, int maxArticles){
        this.numeroBon = compteur++;
        this.telephone = telephone;
        this.dateDepot = LocalDate.now();
        this.lignes = new LigneDepot[maxArticles];
        this.nbLignes = 0;
    }
    
    public void ajouterLigne(String numero, int qte) {
        if (nbLignes < lignes.length) {
            lignes[nbLignes] = new LigneDepot(numero, qte);
            nbLignes++;
        }
    }
    
    public int getNumeroBon() {
        return numeroBon;
    }

    public String getTelephone() {
        return telephone;
    }

    public LocalDate getDateDepot() {
        return dateDepot;
    }

    public int getNbLignes() {
        return nbLignes;
    }

    public LigneDepot[] getLignes() {
        return lignes;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setDateDepot(LocalDate dateDepot) {
        this.dateDepot = dateDepot;
    }

    @Override
    public String toString() {
        String res = "Bon de dépôt n°" + numeroBon + " du " + dateDepot + "\n";
        res += "Client : " + telephone + "\n";
        res += "Articles déposés (" + nbLignes + ") :\n";
        
        for (int i = 0; i < nbLignes; i++) {
            res += " - " + lignes[i].toString() + "\n";
        }
        return res;
    }
}
