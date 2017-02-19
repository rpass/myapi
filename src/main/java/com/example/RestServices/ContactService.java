package com.example.RestServices;

import com.example.DAO.ContactDAO;
import com.example.model.Contact;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("contact")
public class ContactService {

    private ContactDAO contactDAO = new ContactDAO();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {

        Contact[] contacts = contactDAO.getContacts();
        String response = "";
        for (Contact contact : contacts) {
            response += contact.toString() + "\n";
        }
        return response;
    }
}
