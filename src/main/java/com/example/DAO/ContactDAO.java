package com.example.DAO;

import com.example.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactDAO {
    public Contact[] getContacts() {
        List<Contact> contactList = new ArrayList<>();
        Contact bob = new Contact("bob", "1234");
        Contact sarah = new Contact("sarah", "9999");
        Contact emily = new Contact("john", "243541");
        contactList.add(bob);
        contactList.add(sarah);
        contactList.add(emily);
        return contactList.toArray(new Contact[0]);
    }
}

