/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprize;



import business.Role.HealthRole;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Manisha Bagora
 */
public class HealthEnterprize extends Enterprize{

    public HealthEnterprize() {
        super(Enterprize.Type.Health.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HealthRole());
        return roles;
    }
     
}