/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.Business;
import business.Community.BrooklineCommunity;
import business.Community.Community;

import business.UserAccount.UserAccount;

import javax.swing.JPanel;
import ui.adminstrative.BrooklineWorkAreaJPanel;


public class BrooklineRole extends Role {

    public BrooklineRole() {
        this.type = RoleType.Brookline;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Community community, Business business) {
        this.type = RoleType.Brookline;
        return new BrooklineWorkAreaJPanel(userProcessContainer, account, (BrooklineCommunity) community, business);
    }

}
