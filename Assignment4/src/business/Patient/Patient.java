/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Patient;

import buisness.Person.*;

public class Patient {
    
    private String name;
    private String city;
    private String mobilenumber;
    private String Systolibp;
    private String Diastolicbp;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSystolibp() {
        return Systolibp;
    }

    public void setSystolibp(String Systolibp) {
        this.Systolibp = Systolibp;
    }

    public String getDiastolicbp() {
        return Diastolicbp;
    }

    public void setDiastolicbp(String Diastolicbp) {
        this.Diastolicbp = Diastolicbp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Patient.count = count;
    }
    private int id;
    private static int count = 1;

    public Patient() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
