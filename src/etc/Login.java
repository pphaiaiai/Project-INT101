
package etc;

public class Login {
    private String user ="user001";
    private String password="12345678";
    
    public void Login(String CustumerUser,String CustumerPassword){
    this.user=CustumerUser;
    this.password=CustumerPassword;
    }
    public String getUser(){
    return user;
    }
    public String getPassword(){
    return password;
    }
}
