/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Admin;

import java.util.ArrayList;
import model.Person;
import ui.Admin.Admin;
/**
 *
 * @author rohanjauhari
 */
public class PersonDirectory {
    
      ArrayList<Person> personlist ;
      PasswordDirectory pd;
      public PersonDirectory (PasswordDirectory passwords){
          pd=passwords;
          
       personlist = new ArrayList();

    }
      public ArrayList<Person> getPersons(){
          return personlist;
      }
      protected void remove(Person p){
          personlist.remove(p);
      }
    public void newPerson(Person p) {

        personlist.add(p);
    }

    public Person findPerson(String id) {

        for (Person p : personlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
         }

    public void selfDelete(Person p) {
        personlist.remove(p);
        pd.remove(p.getUsername());
    }
    
}
