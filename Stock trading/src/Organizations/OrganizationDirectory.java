/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organizations;

import java.util.ArrayList;
import model.Person;
import ui.Admin.Admin;
/**
 *
 * @author tejasvenkatesh
 */
public class OrganizationDirectory {
    
      ArrayList<Organization> organizationDirectory ;
      public OrganizationDirectory ( ){
          
       organizationDirectory = new ArrayList();

    }
      public ArrayList<Organization> getOrganizations(){
          return organizationDirectory;
      }
      protected void remove(Organization o){
          organizationDirectory.remove(o);
      }
    public void newOrganization(Organization o) {

        organizationDirectory.add(o);
    }

    public Organization findOrganizatino(String id) {

        for (Organization o : organizationDirectory) {

            if (o.isMatch(id)) {
                return o;
            }
        }
            return null; //not found after going through the whole list
         }

    public void selfDelete(Organization o) {
        organizationDirectory.remove(o);
    }
    
}
