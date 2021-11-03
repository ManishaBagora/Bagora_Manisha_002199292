/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Community;


import business.role.IndiianRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class IndiianCommunity extends Community{

    public IndiianCommunity() {
        super(Community.Type.Indiian.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new IndiianRole());
        return roles;
    }
     
   
    
    
}
