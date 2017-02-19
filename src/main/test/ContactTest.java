import com.example.model.Contact;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContactTest {
    @Test
    public void testContactToString() {
        String contactName = "Bob";
        String contactNumber = "0798926717";
        Contact contact = new Contact(contactName, contactNumber);

        assertEquals("Bob has contact number 0798926717", contact.toString());
    }
}
