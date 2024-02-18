public class Librarian implements LibrarianInterface {
    private int ID;
    private String Name;
    private String Username;
    private String Password;
    private String Email;
    private int Contact;
    private String Address;

    @Override
    public int getId() {
        return this.ID;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }


    public String getName() {
        return this.Name;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String getUsername() {
        return this.Username;
    }

    @Override
    public void setUsername(String UserName) {
        this.Username = UserName;
    }

    @Override
    public String getPassword() {
        return this.Password;
    }

    @Override
    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String getEmail() {
        return this.Email;
    }

    @Override
    public void setContact(int Contact) {
        this.Contact = Contact;
    }

    @Override
    public int getContact() {
        return this.Contact;
    }

    @Override
    public String getAddress() {
        return this.Address;
    }

    @Override
    public void setAddress(String Address) {
        this.Address = Address;
    }
}
