/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;


import business.Organization.OrganizationDirectory;
import business.Enterprize.EnterprizeDirectory;
/**
 *
 * @author Manisha Bagora
 */
public class Business {

    private static Business business;
    private OrganizationDirectory organizationDirectory;
    private EnterprizeDirectory enterprizeDirectory;

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    private Business() {
        organizationDirectory = new OrganizationDirectory();
       enterprizeDirectory = new EnterprizeDirectory();
    }
    

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    public EnterprizeDirectory getenterprizeDirectory(){
        return enterprizeDirectory;
    }
}
