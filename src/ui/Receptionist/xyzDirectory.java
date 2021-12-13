/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Receptionist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manisha Bagora
 */
public class xyzDirectory {

    private List<xyz> xyzList;

    public xyzDirectory() {
        xyzList = new ArrayList<xyz>();
    }

    public List<xyz> getxyzlist() {
        return xyzList;
    }

    public xyz addxyz() {
        xyz newxyz = new xyz();
        xyzList.add(newxyz);
        return newxyz;
    }

    

    
}
