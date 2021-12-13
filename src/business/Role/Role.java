/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Manisha Bagora
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        AdminE("AdminE"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        Health("Health Enterprize"),
        Drug("Drug Enterprize"),
        Inventoryandstockenterprize("Inventory & Stock Enterprize"),
        Pharmacy("Pharmacy"),
        MR("MR"),
        Receptionist("Receptionist"),
        Patient("Patient"),
        Consultant("Consultant"),
        Stockmanager("Stockmanager"),
        Supplier("Supplier"),
        Insuranceandclaimorganization("Insuranceandclaimorganization"),
        InsurancecompanyOrganization("InsurancecompanyOrganization"),
        Insuranceandclaimenterprize("Insurance & Claim Enterprize");

        public static RoleType getHealth() {
            return Health;
        }

        public static RoleType getDrug() {
            return Drug;
        }

        public static RoleType getInventoryandstockenterprize() {
            return Inventoryandstockenterprize;
        }

        public static RoleType getPatient() {
            return Patient;
        }

        public static RoleType getConsultant() {
            return Consultant;
        }

        public static RoleType getStockmanager() {
            return Stockmanager;
        }

        public static RoleType getSupplier() {
            return Supplier;
        }

        public static RoleType getInsuranceandclaimorganization() {
            return Insuranceandclaimorganization;
        }

        public static RoleType getInsurancecompanyOrganization() {
            return InsurancecompanyOrganization;
        }

        public static RoleType getInsuranceandclaimenterprize() {
            return Insuranceandclaimenterprize;
        }

       

        public static RoleType getAdminE() {
            return AdminE;
        }

       

        public static RoleType getPharmacy() {
            return Pharmacy;
        }

        public static RoleType getReceptionist() {
            return Receptionist;
        }

        public static RoleType getMR() {
            return MR;
        }
        

       
        public void setValue(String value) {
            this.value = value;
        }

        private String value;

        public static RoleType getAdmin() {
            return Admin;
        }

        public static RoleType getDoctor() {
            return Doctor;
        }

        public static RoleType getLabAssistant() {
            return LabAssistant;
        }

        
        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public RoleType type;

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business);

    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }

}
