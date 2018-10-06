/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMain;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *Input Output class for handling file and event based IO
 * 
 * @author James Agbotta
 */
public class InOut {
    private ArrayList<Person> persons;
    private ArrayList<String> tokens;
    private String filePath;
    private File file;
    private Scanner input;
    private PrintWriter outSave;
    //"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
    
    public InOut(){
    this.filePath="";
    file = null;
    persons = new ArrayList<Person>();
    tokens = new ArrayList<String>();

    }
    
    public InOut(File file){
        try{
        this.filePath = file.getPath();
        persons = new ArrayList<Person>();
        tokens = new ArrayList<String>();
        this.file = file;

        
        input = new Scanner(file);
        String temp = "";
        while(input.hasNextLine()){
         temp = input.nextLine();
            tokens.add(temp);
            System.out.println(temp);
        }
        input.close();
        
        }
        catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error", e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public File getFile(){
    return file;
    }
    
    public String getFilePath(){
    return filePath;
    }
    
    public void saveFile(ArrayList<Person> toSave, String filePath){
       persons = toSave;
       try{
       outSave = new PrintWriter(filePath);
       String outString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n <Database> \n";
       
           for (Person person : persons) {
               outString = outString + person.toXMLString();
           }
       outString = outString +"\n </Database>";
       
       outSave.print(outString);
       outSave.close();
       
       }
       catch(FileNotFoundException e){   
           JOptionPane.showMessageDialog(null, "Error- File not Found", e.getMessage(), JOptionPane.ERROR_MESSAGE);
       
       }
       catch(java.lang.NullPointerException e){
        JOptionPane.showMessageDialog(null, "Empty Database, Cannot save", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
}
