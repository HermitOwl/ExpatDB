/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMain;

/**
 *
 * @author James Agbotta
 */
public class Telephone implements XMLStringInterface{
    private String phoneNumber;
    private static String[] phoneNumberType= {"HOME", "WORK", "MOBILE", "OTHER"};
    private int numberType;
    
    public Telephone(){
    phoneNumber = "";
    numberType = 0;
    }
    
    public Telephone(String phoneNumber, int numberType){
    this.phoneNumber = phoneNumber;
    this.numberType = numberType;
    }
    
    public String getPhoneNumber(){
    return phoneNumber;
    }
    
    public String getPhoneNumberType(){
        String temp =phoneNumberType[0];
    if((numberType >= 0)&& (numberType < phoneNumberType.length)){
         temp =phoneNumberType[numberType];
    }
    return temp;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber =phoneNumber;
    }
    
    public void setNumberType(int numberType){
        this.numberType = numberType;
    }

    @Override
    public String toXMLString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
