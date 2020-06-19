/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystemClassLibrary;
import java.util.ArrayList;
/**
 *  The System with all users
 * @author Theo
 */
public class Person_System {
    //array list for all users
    private ArrayList<Person> Users = new ArrayList();
    
    /**
     *  setting the Strategy Pattern
     */
    public StrategyObserver observer = new StrategyObserver();
    
    
    private static Person_System instance; // Person_System instance to get a single instance "Singleton Pattern"
    
    //Private Constructor only once can be created
    private Person_System(){
        
    }
    
    //Get the current Instance of the class

    /**
      * Accessor to retrieve the Users current instance
     * @return - A new null instance of Users class
     */
        public static Person_System getInstance()
    {
        if(instance == null)//If is the firstTime is going to create the new Class instance
        { 
            instance = new Person_System();
        }
        
        return instance;
    }
    
    /**
     *
     * @param person
     * @return
     */
    public Boolean Register(Person person) {    
        Boolean bln = false;
        
        if(null != person)//Check If is Valid
        {
            if(!this.Users.contains(person))//Check if is allready exist in ArrayList
            {
                bln = this.Users.add(person);//Add the new User in arraylist
                observer.update();  // call the strategy patter to update
            }
        }
        
        return bln;
    }
    
    /**
     *  Deleting a user from the system
     * @param person
     * @return
     */
    public Boolean Delete(Person person) {
        Boolean bln = false;
        
        if ( null != person)
        {
            if(null != Users && this.Users.size() > 0)
            {
                bln = this.Users.remove(person);//Remove User from our Array List
                observer.update();  //Calling the Strategy again
            }
        }
        return bln;
    }
    
    /**
     *
     * @return the array list with all the Users
     */
    public ArrayList<Person> getUser() {
        return Users;
    }
    
    /**
     *
     * @return  The array list of the doctors only
     */
    public ArrayList<Person> getDoctor(){
        
        ArrayList<Person> doctorArrayList = new ArrayList();
        
        for (int i = 0; i < Users.size(); i++) {
            
            if (Users.get(i).person == personType.Doctor) {
                doctorArrayList.add(Users.get(i));  //adds the found user with the doctor type into the patient list
            }
        }
        
        return doctorArrayList;
    }
    
    /**
     *
     * @return  The array list of the Patients only
     */
    public ArrayList<Person> getPatient() {
        
         ArrayList<Person> patientArrayList = new ArrayList();
        
        for (int i = 0; i < Users.size(); i++) {
            
            if (Users.get(i).person == personType.Patient) {
                patientArrayList.add(Users.get(i)); //adds the found user with the patient type into the patient list
            }
        }
        
        return patientArrayList;
    }
    
    /**
     *
     * @return the array list with the secretaries only
     */
    public ArrayList<Person> getSecretary() {
         ArrayList<Person> secretaryArrayList = new ArrayList();
        
        for (int i = 0; i < Users.size(); i++) {
            
            if (Users.get(i).person == personType.Patient) {
                secretaryArrayList.add(Users.get(i)); //adds the found user with the Secretary type into the patient list
            }
        }
        
        return secretaryArrayList;
    }
    
    /**
     *
     * @return the array list with the admins only
     */
    public ArrayList<Person> getAdministrator() {
         ArrayList<Person> administratorArrayList = new ArrayList();
        
        for (int i = 0; i < Users.size(); i++) {
            
            if (Users.get(i).person == personType.Patient) {
                administratorArrayList.add(Users.get(i));   //adds the found user with the Admin type into the patient list
            }
        }
        
        return administratorArrayList;
    }
}
