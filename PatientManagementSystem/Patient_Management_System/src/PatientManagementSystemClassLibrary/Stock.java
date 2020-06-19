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
public class Stock {
        //Creating the array list which every medicine will be saved in
        ArrayList<String> Medicines = new ArrayList<String>();
    
    /**
     *  Calling the Strategy Pattern
     */
    public StrategyObserver observer = new StrategyObserver();
        
    /**
     * If the medicine is not in the medicine list is added and then the strategy pattern gets called and updates the list
     * @param medicine
     * @return  the boolean value 
     */
    public Boolean AddMedicine(String medicine) {    
            Boolean bln = false;
            
            if(null != medicine)//Check If is Valid
            {
                if(!this.Medicines.contains(medicine))
                {
                    bln = this.Medicines.add(medicine); // adds medicine
                    observer.update();          //calls pattern
                }
            }

            return bln;
        }

    /**
     *  Deletes the medicine and calls the pattern to update the list 
     * @param medicine
     * @return  the boolean value 
     */
    public Boolean DeleteMedicine(String medicine) {
            Boolean bln = false;

            if ( null != medicine)
            {
                if(null != Medicines && this.Medicines.size() > 0)
                {
                    bln = this.Medicines.remove(medicine);      //medicine deleted from the list
                    observer.update();              // refreshes the list
                }
            }
            return bln;
        }

    /**
     *  
     * @return  the array list of medicines
     */
    public ArrayList<String> getUser() {
            return Medicines;
        }
    
}
