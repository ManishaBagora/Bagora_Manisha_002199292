/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprize;

import business.Employee.EmployeeDirectory;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Manisha Bagora
 */
public abstract class Enterprize {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int enterprizeID;
    private static int counter;
    
    public enum Type{
        AdminE("AdminE"){
//            //@Override
//            public Organization createOrganization() {
//                return new AdminOrganization();
//            }
        }, Health("Health Enterprize"){
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
             }, Inventorystock("Inventory & Stock Enterprize"){
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
        }, Drug ("Drug Enterprize"){
//            public Organization createOrganization() {
//                return new LabOrganization();
//            }
            }, Insuranceclaim ("Insurance & Claim Enterprize"){
//            public Organization createOrganization() {
//                return new LabOrganization();
//            }
        };
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
//        public Organization createOrganization(Type t) {
//            return t.createOrganization();
//        }
    }

    public Enterprize(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        int enterprizeID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getEnterprizeID() {
        return enterprizeID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
