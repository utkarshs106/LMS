import com.sun.source.tree.ParenthesizedPatternTree;

import java.util.ArrayList;

public class Data {
    public static void LoadObjects(){
        Book b1 = new Book.BookBuilder().setISBN(1).setAvailability("Available").setGenre("Genere1").setTitle("Title32").setAuthor("Utkarsh ").Build();
        Book b2 = new Book.BookBuilder().setISBN(2).setAvailability("Unavailable").setGenre("Genere1").setTitle("Title32").setAuthor("Utkarsh ").Build();

        Book b3 = new Book.BookBuilder().setISBN(978200).setAvailability("Available").setTitle("To Kill a Mockingbird").setAuthor("Harper Lee").Build();
        Book b4 = new Book.BookBuilder().setISBN(978079).setAvailability("Available").setTitle("The Great Gatsby").setAuthor("F. Scott Fitzgerald").Build();
        Book b5 = new Book.BookBuilder().setISBN(195630).setAvailability("Unavailable").setTitle("Pride and Prejudice").setAuthor("Jane Austen").Build();
        Book b6 = new Book.BookBuilder().setISBN(366725).setAvailability("Available").setTitle("The Catcher in the Rye").setAuthor("J.D. Salinger").Build();
        Book b7
                = new Book.BookBuilder().setISBN(799881).setAvailability("Available").setTitle("1984").setAuthor("George Orwell").Build();
        Book b8 = new Book.BookBuilder().setISBN(978404).setTitle("The Alchemist").setAuthor("Paulo Coelho").setAvailability("Available").Build();
        Book b9 = new Book.BookBuilder().setISBN(97467).setTitle("The Road").setAuthor("Cormac McCarthy").setAvailability("Available").Build();
        Book b10 =new Book.BookBuilder().setISBN(6769488).setTitle("The Bell Jar").setAuthor("Sylvia Plath").setAvailability("Available").Build();

        // Prototype design pattern
        Patreon SamplePatreon = new Patreon(1,"SampleName","SampleUserName","SamplePassword",1,"Active");
        Patreon p1 = SamplePatreon.cloneObj();
        p1.setPID(1);
        p1.setPName("Rohit");
        p1.setUserName("BlackHat");
        p1.setPassword("89432");
        p1.setAmount(123);
        p1.setMembershipStatus("Active");

        Patreon p2 = SamplePatreon.cloneObj();
        p2.setPID(2);
        p2.setPName("Alice");
        p2.setUserName("Wonderland23");
        p2.setPassword("Alice123");
        p2.setMembershipStatus("Inactive");

        System.out.println(p1);
        System.out.println(p2);

        Patreon p3 = SamplePatreon.cloneObj();
        p2.setPID(3);
        p2.setPName("Bob");
        p2.setUserName("BobMaster");
        p2.setPassword("bob456");
        p2.setMembershipStatus("Inactive");

        Patreon p4 = SamplePatreon.cloneObj();
        p2.setPID(4);
        p2.setPName("Eve");
        p2.setUserName("HackerEve");
        p2.setPassword("eve789");
        p2.setMembershipStatus("Active");


    }
    }


