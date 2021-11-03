package buisness.Person;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author Manisha Bagora
 */

    
public class VitalSigns {
    private double bloodPressure;
    private LocalDateTime time;
    private VitalSigns vital;

    public VitalSigns getVital() {
        return vital;
    }

    public void setVital(VitalSigns vital) {
        this.vital = vital;
    }
    
    

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    
    
    
    

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
 

   
    
    public VitalSigns getVitalSigns() {
        VitalSigns vitalSign = new VitalSigns();
        
        Scanner bloodPressure = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the patient's systolic blood pressure");
        try {
          float currentBp = Float.parseFloat(bloodPressure.nextLine());  // Read user input
           vitalSign.setBloodPressure(currentBp);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid Input");
            //not a number
        }
        
        vitalSign.setTime(LocalDateTime.now());
        vitalSign.setVital(vitalSign);
        return vitalSign;
    }
}


