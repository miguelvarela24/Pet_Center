
package model;

/**
 * 
 * Class ConsultPetVet
 */
public class ConsultPetVet {
    public int id_card_vet;
    public String namePet;
    public int posSaveListPet, posSaveListVet;
    
    /**
     * Method Construtor of ConsultPetVet 
     * @param id_card_vet
     * @param namePet
     * @param posSaveListPet
     * @param posSaveListVet 
     */
    public ConsultPetVet(int id_card_vet, String namePet, int posSaveListPet, int posSaveListVet) {
        this.id_card_vet = id_card_vet;
        this.namePet = namePet;
        this.posSaveListPet = posSaveListPet;
        this.posSaveListVet = posSaveListVet;
    }

    
    /**
     * Get the identification Vet
     * @return id_card_vet
     */
    public int getId_card_vet() {
        return id_card_vet;
    }
    /**
     * Set up the identification Vet
     * @param id_card_vet 
     */
    public void setId_card_vet(int id_card_vet) {
        this.id_card_vet = id_card_vet;
    }
    /**
     * Get the Name
     * @return namePet
     */
    public String getNamePet() {
        return namePet;
    }
    
    /**
     * Set up the name
     * @param namePet 
     */
    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }
    
    /**
     * Get the position PetList
     * @return posSaveListPet
     */
    public int getPosSaveListPet() {
        return posSaveListPet;
    }
    
    /**
     * Set up the position PetList
     * @param posSaveListPet 
     */
    public void setPosSaveListPet(int posSaveListPet) {
        this.posSaveListPet = posSaveListPet;
    }
    
    /**
     * Get the position VeteList
     * @return posSaveListVet
     */
    public int getPosSaveListVet() {
        return posSaveListVet;
    }
    
    /**
     * Set up the position VeteList
     * @param posSaveListVet 
     */
    public void setPosSaveListVet(int posSaveListVet) {
        this.posSaveListVet = posSaveListVet;
    }

 

    
    
}
