/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystemClassLibrary;

import java.util.ArrayList;

/**
 *  Secretary is a subclass to Person
 * @author Theo
 */
public class Secretary extends Person{
    
    // declaring the id
    static int IDnum = 0;
    
    /**
     * the empty constructor
     */
    public Secretary() {
        super();        //super because it extends person so person class is the super clas 
        //generating the id for the secretary
        this.setID("S" + String.format("%04d", ++IDnum));
        this.person = personType.Secretary;
    }
    
    /**
     *  the parameters constructor
     * @param name
     * @param surname
     * @param address
     * @param age
     * @param gender
     * @param id
     * @param password
     */
    public Secretary(String name, String surname, String address, int age, String gender, String id, String password) {
        super(name, surname, address, age, gender, password);   // gets the valued from person except the id and password as those will be made here
        this.setID("S" + String.format("%04d", ++IDnum));
        this.person = personType.Secretary;
    }
    
}
