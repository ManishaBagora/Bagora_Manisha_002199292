/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Community;

import buisness.Person.PersonDirectory;
import buisnesswq.WorkQueue;
import business.Patient.PatientDirectory;
import business.UserAccount.UserAccountDirectory;
import business.role.Role;
import java.util.ArrayList;


public abstract class Community {
   private String name;
    private WorkQueue workQueue;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int communityID;
    private static int counter;
    private PatientDirectory patientDirectory;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Community.counter = counter;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    public enum Type{
        Admin("Admin Community") {
//            //@Override
//            public Organization createOrganization() {
//                return new AdminOrganization();
//            }
        }, Brookline("Brookline Community"){
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
        }, Indiian("Indiian Community"){
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

    public Community (String name) {
        this.name = name;
        workQueue = new WorkQueue();
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        communityID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getCommunityID() {
        return communityID;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
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
