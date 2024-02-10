//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Book b1 = new Book.BookBuilder().setISBN(1).setAvailability("Available").setGenere("Genere1").setTitle("Title32").setAuthor("Utkarsh ").Build();
    System.out.println(b1.getAuthor());
    }
}