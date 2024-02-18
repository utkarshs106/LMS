import java.util.ArrayList;

public class Data {
    public static void LoadObjects(){
        Book b1 = new Book.BookBuilder().setISBN(1).setAvailability("Available").setGenre("Genere1").setTitle("Title32").setAuthor("Utkarsh ").Build();
        Book b2 = new Book.BookBuilder().setISBN(2).setAvailability("Unavailable").setGenre("Genere1").setTitle("Title32").setAuthor("Utkarsh ").Build();
        Book b3 = new Book.BookBuilder().setISBN(978200).setAvailability("Available").setTitle("To Kill a Mockingbird").setAuthor("Harper Lee").Build();
        Book b4 = new Book.BookBuilder().setISBN(978079).setAvailability("Available").setTitle("The Great Gatsby").setAuthor("F. Scott Fitzgerald").Build();
        Book b5 = new Book.BookBuilder().setISBN(195630).setAvailability("Unavailable").setTitle("Pride and Prejudice").setAuthor("Jane Austen").Build();
        Book b6 = new Book.BookBuilder().setISBN(366725).setAvailability("Available").setTitle("The Catcher in the Rye").setAuthor("J.D. Salinger").Build();
        Book b7 = new Book.BookBuilder().setISBN(799881).setAvailability("Available").setTitle("1984").setAuthor("George Orwell").Build();
        Book b8 = new Book.BookBuilder().setISBN(978404).setTitle("The Alchemist").setAuthor("Paulo Coelho").setAvailability("Available").Build();
        Book b9 = new Book.BookBuilder().setISBN(97467).setTitle("The Road").setAuthor("Cormac McCarthy").setAvailability("Available").Build();
        Book b10 =new Book.BookBuilder().setISBN(6769488).setTitle("The Bell Jar").setAuthor("Sylvia Plath").setAvailability("Available").Build();

        Patreon p1 = new Patreon.PatreonBuilder().setPID(1).setPName("Rohit").setUserName("BlackHat").setPassword("89432").setMembershipStatus("Active").Build();
        Patreon p2 = new Patreon.PatreonBuilder()
                .setPID(2)
                .setPName("Alice")
                .setUserName("Wonderland23")
                .setPassword("alice123")
                .setMembershipStatus("Inactive")
                .Build();

        Patreon p3 = new Patreon.PatreonBuilder()
                .setPID(3)
                .setPName("Bob")
                .setUserName("BobMaster")
                .setPassword("bob456")
                .setMembershipStatus("Active")
                .Build();

        Patreon p4 = new Patreon.PatreonBuilder()
                .setPID(4)
                .setPName("Eve")
                .setUserName("HackerEve")
                .setPassword("eve789")
                .setMembershipStatus("Active")
                .Build();
        Patreon p5 = new Patreon.PatreonBuilder()
                .setPID(5)
                .setPName("Emma")
                .setUserName("BookLover")
                .setPassword("emma123")
                .setMembershipStatus("Active")
                .Build();

        Patreon p6 = new Patreon.PatreonBuilder()
                .setPID(6)
                .setPName("John")
                .setUserName("TechGeek")
                .setPassword("john456")
                .setMembershipStatus("Inactive")
                .Build();

        Patreon p7 = new Patreon.PatreonBuilder()
                .setPID(7)
                .setPName("Sophia")
                .setUserName("ArtEnthusiast")
                .setPassword("sophia789")
                .setMembershipStatus("Active")
                .Build();

    }
    }


