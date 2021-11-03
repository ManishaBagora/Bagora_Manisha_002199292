/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Patient;

import java.util.ArrayList;


public class PatientDirectory {

    private static void remove(Patient p) {
        PatientDirectory.remove(p);
    }
    
    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    
    
    }
    public Patient createPatient(String name,String city,String mobilenumber,String Systolibp,String Diastolicbp){
        Patient patient = new Patient();
        patient.setName(name);
        patient.setCity(city);
        patient.setMobilenumber(mobilenumber); 
        patient.setDiastolicbp(Diastolicbp);
        patient.setSystolibp(Systolibp);
       
        patientList.add(patient);
        
        return patient;
    }
    public void removePatient(Patient p) {
        PatientDirectory.remove(p);
    }

}