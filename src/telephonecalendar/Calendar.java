package telephonecalendar;

import java.util.Arrays;
import java.util.List;

public class Calendar {
    public static void main(String[] args) {
        Calendar phoneCalendar = new Calendar();

        List<Contact> contact = phoneCalendar.contacts();

        for (Contact c : contact)
            System.out.printf("Name -> %s%nPhone Number -> %s%n", c.getName(), c.getPhoneNumber());
    }

    List<Contact> contacts()
    {
        Contact brenda = new Contact("Brenda", 98560584L);
        Contact wesley = new Contact("Wesley", 98734096L);
        Contact martin = new Contact("Beatriz", 92134609L);

        return  Arrays.asList(brenda, wesley, martin);
    }

}
