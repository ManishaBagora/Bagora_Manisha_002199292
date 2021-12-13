/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.LabAssistantRole;
import business.Role.Role;
import business.Role.SupplierRole;
import java.util.ArrayList;

/**
 *
 * @author Manisha Bagora
 */
public class SupplierOrganization extends Organization{

    public SupplierOrganization() {
        super(Organization.Type.Supplier.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierRole());
        return roles;
    }
     
   
    
    
}
