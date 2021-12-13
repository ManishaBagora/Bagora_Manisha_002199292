package ui.Receptionist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manisha Bagora
 */
public class PatientCatalog {

    private List<Patient> patientCatalog;

    public PatientCatalog() {
        patientCatalog = new ArrayList<Patient>();
    }

    public List<Patient> getPatientcatalog() {
        return patientCatalog;
    }

    public Patient addPatient() {
        Patient p = new Patient();
        patientCatalog.add(p);
        return p;
    }

    public void removePatient(Patient p) {
        patientCatalog.remove(p);
    }

    public Patient searchPatient(int id) {
        for (Patient patient : patientCatalog) {
            if (patient.getAppointmentnumber()== id) {
                return patient;
            }
        }
        return null;
    }
}
