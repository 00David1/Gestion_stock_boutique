/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet;

/**
 *
 * @author 33765
 */
public class Livre extends Article{
    protected String isbn;
    protected int nb_page;
    
    public Livre(String description, int prix_initial, int nb_exemplaire, String isbn, int nb_page){
        super(description, prix_initial, nb_exemplaire);
        this.isbn = isbn;
        this.nb_page = nb_page;
    }
    
    @Override
    public String getNumero(){
        return this.isbn;
    }
    
    public void setNumero(String isbn){
        this.isbn = isbn;
    }
    
    public int getNbPage(){
        return this.nb_page;
    }
    
    public void setNbPage(int nb_page){
        this.nb_page = nb_page;
    }
    
    @Override
    public String toString(){
        return description + "\n- Prix : " + prix_initial + "€\n- ISBN : " + isbn;
    }
}
