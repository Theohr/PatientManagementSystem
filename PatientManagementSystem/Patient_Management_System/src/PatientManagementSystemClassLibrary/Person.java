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
public abstract class Person {
    String UniqueID;
    String Name;
    String Surname;
    String Address;
    int Age;
    String Gender;
    String Password;

    /**
     *  
     */
    public personType person;
    
    /**
     *  The empty person constructor
     */
    public Person() {
        
    }
    
    /**
     *  The parameter constructor
     * @param name
     * @param surname
     * @param address
     * @param age
     * @param gender
     * @param password
     */
    public Person(String name, String surname, String address, int age, String gender, String password) {
        
        setName(name);
        setSurname(surname);
        setAddress(address);
        setAge(age);
        setGender(gender);
        setPassword(password);
    }

    /**
     *
     * @return Name of the User
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the name by passing through some validations
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
        
        if (Name == null && !Name.contains("[a-zA-Z]+")) {
            System.out.println("Something went wrong. Please fill your name correctly.");
        }
    }

    /**
     *
     * @return Surname
     */
    public String getSurname() {
        return Surname;
    }

    /**
     *Sets the surname by passing through some validations
     * @param Surname
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
        
        if (Surname == null && !Surname.contains("[a-zA-Z]+")) {
            System.out.println("Something went wrong. Please fill your surname correctly.");
        }
    }

    /**
     *
     * @return Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     *Sets the address by passing through some validations
     * @param Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
        
        if (Address == null) {
            System.out.println("Something went wrong. Please fill your Address correctly.");
        }
    }

    /**
     *
     * @return the uniqueID of each user
     */
    public String getID(){
        return this.UniqueID;
    }

    /**
     *Sets the id 
     * @param ID
     */
    public void setID(String ID){
        this.UniqueID = ID;
    }

    /**
     *
     * @return the age
     */
    public int getAge() {
        return Age;
    }

    /**
     * Sets the age by passing through some validations
     * @param Age
     */
    public void setAge(int Age) {
        this.Age = Age;
        
        if (Age > 125) {
            System.out.println("Something went wrong. Please fill your Age correctly");
        }
    }

    /**
     *
     * @return gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * Gets the gender by passing through some validations
     * @param Gender
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
        
        if (Gender == null) {
            System.out.println("Something went wrong. Please fill your Gender correctly");
        }
    }    

    /**
     *
     * @return password
     */
    public String getPassword(){
        return Password;
    }
    
    /**
     * Sets the password each user will have passing through some criteria
     * @param Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
        
        String upperCaseChars = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        
        if (Password.length() < 6) {
            System.out.println("Your password cannot have less than 6 characters.");
        }
        else if (Password.matches(upperCaseChars)){
            System.out.println("Your password should contain atleast a capital letter.");
        }
        else if (Password.matches(numbers)) {
            System.out.println("Your password should contain atleast a number");

        }
    }

    /**
     *
     * @return the person according to their type
     */
    public personType getpersonType() {    
        return person;
    }
}
