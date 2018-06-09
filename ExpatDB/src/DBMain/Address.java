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
public class Address {
    private int houseNumber;
	private String houseName;
	private String streetName;
	private String postCode;
	private String townCity;
        
        public Address(){
        houseNumber =0;
        houseName ="";
        streetName="";
        postCode = "";
        townCity= "";
        }
        
        public Address(int houseNumber, String houseName,String streetName,String postCode,String townCity ){
            this.houseNumber =houseNumber;
            this.houseName = houseName;
            this.streetName = streetName;
            this.postCode = postCode;
            this.townCity = townCity;
        }
        
        public int getHouseNumber(){
            return  houseNumber;
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
        
        public void setHouseNumber(int houseNumber){
            this.houseNumber =houseNumber;
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
        
        
        
}
