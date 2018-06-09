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
	private boolean Gender;
	private Address address ;
	private Passport passport;
	private String email;
        private String profession;
	private String[] maritalStatusEnum = {"SINGLE", "MARRIED", "DIVORCED", "WIDOWED"};
        private int maritalStatus;
        
        public Person(){
        title = "";
	firstName = "";
	middleName  = "";
	lastName  = "";
	age  = 0;
	Gender  = false;
	address  = new Address();
	passport = new Passport();
	email = "";
        profession = "";
        maritalStatus = 0;
        }
        
        
        public String getTitle(){
        return title;
        }
        
}
