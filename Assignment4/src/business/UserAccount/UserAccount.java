/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import buisness.Person.Person;
import buisnesswq.WorkQueue;
import business.role.Role;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Person person;
    private String systolicbp;
    private String diastolicbp;
     private String status;
    private Role role;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private WorkQueue workQueue;

    public String getSystolicbp() {
        return systolicbp;
    }

    public void setSystolicbp(String systolicbp) {
        this.systolicbp = systolicbp;
    }

    public String getDiastolicbp() {
        return diastolicbp;
    }

    public void setDiastolicbp(String diastolicbp) {
        this.diastolicbp = diastolicbp;
    }

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}