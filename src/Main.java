//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Book b1 = new Book.BookBuilder().setISBN(1).setAvailability("Available").setGenere("Genere1").setTitle("Title32").setAuthor("Utkarsh ").Build();
    Patreon p1 = new Patreon.PatreonBuilder().setPID(1).setPName("Rohit").setUserName("BlackHat").setPassword("89432").setMembershipStatus("Active").Build();
    p1.setAmount(10090);
    p1.setPName("Rohit Shukla");
    System.out.println(p1);
    System.out.println(p1.getPName());
    System.out.println(b1.getAuthor());
    }
}