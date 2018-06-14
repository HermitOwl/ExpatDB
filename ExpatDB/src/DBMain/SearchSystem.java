/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMain;
import java.util.ArrayList;
/**
 *
 * @author jasex
 */
public class SearchSystem {
    
    private ArrayList<Person> loadedList;// for initial load
    private ArrayList<Person> currentList;// for list manipulations like searches and sorts
    
    
    public SearchSystem(){
    loadedList = new ArrayList();
    currentList = new ArrayList();
    }
    
}
