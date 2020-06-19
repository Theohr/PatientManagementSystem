/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystemClassLibrary;

import Utilities.IObserver;
import Utilities.ISubject;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Theo
 */
public class StrategyObserver  implements ISubject, IObserver, Serializable {
    
    private transient ArrayList<IObserver> observers = null;//transient because we don want it to be save

    /**
     *
     */
    public StrategyObserver(){
    }
    
    
    @Override
    public Boolean registerObserver(IObserver o) {
        Boolean blnAdded = false;                   
        //Validate that observer exists
        if (o != null)
        {
            //If observer list not initialised create it
            if (this.observers == null)
            {
                this.observers = new ArrayList<>();
            }
            //Add the observer to the list of registered observers
            if (!this.observers.contains(o))
            {
                blnAdded = this.observers.add(o);
            }
        }
        //Return the result
        return blnAdded;
    }

    /**
     *
     * @param o
     * @return  boolean if its true to remove if it meets the criteria
     */
    @Override
    public Boolean removeObserver(IObserver o) {
        Boolean blnRemoved = false;
        //Validate we have something to remove
        if (o != null)
        {
            if (this.observers != null && this.observers.size() > 0)
            {
                blnRemoved = this.observers.remove(o);
            }
        }
        return blnRemoved;
    }

    /**
     *  notifies all the observers to update
     */
    @Override
    public void notifyObservers() {
        //Ensure we have a valid list of observers
        if (this.observers != null && this.observers.size() > 0)
        {
            //Start foreach loop
            for (IObserver currentObserver : this.observers)
            {
                //Call update on this observer
                currentObserver.update();
            }
        }
    }
    
    /**
     *
     * @return
     */
    public ArrayList<IObserver> getObservers()
    {
        ArrayList<IObserver> arlResult = new ArrayList<>();
        for (IObserver currObserver : observers)
        {
            arlResult.add(currObserver);
        }
        return arlResult;
    }

    /**
     *
     */
    @Override
    public void update() {
        this.notifyObservers();
    }
}
