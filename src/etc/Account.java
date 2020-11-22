
package etc;

public class Account {
    private String user ="user001";
    private int password=001001;
    
    public void Login(String CustumerUser,int CustumerPassword){
    this.user=CustumerUser;
    this.password=CustumerPassword;
    }
    public String getUser(){
    return user;
    }
    public int getPassword(){
    return password;
    }
}
