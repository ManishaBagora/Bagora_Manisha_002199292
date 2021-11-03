/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Community.CommunityDirectory;



/**
 *
 * @author Administrator
 */
public class Business {

    private static Business business;
    private CommunityDirectory communityDirectory;

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    private Business() {
        communityDirectory = new CommunityDirectory();
    }

    public CommunityDirectory getCommunityDirectory() {
        return communityDirectory;
    }
}
