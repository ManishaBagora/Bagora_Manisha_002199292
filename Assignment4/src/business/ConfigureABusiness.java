/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import buisness.Person.Person;
import business.Patient.Patient;
import business.Community.AdminCommunity;
import business.UserAccount.UserAccount;
import business.role.AdminRole;


public class ConfigureABusiness {
    
    public static Business configure(){
        
        Business business = Business.getInstance();
        
        AdminCommunity adminCommunity = new AdminCommunity();
        business.getCommunityDirectory().getCommunityList().add(adminCommunity);
        
        Person person = new Person();
       
        person.setName("Manisha Bagora");
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new AdminRole());
        account.setPerson(person);
        
        adminCommunity.getPersonDirectory().getPersonList().add(person);
        adminCommunity.getUserAccountDirectory().getUserAccountList().add(account);
        
        return business;
    }
    
}
