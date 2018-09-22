/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMain;
import  java.util.Comparator;
/**
 *
 * @author James Agbotta
 */
public class Person implements XMLStringInterface, Comparable<Person>{
        private String title;
	private String firstName;
	private String middleName;
	private String lastName; 
	private int age;
	private boolean gender;
	private Address address ;
        private Telephone telephone;
	private Passport passport;
	private String email;
        private String profession;
	private static String[] maritalStatusList = {"SINGLE", "MARRIED", "DIVORCED", "WIDOWED"};
        private int maritalStatus;
        
        public Person(){
        title = "";
	firstName = "";
	middleName  = "";
	lastName  = "";
	age  = 0;
	gender  = false;
	address  = new Address();
        telephone = new Telephone();
	passport = new Passport();
	email = "";
        profession = "";
        maritalStatus = 0;
        }
        
        public String getTitle(){
        return title;
        }
        
        public String getFirstName(){
        return firstName;
        }
        
        public String getMiddleName(){
        return middleName;
        }
        
        public String getLastName(){
        return lastName;
        }
        
        public int getAge(){
        return age;
        }
        
        public String getGender(){
        String temp = "FEMALE";
        if(gender == true ) temp = "MALE";
        return temp;
        }
        
        public boolean getRawGender(){
        return gender;
        }
        
        public Address getAddress(){
        return address;
        }
        
        public Telephone getTelephone(){
        return telephone;
        }
        
        public Passport getPassport(){
        return passport;
        }
        
        public String getEmail(){
        return email;
        }
        
        public String getProfession(){
        return profession;
        }
        
        public int getMaritalStatus(){
        return maritalStatus;
        }
        
        public String[] getMaritalStatusList(){
            return maritalStatusList;
        }
        
        public void setTitle(String title){
        this.title =title;
        }
        
        public void setFirstName(String firstName){
        this.firstName = firstName;
        }
        
        public void setLastName(String lastname){
            this.lastName = lastName;
        }
        
        public void setAge(int age){
        this.age = age;
        }
        
        public void setGender (boolean gender){
            this.gender = gender;
        }
        
        public void setAddress(Address address){
            this.address = address;
        }
        
        public void setTelephone(Telephone telephone){
        this.telephone = telephone;
        }
        
        public void setPassport(Passport passport){
            this.passport = passport;
        }
        
        public void setEmail(String email){
            this.email = email;
        }
        
        public void setProfession(String profession){
        this.profession = profession;
        }
        
        public void setMaritalStatus(int maritalStatus){
        this.maritalStatus = maritalStatus;
        }
       
        public String toString(){
        //TODO: Placeholder. remove when complete 
            String temp ="";
        
        return temp;
        }
        
        @Override
        public String toXMLString(){
        //TODO: Placeholder. remove when complete 
            String temp = "<Person>\n";
            temp = temp + "<title>"+title+"</title>\n";
            temp = temp + "<firstName>"+firstName+"</firstName>\n";
            temp = temp + "<middleName>"+middleName+"</middleName>\n";
            temp = temp + "<lastName>"+lastName+"</lastName>\n";
            temp = temp + "<age>"+age+"</age>\n";
            temp = temp + "<gender>"+this.getGender()+"</gender>\n";
            temp = temp + this.address.toXMLString();
            temp = temp + "<telephone>"+telephone+"</telephone>\n";
            temp = temp + this.passport.toXMLString();
            temp = temp + "<email>"+email +"</email>\n";
            temp = temp + "<profession>"+profession+"</profession>\n";
            temp = temp + "</Person>\n";
        return temp;
        }
        
        public static Comparator<Person> compareLastName = new Comparator<Person>(){       
        public int compare(Person one, Person two){
            String lastNameOne = one.getLastName();
            String lastNameTwo = two.getLastName();
            return lastNameOne.compareTo(lastNameTwo);
        }
    };

    @Override
    public int compareTo(Person t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        String personID = t.getPassport().getPassportNumber();
        return this.getPassport().getPassportNumber().compareTo(personID);
    }
}
