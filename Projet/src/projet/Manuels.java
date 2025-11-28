/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet;

/**
 *
 * @author 33765
 */
public class Manuels extends Livre{
    private String matiere; 
    private String niveau; 
    
    public Manuels(String description, int prix_initial, int nb_exemplaire, String isbn, int nb_page, String matiere, String niveau){
        super(description, prix_initial, nb_exemplaire, isbn, nb_page);
        this.matiere = matiere;
        this.niveau = niveau;
    }
    
    public String getMatiere() {
        return this.matiere;
    }

    public String getNiveau() {
        return this.niveau;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n- Matière : " + this.matiere + "\n- Niveau : " + this.niveau;
    }
}
