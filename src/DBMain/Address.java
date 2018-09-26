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
public class Address implements XMLStringInterface{
	private String houseName;
	private String streetName;
	private String postCode;
	private String townCity;
        
        public Address(){

        houseName ="";
        streetName="";
        postCode = "";
        townCity= "";
        }
        
        public Address(String houseName,String streetName,String postCode,String townCity ){
            this.houseName = houseName;
            this.streetName = streetName;
            this.postCode = postCode;
            this.townCity = townCity;
        }
        

        public String getHouseName(){
            return  houseName;
        }
        public String getStreetName(){
            return  streetName;
        }
        public String getPostCode(){
            return  postCode;
        }
        
        public String getTownCity(){
            return  townCity;
        }
        
        public void setHouseName(String houseName){
            this.houseName = houseName;
        }
        public void setStreetName(String streetName){
            this.streetName = streetName;
        }
        public void setPostCode(String postCode){
            this.postCode = postCode;
        }
        
        public void setTownCity(String townCity){
            this.townCity = townCity;
        }
        
        @Override
        public String toString(){
        String temp =  "Address: \n"  + houseName + "\n " + streetName + "\n" + townCity + "\n" + postCode;
            return temp;
        }
        
        @Override
        public String toXMLString(){
        String temp = "<address>\n";
        temp = temp + "<houseName>"+houseName+"</houseName>\n";
        temp = temp + "<streetName>"+streetName+"</streetName>\n";
        temp = temp + "<postCode>"+postCode+"</postCode>\n";
        temp = temp + "<townCity>"+townCity+"</townCity>\n";
        temp = temp + "</address>\n";
        return temp;
        }
        
        
}
