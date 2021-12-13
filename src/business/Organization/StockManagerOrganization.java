/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.DoctorRole;
import business.Role.Role;
import business.Role.StockmanagerRole;
import java.util.ArrayList;

/**
 *
 * @author Manisha Bagora
 */
public class StockManagerOrganization extends Organization{

    public StockManagerOrganization() {
        super(Organization.Type.Stockmanager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new StockmanagerRole());
        return roles;
    }
     
}