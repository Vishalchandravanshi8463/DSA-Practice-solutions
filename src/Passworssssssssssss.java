
import java.util.Base64;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal chandravanshi 
 */
public class Passworssssssssssss {
    
    
    private String loginId;
     private String password;
      private String userType;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
      
    
    public static void main(String[] args) {
        Base64.Encoder en=Base64.getEncoder();
        String pwd="vishal";
        byte[]arr=pwd.getBytes();
        String pwdenc=en.encodeToString(arr);
        System.out.println(pwdenc);
    }
    
    
}
