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
public class Appointment_List {
    //creating new array list which will save the appointments
    ArrayList<String> Appointments = new ArrayList();
    
    /**
     * add the appointments in the list
     * @param appointment
     * @return
     */
    public Boolean AddAppointment(String appointment) {    
        Boolean bln = false;
        
        if(null != appointment)//Check If is Valid
        {
            if(!this.Appointments.contains(appointment))//Check if is allready exist in ArrayList
            {
                bln = this.Appointments.add(appointment);//Add the new appointment in arraylist
            }
        }
        
        return bln;
    }
    
    /**
     *
     * @param appointment
     * @return
     */
    public Boolean CancelAppointment(String appointment) {
        Boolean bln = false;
        
        if ( null != appointment)
        {
            if(null != Appointments && this.Appointments.size() > 0)
            {
                bln = this.Appointments.remove(appointment);//Remove Card from our Array List
            }
        }
        return bln;
    }
    
    /**
     *
     * @return the appointments array list
     */
    public ArrayList<String> getUser() {
        return Appointments;
    }
}
