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
public class Magazines extends Article{
    private String issn;
    private String periodicite;
    private LocalDate datePublication;
    
    public Magazines(String description, int prix_initial, int nb_exemplaire, String issn, String periodicite, LocalDate datePublication){
        super(description, prix_initial, nb_exemplaire);
        this.issn = issn;
        this.periodicite = periodicite;
        this.datePublication = datePublication;
    }
    
    @Override
    public String getNumero() {
        return this.issn;
    }

    public String getPeriodicite() {
        return this.periodicite;
    }

    public LocalDate getDatePublication() {
        return this.datePublication;
    }

    // --- SETTERS ---

    public void setNumero(String issn) {
        this.issn = issn;
    }

    public void setPeriodicite(String periodicite) {
        this.periodicite = periodicite;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }
    
    // --- TOSTRING ---
    
    @Override
    public String toString() {
        // Affiche les infos de l'Article (description, prix...) + les infos du Magazine
        return super.toString() 
                + "\n- ISSN : " + this.issn 
                + "\n- Périodicité : " + this.periodicite 
                + "\n- Date de publication : " + this.datePublication;
    }
}
