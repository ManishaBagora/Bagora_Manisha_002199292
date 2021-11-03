/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import buisness.Person.Person;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password,String diastolicbp,String systolicbp,Person person, Role role,String status){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setDiastolicbp(diastolicbp);
        userAccount.setSystolicbp(systolicbp);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccount.setStatus(status);
        userAccountList.add(userAccount);
        return userAccount;
    }
}
