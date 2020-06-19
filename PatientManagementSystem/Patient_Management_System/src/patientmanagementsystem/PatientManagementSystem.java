/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import PatientManagementSystemClassLibrary.Administrator;
import PatientManagementSystemClassLibrary.Doctor;
import PatientManagementSystemClassLibrary.Medicines;
import PatientManagementSystemClassLibrary.Patient;
import PatientManagementSystemClassLibrary.Person;
import PatientManagementSystemClassLibrary.Person_System;
import PatientManagementSystemClassLibrary.Secretary;
import java.util.ArrayList;


/**
 *
 * @author Theo
 */
public class PatientManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrator admin = new Administrator();
        admin.setName("Admin");
        admin.setSurname("One");
        admin.setAddress("Portland Square 23, PL4 AE5");
        admin.setAge(45);
        admin.setGender("Male");
        
        Doctor doctor1 = new Doctor();
        doctor1.setName("Doctor");
        doctor1.setSurname("One");
        doctor1.setAddress("Portland Square 23, PL4 AE5");
        doctor1.setAge(43);
        doctor1.setGender("Male");
        
        Doctor doctor2 = new Doctor();
        doctor2.setName("Doctor");
        doctor2.setSurname("Two");
        doctor2.setAddress("Portland Square 23, PL4 AE5");
        doctor2.setAge(37);
        doctor2.setGender("Female");
        
        Doctor doctor3 = new Doctor();
        doctor3.setName("Doctor");
        doctor3.setSurname("three");
        doctor3.setAddress("Portland Square 23, PL4 AE5");
        doctor3.setAge(52);
        doctor3.setGender("Male");
        
        Patient patient1 = new Patient();
        patient1.setName("Patient");
        patient1.setSurname("One");
        patient1.setAddress("Portland Square 23, PL4 AE5");
        patient1.setAge(43);
        patient1.setGender("Male");
        
        Patient patient2 = new Patient();
        patient2.setName("Patient");
        patient2.setSurname("Two");
        patient2.setAddress("Portland Square 23, PL4 AE5");
        patient2.setAge(46);
        patient2.setGender("Female");
        
        Patient patient3 = new Patient();
        patient3.setName("Patient");
        patient3.setSurname("Three");
        patient3.setAddress("Portland Square 23, PL4 AE5");
        patient3.setAge(43);
        patient3.setGender("Male");
        
        Secretary secretary = new Secretary();
        secretary.setName("Secretary");
        secretary.setSurname("One");
        secretary.setAddress("Portland Square 23, PL4 AE5");
        secretary.setAge(25);
        secretary.setGender("Female");
        
        Medicines Fentanyl = new Medicines();
        Fentanyl.setMedicineName("Fentanyl");
        Fentanyl.setStock(50);
        
        Medicines Demerol = new Medicines();
        Demerol.setMedicineName("Demerol");
        Demerol.setStock(75);
        
        Medicines Paracetamol = new Medicines();
        Paracetamol.setMedicineName("Paracetamol");
        Paracetamol.setStock(100);
        
        Medicines Ibuprofen = new Medicines();
        Ibuprofen.setMedicineName("Ibuprofen");
        Ibuprofen.setStock(100);
        
        Medicines Aspirin = new Medicines();
        Aspirin.setMedicineName("Aspirin");
        Aspirin.setStock(100);
        
        Medicines Codeine = new Medicines();
        Codeine.setMedicineName("Codeine");
        Codeine.setStock(100);
        
        Medicines Morphine = new Medicines();
        Morphine.setMedicineName("Morphine");
        Morphine.setStock(100);
        
        Medicines Percocet = new Medicines();
        Percocet.setMedicineName("Percocet");
        Percocet.setStock(100);
        
        Medicines Hydrocodone = new Medicines();
        Hydrocodone.setMedicineName("Hydrocodone");
        Hydrocodone.setStock(100);
        
        Medicines Soluble = new Medicines();
        Soluble.setMedicineName("Soluble painkillers");
        Soluble.setStock(100);
        
        Person_System personSystem = Person_System.getInstance();
        
        personSystem.Register(doctor1);
      

    }
    
}
