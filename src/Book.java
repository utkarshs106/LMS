public class Book implements BookInterface{
    // Here we are using Builder Design Pattern
    private int ISBN;
    private String Title;
    private String Author;
    private String Genre;
    private String Availability;


    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getISBN() {
        return this.ISBN;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }
    @Override
    public String getTitle() {
        return this.Title;
    }
    @Override
    public void setAuthor(String Authur) {
        this.Author = Authur;
    }
    @Override
    public String getAuthor() {
        return this.Author;
    }
    @Override
    public void setGenre(String Genre) {
        this.Genre = Genre;
    }
    @Override
    public String getGenre() {
        return this.Genre;
    }
    @Override
    public void setAvailability(String Availablity) {
        this.Availability = Availablity;
    }
    @Override
    public String getAvailability() {
        return this.Availability;
    }
    private Book(BookBuilder Book){
        // This is constructor which sets the attribute in this object from Book object
        this.setISBN(Book.ISBN);
        this.setAuthor(Book.Authur);
        this.setGenre(Book.Genre);
        this.setAvailability(Book.Availablity);
        this.setTitle(Book.Title);
    }

    public static class BookBuilder{
        private int ISBN;
        private String Title;
        private String Authur;
        private String Genre;
        private String Availablity;

        BookBuilder setISBN(int ISBN){
            this.ISBN = ISBN;
            return this;
        }
        BookBuilder setAuthor(String Author){
            this.Authur = Author;
            return this;
        }
        public BookBuilder setTitle(String Title){
            this.Title = Title;
            return this;
        }
        public BookBuilder setGenre(String Genre){
            this.Genre = Genre;
            return this;
        }
        public BookBuilder setAvailability(String Availability){
            this.Availablity = Availability;
            return this;
        }
        public Book Build(){
            return new Book(this);
        }
    }
}
