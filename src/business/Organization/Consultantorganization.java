/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.ConsulatantRole;
import business.Role.LabAssistantRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Manisha Bagora
 */
public class Consultantorganization extends Organization{

    public Consultantorganization() {
        super(Organization.Type.Consultant.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ConsulatantRole());
        return roles;
    }
     
   
    
    
}
