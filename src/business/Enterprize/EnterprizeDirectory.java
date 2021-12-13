/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprize;




import business.Enterprize.Enterprize.Type;

import java.util.ArrayList;

/**
 *
 * @author Manisha Bagora
 */
public class EnterprizeDirectory {
    
    private ArrayList<Enterprize> enterprizeList;

    public EnterprizeDirectory() {
        enterprizeList = new ArrayList<>();
    }

    public ArrayList<Enterprize> getenterprizeList() {
        return enterprizeList;
    }
    
    public Enterprize createEnterprize(Type type){
        Enterprize enterprize = null;
        if (type.getValue().equals(Type.Health.getValue())){
            enterprize = new HealthEnterprize();
            enterprizeList.add(enterprize);
        }
        else if (type.getValue().equals(Type.Drug.getValue())){
            enterprize = new DrugEnterprize();
            enterprizeList.add(enterprize);
        }
        else if (type.getValue().equals(Type.Insuranceclaim.getValue())){
            enterprize = new InsuranceandclaimEnterprize();
            enterprizeList.add(enterprize);
        }
          
        else if (type.getValue().equals(Type.Inventorystock.getValue())){
            enterprize = new Inventoryandstock();
            enterprizeList.add(enterprize);
        }
        return enterprize;
    }
}