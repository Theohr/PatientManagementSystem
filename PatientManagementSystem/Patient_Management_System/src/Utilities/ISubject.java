/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author Theo
 */
public interface ISubject {

    /**
     *
     *Accessor to register a new Observer 
     * @param o - IObserver that is going to be add in ArrayList of Observers
     * @return - Boolean if that is added correctly
     */
    public Boolean registerObserver(IObserver o);

    /**
     *
     * Accessor to remove an Observer
     * @param o - IObserver that is going to be remove from ArrayList of Observers
     * @return - Boolean if that is removed correctly
     */
    public Boolean removeObserver(IObserver o);

    /**
     *- Is going to call the update function to notify all observers when the called
     */
    public void notifyObservers();
}
