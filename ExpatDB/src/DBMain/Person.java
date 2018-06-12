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
public class Person {
        private String title;
	private String firstName;
	private String middleName;
	private String lastName; 
	private int age;
	private boolean gender;
	private Address address ;
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
        
        public Address getAddress(){
        return address;
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
       
        
        
}
