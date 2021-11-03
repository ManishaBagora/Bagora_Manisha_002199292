/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Community;


import business.Community.Community.Type;
import java.util.ArrayList;

public class CommunityDirectory {
    
    private ArrayList<Community> communityList;

    public CommunityDirectory() {
        communityList = new ArrayList<>();
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }
    
    public Community createCommunity(Type type){
        Community community = null;
        if (type.getValue().equals(Type.Brookline.getValue())){
            community = new BrooklineCommunity();
            communityList.add(community);
        }
        else if (type.getValue().equals(Type.Indiian.getValue())){
            community = new IndiianCommunity();
            communityList.add(community);
        }
        return community;
    }
}