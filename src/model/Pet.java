
package model;

/**
 * 
 * Class Pet
 */
public class Pet {
    public String  name, race,symptoms;
    public int age,id_owner;
    public Kind kind;
    public PetPriority priority;
    public PetStatus status;
    
    /**
     * Method Construtor of Pet
     * @param name
     * @param race
     * @param symptoms
     * @param age
     * @param id_owner
     * @param kind
     * @param priority
     * @param status 
     */
    public Pet(String name, String race, String symptoms, int age, int id_owner, Kind kind, PetPriority priority, PetStatus status) {
        this.name = name;
        this.race = race;
        this.symptoms = symptoms;
        this.age = age;
        this.id_owner = id_owner;
        this.kind = kind;
        this.priority = priority;
        this.status = status;
    }
    
    /**
     * Get the Name Pet
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Set up the Name Pet
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Get the Race Pet
     * @return race
     */
    public String getRace() {
        return race;
    }
    /**
     * Set up the Race Pet
     * @param race 
     */
    public void setRace(String race) {
        this.race = race;
    }
    /**
     * Get the Symptoms Pet
     * @return symptoms
     */
    public String getSymptoms() {
        return symptoms;
    }
    /**
     * Set up the Symptoms Pet
     * @param symptoms 
     */
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
    /**
     * Get the Age Pet
     * @return age
     */
    public int getAge() {
        return age;
    }
    /**
     * Set up the Age Pet
     * @param age 
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Get the Identification Owner
     * @return id_owner
     */
    public int getId_owner() {
        return id_owner;
    }
    
    /**
     * Set up the Identification Owner
     * @param id_owner 
     */
    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }
    /**
     * Get the Kind Pet
     * @return kind
     */
    public Kind getKind() {
        return kind;
    }
    /**
     * Set up the Kind Pet
     * @param kind 
     */
    public void setKind(Kind kind) {
        this.kind = kind;
    }
    /**
     * Get the Priority Pet
     * @return priority
     */
    public PetPriority getPriority() {
        return priority;
    }
    /**
     * Set up the Priority Pet
     * @param priority 
     */
    public void setPriority(PetPriority priority) {
        this.priority = priority;
    }
    /**
     * Get the Status Pet
     * @return status
     */
    public PetStatus getStatus() {
        return status;
    }
    /**
     * Set up the Status Pet
     * @param status 
     */
    public void setStatus(PetStatus status) {
        this.status = status;
    }

    
    
}
    

    