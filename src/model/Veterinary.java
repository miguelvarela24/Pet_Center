
package model;

/**
 * Class Veterinary
 */
public class Veterinary {
    
    public int id_card_number;
    public String name, lastname, RUT;
    public StatusVet status;
    
    /**
     * Method Construtor of Veteranary
     * @param id_card_number
     * @param name
     * @param lastname
     * @param RUT
     * @param status 
     */
    public Veterinary(int id_card_number, String name, String lastname, String RUT, StatusVet status) {
        this.id_card_number = id_card_number;
        this.name = name;
        this.lastname = lastname;
        this.RUT = RUT;
        this.status = status;
    }
    
    /**
     * Get the identification Vet
     * @return id_card_number
     */
    public int getId_card_number() {
        return id_card_number;
    }
    
    /**
     * Set up the identification Vet
     * @param id_card_number 
     */
    public void setId_card_number(int id_card_number) {
        this.id_card_number = id_card_number;
    }
    /**
     * Get the Name Vet
     * @return 
     */
    public String getName() {
        return name;
    }
    /**
     * Set up the Name Vet
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Get the LastName Vet
     * @return lastname
     */
    public String getLastname() {
        return lastname;
    }
    /**
     * Set up the Lastname Vet
     * @param lastname 
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    /**
     * Get the RUT Vet
     * @return RUT
     */
    public String getRUT() {
        return RUT;
    }
    /**
     * Set up the RUT Vet
     * @param RUT 
     */
    public void setRUT(String RUT) {
        this.RUT = RUT;
    }
    /**
     * Get the status Vet
     * @return status
     */
    public StatusVet getStatus() {
        return status;
    }
    /**
     * Set up the Status Vet
     * @param status 
     */
    public void setStatus(StatusVet status) {
        this.status = status;
    }

    
   
    
}
