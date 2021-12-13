/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.InsurancecompanyRole;
import business.Role.LabAssistantRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Manisha Bagora
 */
public class InsurancecompanyOrganization extends Organization{

    public InsurancecompanyOrganization() {
        super(Organization.Type.Insurancecompany.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InsurancecompanyRole());
        return roles;
    }
     
   
    
    
}
