/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMain;
import java.util.ArrayList;
import  java.util.Comparator;


/**
 *
 * @author jasex
 */
public class SearchSystem {
    
    private ArrayList<Person> loadedList;// for initial load
    private ArrayList<Person> currentList;// for list manipulations like searches and sorts
    
    
    
    public SearchSystem(ArrayList<Person> loadedList){
    this.loadedList = loadedList;
    currentList = new ArrayList();
    }
    
    
    public ArrayList<Person> getLoadedList(){
    return loadedList;
    }
    
    public ArrayList<Person> getCurrentList(){
    return currentList;
    }
    
    //Returns all persons of specific first name
    public ArrayList<Person> getListByFirstName(String firstName){
        clearCurrentList();
        Person tempPerson;
        if(!loadedList.isEmpty()){
            for(int i =0; i < loadedList.size(); i++){
                tempPerson = loadedList.get(i);
                if(tempPerson.getFirstName().contains(firstName.trim())){
                    currentList.add(tempPerson);
                }
            }
        
        }
        return currentList;
    }
    
    //Returns all persons of specific middle name
    public ArrayList<Person> getListByMiddleName(String middleName){
        clearCurrentList();
        Person tempPerson;
        if(!loadedList.isEmpty()){
            for(int i =0; i < loadedList.size(); i++){
                tempPerson = loadedList.get(i);
                if(tempPerson.getMiddleName().contains(middleName.trim())){
                    currentList.add(tempPerson);
                }
            }
        
        }
        return currentList;
    }
    
    //Returns all persons of specific last name
    public ArrayList<Person> getListByLastName(String lastName){
        clearCurrentList();
        Person tempPerson;
        if(!loadedList.isEmpty()){
            for(int i =0; i < loadedList.size(); i++){
                tempPerson = loadedList.get(i);
                if(tempPerson.getLastName().contains(lastName.trim())){
                    currentList.add(tempPerson);
                }
            }
        }
        return currentList;
    }
    
     //Returns all persons of specific age
    public ArrayList<Person> getListByAge(int age){
        clearCurrentList();
        Person tempPerson;
        if(!loadedList.isEmpty()){
            for(int i =0; i < loadedList.size(); i++){
                tempPerson = loadedList.get(i);
                if(tempPerson.getAge()== age){
                    currentList.add(tempPerson);
                }
            }
        }
        return currentList;
    }
    
      //Returns all persons of specific gender
    public ArrayList<Person> getListByGender(boolean gender){
        clearCurrentList();
        Person tempPerson;
        if(!loadedList.isEmpty()){
            for(int i =0; i < loadedList.size(); i++){
                tempPerson = loadedList.get(i);
                if(tempPerson.getRawGender()== gender){
                    currentList.add(tempPerson);
                }
            }
        }
        return currentList;
    }
    
      //Returns all persons of specific City
    public ArrayList<Person> getListLocation(String city){
        clearCurrentList();
        Address tempAddress;
        if(!loadedList.isEmpty()){
            for(int i =0; i < loadedList.size(); i++){
                tempAddress = loadedList.get(i).getAddress();
                if(tempAddress.getTownCity().contains(city)){
                    currentList.add(loadedList.get(i));
                }
            }
        }
        return currentList;
    }
    
    //search by passport number.
    public ArrayList<Person> getPersonByPassportNumber(String passportNumber){
        clearCurrentList();
        Passport tempPassport;
        if(!loadedList.isEmpty()){
            for(int i = 0; i<loadedList.size(); i++){
                tempPassport = loadedList.get(i).getPassport();
                if(tempPassport.getPassportNumber().contains(passportNumber)){
                    currentList.add(loadedList.get(i));
                }
            }
        }
    return currentList;
    }
    
     //Returns all persons of specific profession
    public ArrayList<Person> getListByProfession(String profession){
        clearCurrentList();
        Person tempPerson;
        if(!loadedList.isEmpty()){
            for(int i =0; i < loadedList.size(); i++){
                tempPerson = loadedList.get(i);
                if(tempPerson.getProfession().contains(profession.trim())){
                    currentList.add(tempPerson);
                }
            }
        }
        return currentList;
    }
    
    public ArrayList<Person> getListByMaritalStatus(int status){
         clearCurrentList();
        Person tempPerson;
        if(!loadedList.isEmpty()){
            for(int i =0; i < loadedList.size(); i++){
                tempPerson = loadedList.get(i);
                if(tempPerson.getMaritalStatus() == status) {
                    currentList.add(tempPerson);
                }
            }
        }
        return currentList;
    }
    

    
    public void clearCurrentList(){
        currentList = new ArrayList<>();
    }
    
    //adding sorting algorithms
   
   
        public ArrayList<Person> sortByLastName(ArrayList<Person> unsortedList)
    {
        currentList = unsortedList;
        currentList.sort(new Person().compareLastName);
        return currentList;
    }
}
