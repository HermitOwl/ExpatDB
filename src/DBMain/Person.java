/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMain;

import java.util.Comparator;

/**
 *
 * @author James Agbotta
 */
public class Person implements XMLStringInterface, Comparable<Person> {

    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String date;
    private boolean gender;
    private Address address;
    private Telephone telephone;
    private Passport passport;
    private String email;
    private String profession;
    private static String[] maritalStatusList = {"N/a","SINGLE", "MARRIED", "DIVORCED", "WIDOWED"};
    private int maritalStatus;

    public Person() {
        title = "";
        firstName = "";
        middleName = "";
        lastName = "";
        date = "";
        gender = false;
        address = new Address();
        telephone = new Telephone();
        passport = new Passport();
        email = "";
        profession = "";
        maritalStatus = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDate() {
        return date;
    }

    public String getGender() {
        String temp = "FEMALE";
        if (gender == true) {
            temp = "MALE";
        }
        return temp;
    }

    public boolean getRawGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public Passport getPassport() {
        return passport;
    }

    public String getEmail() {
        return email;
    }

    public String getProfession() {
        return profession;
    }

    public int getMaritalStatus() {
        return maritalStatus;
    }

    public String[] getMaritalStatusList() {
        return maritalStatusList;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDate(String age) {
        this.date = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setMaritalStatus(int maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    
    public String getIDString(){
    return passport.getPassportNumber() + "- " + lastName+", "+ firstName;
     }

    public String toString() {
        //TODO: Placeholder. remove when complete 
        String temp = title + " " + firstName + " "+  middleName + "" + lastName + "\n";
        temp = temp + "age: " + date + "\n";
        temp = temp + "gender: " + this.getGender() + "\n";
        temp = temp + this.address.toString();
        temp = temp + "telephone: " + telephone.toString() + "\n";
        temp = temp + this.passport.toString();
        temp = temp + "email: " + email + "\n";
        temp = temp + "profession: " + profession + "\n";

        return temp;
    }

    @Override
    public String toXMLString() {
        String temp = "<Person>\n";
        temp = temp + "<title>" + title + "</title>\n";
        temp = temp + "<firstName>" + firstName + "</firstName>\n";
        temp = temp + "<middleName>" + middleName + "</middleName>\n";
        temp = temp + "<lastName>" + lastName + "</lastName>\n";
        temp = temp + "<age>" + date + "</age>\n";
        temp = temp + "<gender>" + this.getGender() + "</gender>\n";
        temp = temp + this.address.toXMLString();
        temp = temp + "<telephone>" + telephone.toXMLString() + "</telephone>\n";
        temp = temp + this.passport.toXMLString();
        temp = temp + "<email>" + email + "</email>\n";
        temp = temp + "<profession>" + profession + "</profession>\n";
        temp = temp + "</Person>\n";
        return temp;
    }

    
    //Comparators for the following options below: firstName, LastName, Age, 
        //Telephone number, profession, email and passport number
    
    public static Comparator<Person> compareLastName = new Comparator<Person>() {
        @Override
        public int compare(Person one, Person two) {
            String lastNameOne = one.getLastName();
            String lastNameTwo = two.getLastName();
            return lastNameOne.compareTo(lastNameTwo);
        }
    };

    public static Comparator<Person> compareFirstName = new Comparator<Person>() {
        @Override
        public int compare(Person one, Person two) {
            String firstNameOne = one.getFirstName();
            String firstNameTwo = two.getFirstName();
            return firstNameOne.compareTo(firstNameTwo);
        }
    };
    public static Comparator<Person> compareAge = new Comparator<Person>() {
        @Override
        public int compare(Person one, Person two) {
            String ageOne = one.getDate();
            String ageTwo = two.getDate();
            return ageOne.compareTo(ageTwo);
        }
    };

    public static Comparator<Person> compareTelephoneNo = new Comparator<Person>() {
        @Override
        public int compare(Person one, Person two) {
            String numOne = one.getTelephone().getPhoneNumber();
            String numTwo = two.getTelephone().getPhoneNumber();
            return numOne.compareTo(numTwo);
        }
    };
    
    public static Comparator<Person> compareEmail = new Comparator<Person>() {
        @Override
        public int compare(Person one, Person two) {
            String emailOne = one.getEmail();
            String emailTwo = two.getEmail();
            return emailOne.compareTo(emailTwo);
        }
    };
    
    public static Comparator<Person> comparePassportNo = new Comparator<Person>() {
         @Override
        public int compare(Person one, Person two) {
            String numOne = one.getPassport().getPassportNumber();
            String numTwo = two.getPassport().getPassportNumber();
            return numOne.compareTo(numTwo);
        }
    };

    public static Comparator<Person> compareProfession = new Comparator<Person>() {
        @Override
        public int compare(Person one, Person two) {
            String professionOne = one.getProfession();
            String professionTwo = two.getProfession();
            return professionOne.compareTo(professionTwo);
        }
    };
    @Override
    public int compareTo(Person t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        String personID = t.getPassport().getPassportNumber();
        return this.getPassport().getPassportNumber().compareTo(personID);
    }
}
