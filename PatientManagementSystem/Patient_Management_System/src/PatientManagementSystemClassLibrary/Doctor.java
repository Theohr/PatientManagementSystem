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
public class Doctor extends Person {
    //id and rating for the doctor
    static int IDnum = 0;
    double rating = 0;

    /**
     * Constructor
     */
    public Doctor() {
        super();
       
        this.setID("D" + String.format("%04d", ++IDnum));
        
        this.person = personType.Doctor;
    }
    
    /**
     * Constructor
     * @param name
     * @param surname
     * @param address
     * @param age
     * @param gender
     * @param id
     * @param password
     */
    public Doctor( String name, String surname, String address, int age, String gender, String id, String password) {
        super(name, surname, address, age, gender, password);
        
        this.setID("D" + String.format("%04d", ++IDnum));
        
        this.person = personType.Doctor;
    }
     
    /**
     *
     * @return the rating of the doctor
     */
    public double getRating() {
        return rating;
    }

    /**
     * updates the rating
     * @param rating
     */
    public void updateRating(double rating) {
        this.rating = (this.rating + rating)/2;
    }
    
}
