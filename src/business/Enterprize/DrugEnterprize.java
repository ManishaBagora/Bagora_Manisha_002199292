/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprize;



import business.Role.Drugrole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Manisha Bagora
 */
public class DrugEnterprize extends Enterprize{

    public DrugEnterprize() {
        super(Enterprize.Type.Drug.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Drugrole());
        return roles;
    }
     
   
    
    
}
