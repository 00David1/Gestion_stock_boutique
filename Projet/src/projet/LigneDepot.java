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
    private String numero;
    private int quantite;    
    
    public LigneDepot(String numero, int quantite) {
        this.numero = numero;
        this.quantite = quantite;
    }
    
    public String getNumero() {
        return numero;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    @Override
    public String toString() {
        // J'ai retiré l'affichage de l'article car il n'existe plus
        return "Ligne n°" + numero + " : quantité = " + quantite;
    }
}