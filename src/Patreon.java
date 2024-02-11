import java.util.ArrayList;

public class Patreon {
    private int PID;
    private String PName;
    private String UserName;
    private String Password;
    private int Amount;
    ArrayList<Integer> BookList= new ArrayList<Integer>();
    private String MembershipStatus;
    private String PType;

    Patreon(PatreonBuilder p1){
        this.PID = p1.PID;
        this.PName = p1.PName;
        this.PType = p1.PType;
        this.UserName = p1.UserName;
        this.Password = p1.Password;
        this.MembershipStatus = p1.MembershipStatus;
    }

    void setPID(int PID){
        this.PID = PID;
    }
    int getPID(){
        return this.PID;
    }

    void setPName(String PName){
        this.PName = PName;
    }
    String getPName(){
        return this.PName;
    }
    void setUserName(String UserName){
        this.UserName = UserName;
    }
    String getUserName(){
        return this.UserName;
    }
    void setPassword(String Password){
        this.Password = Password;
    }
    String getPassword(){
        return this.Password;
    }
    void setAmount(int Amount){
        this.Amount = Amount;
    }
    int getAmount(){
        return this.Amount;
    }
    void setMembershipStatus(String MembershipStatus){
        this.MembershipStatus = MembershipStatus;
    }
    String getMembershipStatus(){
        return this.MembershipStatus;
    }
    void setPType(String PType){
        this.PType = PType;
    }
    String getPType(){
        return this.PType;
    }
    void AddBook(int Bid){
        BookList.add(Bid);
    }
    void removeBook(int Bid){
        BookList.remove(Bid);
    }
    ArrayList<Integer> getBookList(){
        return this.BookList;
    }
    static class PatreonBuilder{
        private int PID;
        private String PName;
        private String UserName;
        private String Password;
        private int Amount;
        ArrayList<Integer> BookList= new ArrayList<Integer>();
        private String MembershipStatus;
        private String PType;

        PatreonBuilder setPID(int PID){
            this.PID = PID;
            return this;
        }
        PatreonBuilder setPName(String PName){
            this.PName = PName;
            return  this;
        }
        PatreonBuilder setPassword(String Password){
            this.Password = Password;
            return this;
        }
        PatreonBuilder setUserName(String UserName){
            this.UserName = UserName;
            return this;
        }
        PatreonBuilder setMembershipStatus(String MembershipStatus){
            this.MembershipStatus = MembershipStatus;
            return this;
        }
        PatreonBuilder setPType(String Ptype){
            this.PType = Ptype;
            return this;
        }
        Patreon Build(){
            return new Patreon(this);
        }
    }

}
