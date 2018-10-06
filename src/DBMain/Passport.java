/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMain;
import java.util.Date;
/**
 *
 * @author James Agbotta
 */
public class Passport implements XMLStringInterface{
    private String passportNumber;
    private String placeOfIssue;
    private String dateOfIssue;
    private String dateOfExpiry;

        
    public Passport(){
    passportNumber ="";
    placeOfIssue = "";
    dateOfIssue = "";
    dateOfExpiry = "";
    }
    
    public Passport(String passportNumber, String placeOfIssue, String dateOfIssue, String dateOfExpiry){
    this.passportNumber = passportNumber;
    this.placeOfIssue = placeOfIssue;
    this.dateOfIssue = dateOfIssue;
    this.dateOfExpiry = dateOfExpiry;
    }
    
    public String getPassportNumber(){
    return passportNumber;
    }
    

    
    public String getPlaceOfIssue(){
        return placeOfIssue;
    }
    
    public String getDateOfIssue(){
        return dateOfIssue;
    }
    
    public String getDateOfExpiry(){
        return dateOfExpiry;
    }

    
    public void setPassportNumber(String passportNumber){
        this.passportNumber = passportNumber;
    }
    
    
    public void setPlaceOfIssue(String placeOfIssue){
        this.placeOfIssue = placeOfIssue;
    }
    public void setDateOfIssue( String dateOfIssue){
        this.dateOfIssue = dateOfIssue;
    }
    
   public void setDateOfExpiry( String dateOfExpiry){
        this.dateOfExpiry = dateOfExpiry;
    }
   @Override
    public String toString() {
        String temp ="Passport Number: "+passportNumber+"\n";
        temp = temp + "Place Of Issue: "+placeOfIssue+"\n";
        temp = temp + "Date Of Issue:"+dateOfIssue+"\n";
        temp = temp + "Date Of Expiry: "+dateOfExpiry+"\n";
        return temp;
    }

    @Override
    public String toXMLString() {
        String temp ="<passport>\n";
        temp = temp + "<passportNumber>"+passportNumber+"</passportNumber>\n";
        temp = temp + "<placeOfIssue>"+placeOfIssue+"</placeOfIssue>\n";
        temp = temp + "<dateOfIssue>"+dateOfIssue+"</dateOfIssue>\n";
        temp = temp + "<dateOfExpiry>"+dateOfExpiry+"</dateOfExpiry>\n";
        temp = temp + "</passport>\n";
        return temp;
    }
    
}
