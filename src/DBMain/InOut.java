/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMain;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

/**
 * Input Output class for handling file and event based IO
 *
 * @author James Agbotta
 */
public class InOut {

    private ArrayList<Person> persons;

    private String filePath;
    private File file;
    private Scanner input;
    private PrintWriter outSave;
    //"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"

    public InOut() {
        this.filePath = "";
        file = null;
        persons = new ArrayList<Person>();
    }

    public InOut(File file) {
        try {
            this.filePath = file.getPath();
            persons = new ArrayList<Person>();
            this.file = file;

            input = new Scanner(file);
            String temp = "";
            while (input.hasNextLine()) {
                temp = input.nextLine();
              //  System.out.println(temp);
            }
            input.close();
            this.parseFile();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to load File", "Load Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public File getFile() {
        return file;
    }

    public String getFilePath() {
        return filePath;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void saveFile(ArrayList<Person> toSave, String filePath) {
        persons = toSave;
        try {
            outSave = new PrintWriter(filePath);
            String outString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n <Database> \n";

            for (Person person : persons) {
                outString = outString + person.toXMLString();
            }
            outString = outString + "\n </Database>";

            outSave.print(outString);
            outSave.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error- File not Found", e.getMessage(), JOptionPane.ERROR_MESSAGE);

        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Empty Database, Cannot save", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void parseFile() {
        try {
            Person person = new Person();
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(filePath);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Person");
            Node nNode;
            Element eElement;
            String title, firstName, middleName, lastName, age, houseName, streetName, postCode, townCity, telNum, passportNumber, plcOI, doi, doe, profession;
            boolean gender;
            int numType, maritalStatus;
            String temp = "";
            for (int i = 0; i < nList.getLength(); i++) {
                nNode = nList.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    eElement = (Element) nNode;
                    // System.out.println("This is "+ eElement.getElementsByTagName("numberType").item(0).getTextContent());
                    title = eElement.getElementsByTagName("title").item(0).getTextContent();
                    firstName = eElement.getElementsByTagName("firstName").item(0).getTextContent();
                    middleName = eElement.getElementsByTagName("middleName").item(0).getTextContent();
                    lastName = eElement.getElementsByTagName("lastName").item(0).getTextContent();
                    age = eElement.getElementsByTagName("age").item(0).getTextContent();
                    houseName = eElement.getElementsByTagName("houseName").item(0).getTextContent();
                    streetName = eElement.getElementsByTagName("streetName").item(0).getTextContent();
                    postCode = eElement.getElementsByTagName("postCode").item(0).getTextContent();
                    townCity = eElement.getElementsByTagName("townCity").item(0).getTextContent();
                    telNum = eElement.getElementsByTagName("phoneNumber").item(0).getTextContent();
                    passportNumber = eElement.getElementsByTagName("passportNumber").item(0).getTextContent();
                    plcOI = eElement.getElementsByTagName("placeOfIssue").item(0).getTextContent();
                    doi = eElement.getElementsByTagName("dateOfIssue").item(0).getTextContent();
                    doe = eElement.getElementsByTagName("dateOfExpiry").item(0).getTextContent();
                    profession = eElement.getElementsByTagName("profession").item(0).getTextContent();

                    temp = eElement.getElementsByTagName("gender").item(0).getTextContent();
                    if (temp.equals("MALE")) {
                        gender = true;
                    } else if (temp.equals("FEMALE")) {
                        gender = false;
                    }
                    numType = Integer.parseInt(eElement.getElementsByTagName("numberType").item(0).getTextContent());
                    maritalStatus = Integer.parseInt(eElement.getElementsByTagName("maritalStatus").item(0).getTextContent());
                    person.setTitle(title);
                    person.setFirstName(firstName);
                    person.setMiddleName(middleName);
                    person.setLastName(lastName);
                    person.setDate(age);
                    Address addrs = new Address(houseName, streetName, postCode, townCity);
                    person.setAddress(addrs);
                    Telephone tel = new Telephone(telNum, numType);
                    person.setTelephone(tel);
                    Passport passprt = new Passport(passportNumber, plcOI, doi, doe);
                    person.setPassport(passprt);
                    person.setProfession(profession);
                    persons.add(person);
                    //TODO: REmove below 
                   // System.out.println(persons.get(i).toString());
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to load File", "Load Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }
}
