package ui.Receptionist;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manisha Bagora
 */
public class Patient {
    private int Appointmentnumber ;
    private String Patientname;
    private int age;
    private int Mobilenumber;
    private String Vitalsign;
    private String Address;

    public int getAppointmentnumber() {
        return Appointmentnumber;
    }

    public void setAppointmentnumber(int Appointmentnumber) {
        this.Appointmentnumber = Appointmentnumber;
    }

    public String getPatientname() {
        return Patientname;
    }

    public void setPatientname(String Patientname) {
        this.Patientname = Patientname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMobilenumber() {
        return Mobilenumber;
    }

    public void setMobilenumber(int Mobilenumber) {
        this.Mobilenumber = Mobilenumber;
    }

    public String getVitalsign() {
        return Vitalsign;
    }

    public void setVitalsign(String Vitalsign) {
        this.Vitalsign = Vitalsign;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
   

}
