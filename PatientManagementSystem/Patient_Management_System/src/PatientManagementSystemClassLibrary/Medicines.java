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
public class Medicines {
    String MedicineName;
    int Stock;
    int Quantity;
    
    /**
     * Constructor
     */
    public Medicines() {
    
    }
    
    /**
     * constructor
     * @param medicinename
     * @param stock
     * @param quantity
     */
    public Medicines(String medicinename, int stock, int quantity) {
        setMedicineName(medicinename);
        setStock(stock);
        setQuantity(quantity);
    }

    /**
     *
     * @return name of the medicine
     */
    public String getMedicineName() {
        return MedicineName;
    }

    /**
     * Sets the medicine name
     * @param Medicine
     */
    public void setMedicineName(String Medicine) {
        this.MedicineName = Medicine;
    }

    /**
     *
     * @return number in the storage
     */
    public int getStock() {
        return Stock;
    }

    /**
     * Sets the number
     * @param Stock
     */
    public void setStock(int Stock) {
        this.Stock = Stock;       
    }

    /**
     *
     * @return number the patient needs to get
     */
    public int getQuantity() {
        return Quantity;
    }

    /**
     * sets the number
     * @param Quantity
     */
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
    
}
