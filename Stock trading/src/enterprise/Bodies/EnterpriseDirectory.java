/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise.Bodies;

import java.util.ArrayList;
import model.Person;
import ui.Admin.Admin;
/**
 *
 * @author rohanjauhari
 */
public class EnterpriseDirectory {
    
      ArrayList<Enterprise> enterpriseDirectory ;
      public EnterpriseDirectory ( ){
          
       enterpriseDirectory = new ArrayList();

    }
      public ArrayList<Enterprise> getEnterprices(){
          return enterpriseDirectory;
      }
      public void remove(Enterprise p){
          enterpriseDirectory.remove(p);
      }
    public void newEnterprise(Enterprise p) {

        enterpriseDirectory.add(p);
    }

    public Enterprise findEnterPrise(String id) {

        for (Enterprise p : enterpriseDirectory) {

            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
         }

    public void selfDelete(Enterprise p) {
        enterpriseDirectory.remove(p);
    }
    
}
