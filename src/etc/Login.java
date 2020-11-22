
package etc;

public class Login {
    private String user ="user001";
    private int password=12345678;
    
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
