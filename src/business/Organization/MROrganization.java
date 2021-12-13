/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.LabAssistantRole;
import business.Role.MRRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Manisha Bagora
 */
public class MROrganization extends Organization{

    public MROrganization() {
        super(Organization.Type.MR.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MRRole());
        return roles;
    }
     
   
    
    
}
