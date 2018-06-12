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
    private String currentNationality;
    private String placeOfIssue;
    private Date dateOfIssue;
    private Date dateOfExpiry;
    private static String previousNationality = "Ghana";
        
    public Passport(){
    passportNumber ="";
    currentNationality= "";
    placeOfIssue = "";
    dateOfIssue = new Date();
    dateOfExpiry = new Date();
    }
    
    public Passport(String passportNumber, String currentNationality, String placeOfIssue, Date dateOfIssue, Date dateOfExpiry){
    this.passportNumber = passportNumber;
    this.currentNationality= currentNationality;
    this.placeOfIssue = placeOfIssue;
    this.dateOfIssue = dateOfIssue;
    this.dateOfExpiry = dateOfExpiry;
    }
    
    public String getPassportNumber(){
    return passportNumber;
    }
    
    public String getCurrentNumber(){
    return currentNationality;
    }
    
    public String getPlaceOfIssue(){
        return placeOfIssue;
    }
    
    public Date getDateOfIssue(){
        return dateOfIssue;
    }
    
    public Date getDateOfExpiry(){
        return dateOfExpiry;
    }
    
    public String getPreviousNationality(){
        return previousNationality;
    }
    
    public void setPassportNumber(String passportNumber){
        this.passportNumber = passportNumber;
    }
    
    public void setCurrentNumber(String currentNationality){
        this.currentNationality= currentNationality;
    }
    
    public void setPlaceOfIssue(String placeOfIssue){
        this.placeOfIssue = placeOfIssue;
    }
    public void setDateOfIssue( Date dateOfIssue){
        this.dateOfIssue = dateOfIssue;
    }
    
   public void setDateOfExpiry( Date dateOfExpiry){
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public String toXMLString() {
        String temp ="<passport>";
        temp = temp + "<passportNumber>"+passportNumber+"</passportNumber>";
        temp = temp + "<currentNationality>"+currentNationality+"</currentNationality>";
        temp = temp + "<placeOfIssue>"+placeOfIssue+"</placeOfIssue>";
        temp = temp + "<dateOfIssue>"+dateOfIssue+"</dateOfIssue>";
        temp = temp + "<dateOfExpiry>"+dateOfExpiry+"</dateOfExpiry>";
        temp = temp + "<previousNationality>"+previousNationality+"</previousNationality>";
        return temp;
    }
    
}
