/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Community;


import business.role.BrooklineRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class BrooklineCommunity extends Community{

    public BrooklineCommunity() {
        super(Community.Type.Brookline.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BrooklineRole());
        return roles;
    }
     
}