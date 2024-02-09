public class Book implements BookInterface{
    private int ISBN;
    private String Title;
    private String Aurthur;
    private String Genere;
    private String Availablity;

    @Override
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    @Override
    public int getISBN() {
        return this.ISBN;
    }
    @Override
    public void setTitle(String Title) {
        this.Title = Title;
    }
    @Override
    public String getTitle() {
        return this.Title;
    }
    @Override
    public void setAuthor(String Author) {
        this.Aurthur = Author;
    }
    @Override
    public String getAuthor() {
        return this.Aurthur;
    }
    @Override
    public void setGenre(String Genre) {
        this.Genere = Genre;
    }
    @Override
    public String getGenre() {
        return this.Genere;
    }
    @Override
    public void setAvailability(String Availablity) {
        this.Availablity = Availablity;
    }
    @Override
    public String getAvailability() {
        return this.Availablity;
    }
    private Book(BookBuilder Book){
        this.setISBN(Book.ISBN);
        this.setAuthor(Book.Aurthur);
        this.setGenre(Book.Genere);
        this.setAvailability(Book.Availablity);
        this.setTitle(Book.Title);

    }
    public static class BookBuilder{
        private int ISBN;
        private String Title;
        private String Aurthur;
        private String Genere;
        private String Availablity;
        BookBuilder(int ISBN,String Title,String Author){
            this.ISBN = ISBN;
            this.Aurthur = Author;
            this.Title = Title;
        }
        public BookBuilder setGenere(String Genere){
            this.Genere = Genere;
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
