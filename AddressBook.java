package com.bridgeLabz.AddressBookManagement;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static Logger logger = Logger.getLogger(AddressBook.class);
    //Creating arrayList
    private ArrayList<Person> data=new ArrayList<Person>();

    public void addPerson() {
        BasicConfigurator.configure();
        //Taking user input
        Scanner sc = new Scanner(System.in);
        //Person person = new Person();

        logger.info("Enter first name: ");
        String fName = sc.nextLine();
        //person.setFName(fName);

        logger.info("Enter last name: ");
        String lName = sc.nextLine();
        //person.setLName(lName);

        logger.info("Enter email_id: ");
        String emailId = sc.nextLine();
        //person.setEmailId(emailId);

        logger.info("Enter phoneNumber: ");
        long phoneNum = sc.nextLong();
        //person.setPhoneNumber(phoneNum);

        logger.info("Enter state name: ");
        String state = sc.nextLine();
        //person.setState(state);

        logger.info("Enter city name: ");
        String city = sc.nextLine();
        //person.setCity(city);

        Person newEntry = new Person(fName,lName,emailId,phoneNum,state,city);

        this.data.add(newEntry);
        logger.info("\n[*]\t" + fName + " " + lName + " added to address book");
    }

    public static void main(String[] args) {
        //Creating object of AddressBook
        AddressBook info = new AddressBook();
        info.addPerson(); // calling addPerson function
    }
}
