/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystemClassLibrary;

import java.util.ArrayList;

/**
 *
 * @author Theo
 */
public class Administrator extends Person {

    static int IDnum = 0;
    
    /**
     *  Class administrator constructor printing the id of the administrator
     */
    public Administrator() {
        super();
        
        this.setID("A" + String.format("%04d", ++IDnum));
        
        this.person = personType.Administrator;
    }
        
    /**
     *
     * @param name
     * @param surname
     * @param address
     * @param age
     * @param gender
     * @param id
     * @param password
     * the constructor with each field inside
     */
    public Administrator(String name, String surname, String address, int age, String gender, String id, String password) {
        super(name, surname, address, age, gender, password);
        
        this.setID("A" + String.format("%04d", ++IDnum));
        
        this.person = personType.Administrator;
    }
}
