/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMain;
import java.util.ArrayList;
import javax.swing.JFileChooser;
/**
 *
 * @author James Agbotta
 */
public class ExpatDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Person> persons = new ArrayList<Person>();
        JFileChooser jfc = new JFileChooser();
        InOut reader = new InOut(jfc.getSelectedFile().getPath());
        System.out.println("Working!");
        
        
    }
    
}
