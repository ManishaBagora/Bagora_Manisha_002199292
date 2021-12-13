/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;


import business.Role.ReceptionistRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Manisha Bagora
 */
public class ReceptionistOrganization extends Organization{

    public ReceptionistOrganization() {
        super(Organization.Type.Receptionist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ReceptionistRole());
        return roles;
    }
     
}