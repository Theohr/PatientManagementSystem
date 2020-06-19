/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystemClassLibrary;
/**
 *
 * @author Theo
 */
public class PersonFactory {
    /**
     *- Store all the allowed Values in the Set of allowedUserTypes
     */
    public PersonFactory() {
            
    }
  
    /**
     * The Factory pattern applied using enum also.
     * @param PersonType
     * @return
     */
    public Person createPerson(personType PersonType){
                //creates a new person according to their type
                if(PersonType == personType.Patient)
                {
                    return new Patient(); //new patient
                }
                else if(PersonType == personType.Doctor)
                {
                    return new Doctor();//new doctor
                }
                else if(PersonType == personType.Secretary)
                {
                    return new Secretary();// new secretary
                }
                else if(PersonType == personType.Administrator)
                {
                    return new Administrator();//new admin
                }            
                else
                {          
                    return null;
                    
                }   
    }
}
