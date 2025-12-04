/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet;

/**
 *
 * @author 33765
 */
public abstract class Article {
    protected String description; 
    protected int prix_initial;
    protected int nb_exemplaire;
    
    public Article(String description, int prix_initial, int nb_esxemplaire){
        this.description = description;
        this.prix_initial = prix_initial;
        this.nb_exemplaire = nb_esxemplaire;
    }
    
    public String get_description(){
        return this.description;
    }
    
    public void set_description(String description){
        this.description = description;
    }
    
    public int get_prix_initial(){
        return this.prix_initial;
    }
    
    public void set_nbPage(int prix_initial){
        this.prix_initial = prix_initial;
    }
    
    public int get_nb_exemplaire(){
        return this.prix_initial;
    }
    
    public void set_nb_exemplaire(int nb_exemplaire){
        this.nb_exemplaire = nb_exemplaire;
    }
    
    public abstract String getNumero();
            
    
    @Override
    public String toString(){
        return description + "\n- Prix : " + prix_initial + "€\n- Numero : " + getNumero();
    }
}
