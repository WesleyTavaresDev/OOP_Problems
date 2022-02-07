package telephonecalendar;

import java.util.Arrays;
import java.util.List;

public class Calendar {
    public static void main(String[] args) {

        Contact brenda = new Contact("Brenda", 98560584L);
        Contact wesley = new Contact("Wesley", 98734096L);
        Contact martin = new Contact("Beatriz", 92134609L);

        List<Contact> contact = Arrays.asList(brenda, wesley, martin);

        for (Contact c : contact)
            System.out.printf("Name -> %s%nPhone Number -> %s%n", c.getName(), c.getPhoneNumber());
    }

}
