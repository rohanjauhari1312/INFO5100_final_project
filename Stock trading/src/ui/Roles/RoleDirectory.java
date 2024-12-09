/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Roles;

import java.util.ArrayList;
import model.Person;
import ui.Admin.Admin;
/**
 *
 * @author hardishah
 */
public class RoleDirectory {
    
      ArrayList<Role> roleDirectory ;
      public RoleDirectory ( ){
          
       roleDirectory = new ArrayList();

    }
      public ArrayList<Role> getRoles(){
          return roleDirectory;
      }
      public void remove(Role r){
          roleDirectory.remove(r);
      }
    public void newRole(Role o) {

        roleDirectory.add(o);
    }

    public Role findRole(String id) {

        for (Role o : roleDirectory) {

            if (o.isMatch(id)) {
                return o;
            }
        }
            return null; //not found after going through the whole list
         }

    public void selfDelete(Role o) {
        roleDirectory.remove(o);
    }
    
}
