/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprize;




import business.Role.InventorystockenterprizeRole;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Manisha Bagora
 */
public class Inventoryandstock extends Enterprize{

    public Inventoryandstock() {
        super(Enterprize.Type.Inventorystock.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InventorystockenterprizeRole());
        return roles;
    }
     
}