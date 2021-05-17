
package model;

/**
 * 
 * Class Owner of the Pet
 */
public class Owner {
    public int id_card, cell_phone_number;
    public String name,direction;
    
    /**
     * Method Construtor of Owner
     * @param id_card
     * @param cell_phone_number
     * @param name
     * @param direction 
     */
    public Owner(int id_card, int cell_phone_number, String name, String direction) {
        this.id_card = id_card;
        this.cell_phone_number = cell_phone_number;
        this.name = name;
        this.direction = direction;
    }
    
    /**
     * Get the identification Owner
     * @return id_card
     */
    public int getId_card() {
        return id_card;
    }
    /**
     * Set up the identification Owner
     * @param id_card 
     */
    public void setId_card(int id_card) {
        this.id_card = id_card;
    }
    /**
     * Get the Cellphone Nmber Owner
     * @return cell_phone_number
     */
    public int getCell_phone_number() {
        return cell_phone_number;
    }
    /**
     * Set up the Cellphone Nmber Owner
     * @param cell_phone_number 
     */
    public void setCell_phone_number(int cell_phone_number) {
        this.cell_phone_number = cell_phone_number;
    }
    /**
     * Get the Name Owner
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Set up the Name Owner
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Get the Direction Owner
     * @return direction
     */
    public String getDirection() {
        return direction;
    }
    /**
     * Set up the Direction Owner
     * @param direction 
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }
    
    
}
