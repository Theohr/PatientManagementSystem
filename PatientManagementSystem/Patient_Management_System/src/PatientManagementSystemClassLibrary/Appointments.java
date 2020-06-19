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
public class Appointments {
    String Date;
    int Time;
    
    /**
     * Constructor
     */
    public Appointments() {
        
    }
    
    /**
     * Constructor
     * @param date
     * @param time
     */
    public Appointments(String date, int time) {
        
        setDate(date);
        setTime(time);
    }

    /**
     *
     * @return the date of the appointment
     */
    public String getDate() {
        return Date;
    }

    /**
     * Sets the date
     * @param Date
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     *
     * @return time 
     */
    public int getTime() {
        return Time;
    }

    /**
     * Sets the time
     * @param Time
     */
    public void setTime(int Time) {
        this.Time = Time;
    }
    
    
}
