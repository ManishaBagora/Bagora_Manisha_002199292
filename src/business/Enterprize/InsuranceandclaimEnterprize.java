/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprize;



import business.Role.InsuranceandclaimEnterprizeRole;


import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Manisha Bagora
 */
public class InsuranceandclaimEnterprize extends Enterprize{

    public InsuranceandclaimEnterprize() {
        super(Enterprize.Type.Insuranceclaim.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InsuranceandclaimEnterprizeRole());
        return roles;
    }
     
}