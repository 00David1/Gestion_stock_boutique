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
    
    public NonDepot(String telephone, int maxArticles){
        this.numeroBon = compteur++;
        this.telephone = telephone;
        this.dateDepot = LocalDate.now();
        this.lignes = new LigneDepot[maxArticles];
        this.nbLignes = 0;
    }
}
