/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projet;
import java.time.LocalDate;

/**
 *
 * @author 33765
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livre l1 = new Livre("description", 10, 32, "45-78-632", 321);
        Manuels m1 = new Manuels("description", 15, 3, "545-45", 150, "Maths", "college");
        Magazines mz1 = new Magazines("description", 25, 17, "471-25-9658", "trimestriel", LocalDate.parse("2025-09-14"));
        // TODO code application logic here
    }
}
