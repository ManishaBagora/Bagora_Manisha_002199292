/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.DoctorRole;
import business.Role.InsuranceclaimdepartmentRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Manisha Bagora
 */
public class InsuranceclaimOrganization extends Organization{

    public InsuranceclaimOrganization() {
        super(Organization.Type.Insuranceclaimdepartment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InsuranceclaimdepartmentRole());
        return roles;
    }
     
}