/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Employee.Employee;
import business.Enterprize.AdminEnterprize;



import business.Organization.AdminOrganization;
import business.Role.AdminRole;
import business.UserAccount.UserAccount;
import business.Enterprize.EnterprizeDirectory;

/**
 *
 * @author Manisha Bagora
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        
        Business business = Business.getInstance();
        
        AdminOrganization adminOrganization = new AdminOrganization();
        AdminEnterprize adminEnterprize = new AdminEnterprize();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
      
        
        Employee employee = new Employee();
        employee.setName("Manisha Bagora");
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new AdminRole());
        account.setEmployee(employee);
        
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
       
        return business;
    }
    
    
}
