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
public class Patient extends Person{
    //Id of the patient
    static int IDnum = 0;
    
    /**
     *  the empty constructor
     */
    public Patient() {
        super();
       
        this.setID("P" + String.format("%04d", ++IDnum));   //generates their id
        
        this.person = personType.Patient;       //this person is patient
 
    }
    
    /**
     *  the parameter constructor
     * @param name
     * @param surname
     * @param address
     * @param age
     * @param gender
     * @param password
     * @param id
     */
    public Patient( String name, String surname, String address, int age, String gender, String password, String id) {
        super(name, surname, address, age, gender, password);   //gets the values from super class Person except pass and id which will be generated here
        
        this.setID("P" + String.format("%04d", ++IDnum));
               
        this.person = personType.Patient;     
    }
}
