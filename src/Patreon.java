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

    Patreon (int PID,String PName,String UserName,String Password,int Amount,String MemberShipStatus){
        this.PID = PID;
        this.PName=PName;
        this.UserName=UserName;
        this.Password=Password;
        this.Amount=Amount;
        this.MembershipStatus=MemberShipStatus;

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

    Patreon cloneObj(){
        return new Patreon(PID,PName,UserName,Password,Amount,MembershipStatus);
    }


}
