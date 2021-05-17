
package ui;

import java.util.Scanner;
import model.*;

/**
 * MAX_VETERINARIANS = 7 -- maximiun users veterinarians
 * MAX_PETS = 120 -- maximium pets registers
 * petlist -- petlist call the class Pet like a vector, with all the attributes
 * veteList -- call the class Veterinary like a vector, with all the attributes
 * ownerList -- call the class Owner like a vector, with all the attributes
 * consultList -- call the class ConsultPetVet like a vector, with all the attributes
 * id_card_numberVet -- var for temporal almacenate valuer for add at classes veterinary and owner, Type Int
 * nameVet, lastnameVet, RUT -- var for temporal almacenate valuer for add at classes veterinary and owner, type String
 * statusVet -- status Veterinarian, type StatusVet
 * option -- The option for MENU, type Int
 * sc -- Read the entry of the keyboard, type Scanner
 * posVet -- position of the vector veterinary, type int
 * pc -- Instance of the principal class
 * acuVet -- acumulate veterinary registered, type int
 * acuGlobal -- acumulate text for the datum of the vector, type String
 * animalsKind -- var type Kind, enum for vector Pet.
 * namePet,racePet,symptomsPet -- var type String, save the name, race, symptoms of the pet
 * agePet -- var type int, save the age of the pet
 * posPet -- var type int, save the position where find the attributes array pet
 * acuPet -- var type int, save the el acumulate of pet registered
 * idOwnerPet -- var type int, save the identification of the owner pet
 * priority -- var type PetPriority, save the priority by colors of the pet
 * status -- var type Pet Status, save the status of the pet
 * idCardNumber, cellPhoneNumber of type Int, nameOwner, directionOwner of type String, and these vars are for to save the datum of the Owner of the pet
 * posOwner -- var type int, save the position where find the attributes array Owner
 * acuOw -- var type int, save the el acumulate of owner registered
 * acuRet -- var type int, save the acumulated of retired by pet
 * id_car_vete of type int, namePetConsult of type String, priPetConsult of type PetPriority and these vars are for to save the datum of the Consult of the pet
 * posPetConsult, posVetConsult of type int, these vars are for save the position where are the vet and the pet.
 * posConsult -- var type int, save the position where find the attributes array consult
 * acuConsult -- var type int, save the el acumulate of consults registered
 * statusRed,statusOrange,statusYellow,statusGreen,statusBlue  -- vars of type int, save the number the pet registered by priority
 * consultSearch -- var type int,for save the position where is it located the pet and the vet in the array consultList
 * acuRed,acuOrange,acuYellow,acuGreen,acuBlue -- vars type int, for acumulated the pet registered by priority
 */
/**
 * 
 * @author Miguel Angel Varela Zuluaga
 * 
 * @version 1.3
 */

public class PetCenter {
    /**
     * maximiun users veterinarians
     */
    public static final int MAX_VETERINARIANS = 7;
    /**
     * maximium pets registers
     */
    public static final int MAX_PETS = 120;
    /**
     * call the class Pet like a vector, with all the attributes
     */
    public Pet[] petlist;
    /**
     * call the class Veterinary like a vector, with all the attributes
     */
    public Veterinary[] veteList;
    //new Code
    /**
     * call the class Owner like a vector, with all the attributes
     */
    public Owner[] ownerList;
    /**
     * call the class ConsultPetVet like a vector, with all the attributes
     */
    public ConsultPetVet[] consultList;
    /**
     * var for temporal almacenate valuer for add at classes veterinary and owner
     */
    public int id_card_numberVet;
    /**
     * var for temporal almacenate valuer for add at classes veterinary and owner
     */
    public  String nameVet, lastnameVet, RUT;
    /**
     * status Veterinarian
     */
    public StatusVet statusVet;
    /**
     * The option for MENU
     */
    public static int option = 0;
    /**
     * Read the entry of the keyboard, type Scanner
     */
    public static Scanner sc = new Scanner(System.in);
    /**
     * position of the vector veterinary
     */
    public int posVet = 0;
    /**
     * Instance of the principal class
     */
    public static PetCenter pc = new PetCenter();
    /**
     * acumulate veterinary registered
     */
    public int acuVet = 0;
    /**
     * acumulate text for the datum of the vector
     */
    public String acuGlobal;
    
    
    //date of the Pets
    /**
     * var type Kind, enum for vector Pet.
     */
    public Kind animalsKind;
    /**
     * var type String, save the dates of the pet
     */
    public String namePet,racePet,symptomsPet;
    /**
     * var type int, save the age of the pet
     */
    public int agePet;
    /**
     * var type int, save the position where find the attributes array pet
     */
    public int posPet;
    /**
     * var type int, save the el acumulate of pet registered
     */
    public int acuPet;
    /**
     * var type int, save the identification of the owner pet
     */
    public int idOwnerPet;
    /**
     * var type PetPriority, save the priority by colors of the pet
     */
    public PetPriority priority;
    /**
     * var type Pet Status, save the status of the pet
     */
    public PetStatus status;
    
    //dates of the Owner of the Pet
    /**
     * vars for to save the datum of the Owner of the pet
     */
    public int idCardNumber; 
    /**
     * vars for to save the datum of the Owner of the pet
     */
    public String nameOwner;
    /**
     * vars for to save the datum of the Owner of the pet
     */
    public int cellPhoneNumber;
    /**
     * vars for to save the datum of the Owner of the pet
     */
    public String directionOwner;
    /**
     * var type int, save the position where find the attributes array Owner
     */
    public int posOwner = 0;
    
    
    //Show Owners
    /**
     * var type int, save the el acumulate of owner registered
     */
    public int acuOw = 0;
    /**
     * var type int, save the acumulated of retired by pet
     */
    public int acuRet = 0;
    /**
     * vars for to save the datum of the Consult of the pet
     */
    public int id_car_vete = 0;
    /**
     * vars for to save the datum of the Consult of the pet
     */
    public String namePetConsult;
    /**
     * vars for to save the datum of the Consult of the pet
     */
    public PetPriority priPetConsult;
    /**
     * var type int, these vars are for save the position where are the vet and the pet.
     */
    public int posPetConsult;
    /**
     * var type int, save the position where find the attributes array consult
     */
    public int posConsult = 0;
    /**
     * var type int, save the el acumulate of consults registered
     */
    public int acuConsult = 0;
    /**
     * var type int, these vars are for save the position where are the vet and the pet.
     */
    public int posVetConsult;
    /**
     * vars type int, save the number the pet registered by priority
     */
    public int statusRed = 0;
    /**
     * vars type int, save the number the pet registered by priority
     */
    public int statusOrange = 0;
    /**
     * vars type int, save the number the pet registered by priority
     */
    public int statusYellow = 0;
    /**
     * vars type int, save the number the pet registered by priority
     */
    public int statusGreen = 0;
    /**
     * vars type int, save the number the pet registered by priority
     */
    public int statusBlue = 0;
    /**
     * var type int,for save the position where is it located the pet and the vet in the array consultList
     */
    public int consultSearch;
    /**
     * vars type int, for acumulated the pet registered by priority
     */
    public int acuRed;
    /**
     * vars type int, for acumulated the pet registered by priority
     */
    public int acuOrange;
    /**
     * vars type int, for acumulated the pet registered by priority
     */
    public int acuYellow;
    /**
     * vars type int, for acumulated the pet registered by priority
     */
    public int acuGreen;
    /**
     * vars type int, for acumulated the pet registered by priority
     */
    public int acuBlue;
    /**
     * The method addVetenaryArray is for Save the vets in a Array
     * @param newVete
     * @param pos 
     */
    public void addVetenaryArray(Veterinary newVete, int pos){ //Function for add datum at vector veteList
            veteList [pos] = newVete;
    }
    
    /**
     * The method addOwnerArray is for Save the Owner in a Array
     * @param newOwner
     * @param pos 
     */
   public void addOwnerArray(Owner newOwner, int pos){ //Function for add datum at vector ownerList
            ownerList [pos] = newOwner;
    }
    /**
     * The method addPetArray is for Save the Pets in a Array
     * @param newPet
     * @param pos 
     */
    public void addPetArray(Pet newPet, int pos){ //Function for add datum at vector petList
            petlist [pos] = newPet;
    }
    /**
     * The method addConsultArray is for Save the Consults in a Array
     * @param newConsul
     * @param pos 
     */
    public void addConsultArray(ConsultPetVet newConsul, int pos){ //Function for add datum at vector petList
            consultList[pos] = newConsul;
    }
    
    /**
     * Method for Create the size array of the listeds
     *  vetelist[7]
     *  petlisst[7]
     *  ownerlist[7]
     *  Consultlist[7]
     */
    public PetCenter(){
        veteList = new Veterinary[MAX_VETERINARIANS]; // to assign max_numbers of veterinarians
        petlist = new Pet[MAX_PETS];//to assign max_numbers of pets
        ownerList = new Owner[MAX_PETS];//to assign max_numbers of owners
        consultList = new ConsultPetVet[MAX_PETS];//to assign max_numbers of owners
    }
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        try{
        
        
        
            do{
                System.out.println("Enter the option of the MENU:\n"
                + "1. Add veterinarians.\n"
                + "2. Show veterinarians\n"
                + "3. Add Pets\n"
                + "4. Show Pets\n"
                + "5. Show Owners\n"
                + "6. Retreat of Pet\n"
                + "7. Consult Pet\n"
                + "8. Delete Veterinarians\n"
                + "9. Show the number of pets withot attention\n"
                +"10. Show Consults Pet Vet\n"
                +"11. Finalize Consult Pet Vet\n"
                +"12. Daily closing of the center\n"
                + "-1. Exit Program");//entry of the MENU, Control of switch and do-while
                option = sc.nextInt();
                switch(option){
                    case 1:
                        pc.addVeterinarians();
                    break;
                    case 2:
                        pc.showVeterinarians();
                    break;
                    case 3:
                        pc.addPets();
                    break;
                    case 4:
                        pc.showPets();
                    break;
                    case 5:
                        pc.showOwners();
                    break;
                    case 6:
                        pc.exitWithoutAttentionPet();
                    break;
                    case 7:
                        pc.consultVetPet();
                    break;
                    case 8:
                        pc.DeleteVeterinarians();
                    break;
                    case 9:
                        pc.ShowPetWaiting();
                    break;
                    case 10:
                        pc.ShowPetVet();
                    break;
                    case 11:
                        pc.FinalizeConsult();
                    break;
                    case 12:
                        pc.DailyClosing();
                    break;
                    case -1:
                        System.out.println("Exit");
                    break;
                    default:
                        System.err.println("Option invalidate");
                    break;
                }
            }while(option != -1);
        }catch(Exception e){
            System.err.println("Error in the function "+e);
        }
        
    }
    
    /**
     * Method addVeterinarians 
     * the veterinarians in a array of type Veterinary
     */
    public void addVeterinarians(){
        if(acuVet<MAX_VETERINARIANS){
             System.out.println("Add the datum of the veterinarian: ");
            System.out.println("identification number : ");
            id_card_numberVet = sc.nextInt();
            System.out.println("Name : ");
            nameVet = sc.next();
            System.out.println("LastName : ");
            lastnameVet = sc.next();
            System.out.println("RUT : ");
            RUT = sc.next();  //all these are datum of entry
            statusVet = StatusVet.FREE;
            Veterinary vt = new Veterinary(id_card_numberVet, nameVet, lastnameVet, RUT, statusVet); //Instance class veterinary, with the atributes specifics
            pc.addVetenaryArray(vt, posVet);//add datums at function
            posVet++;//aument in 1 position
            acuVet++;//Number of the veterinarians
        }else{
            System.err.println("you have reached the maximum number of allowed users");
        }
       
    }
    /**
     * Method DeleteVeterinarians
     *  delete veterinarians 
     */
    public void DeleteVeterinarians(){
        int acuTest = 0;
        
        for(int i=0;i<MAX_PETS;i++){
            if(petlist[i] != null){
                acuTest+=1;
            }
        }
        
        if(acuTest==0){
            pc.showShortVeterinarians();
            System.out.println("Choose a position of the list vets");
            option = sc.nextInt();
            
            veteList[option-1] = null;
            acuVet-=1;
        }else{
            System.out.println("there are already registered pets, you cannot delete");
        }
    }
    
    /**
     * Method showVeterinarians
     *  Show the veterinarians registered
     */
    public void showVeterinarians(){
        acuGlobal = "";
        int pos = 1;
        System.out.println("******VETERIARIANS REGISTERED ( "+acuVet+" )********\n");
        for (int i = 0; i < MAX_VETERINARIANS; i++) {
            
            if(veteList[i] != null){
                Veterinary vt = veteList[i];//Instance for to access at vector veterinary
                
                acuGlobal += "Veterinary "+(pos++)+"\nIdentication: "+vt.getId_card_number()+"\nName: "+vt.getName()+"\n"
                        + "Lastname: "+ vt.getLastname()+"\nRUT: "+vt.getRUT()+"\nStatus: "+vt.getStatus()+"\n\n"; 
            }
        }
        System.out.println(acuGlobal);
    }
    
    /**
     * Method showShortVeterinarians
     *  Show the veterinarians registered of a way more short
     */
    public void showShortVeterinarians(){
        acuGlobal = "";
        int pos = 0;
        System.out.println("******VETERIARIANS REGISTERED ( "+acuVet+" )********\n");
        for (int i = 0; i < MAX_VETERINARIANS; i++) {
            pos = i+1;
            if(veteList[i] != null){
                Veterinary vt = veteList[i];//Instance for to access at vector veterinary
                
                acuGlobal += "Veterinary "+(pos++)+"\nIdentication: "+vt.getId_card_number()+"\nName: "+vt.getName()+"\nStatus: "+vt.getStatus()+"\n\n"; 
            }
        }
        System.out.println(acuGlobal);
    }
    
    /**
     * Method addPets
     *  Save pets in a array of type Pet
     */
    public void addPets(){
        if(acuPet<MAX_PETS){
            addOwner();
            System.out.println("What is the level Priority of the Pet: ");
            System.out.println("Choose a Priority of the Pet:\n1. RED\n2. ORANGE\n3. YELLOW\n4. GREEN\n5. BLUE");
            option = sc.nextInt();
            switch(option){
                case 1:
                    priority = PetPriority.RED;
                break;
                case 2:
                    priority = PetPriority.ORANGE;
                break;
                case 3:
                    priority = PetPriority.YELLOW;
                break;
                case 4:
                    priority = PetPriority.GREEN;
                break;
                case 5:
                    priority = PetPriority.BLUE;//Asignate var
                break;
                default:
                    System.err.println("Option Invalidate");
                 break;
            }

            status = PetStatus.WAITING;

            System.out.println("Add the datum of the Pet: ");
            System.out.println("Choose a animals kind:\n1. DOG\n2. CAT\n3. RABBIT\n4. REPTILE\n5. BIRD");
            //optionPet = "";
            option = sc.nextInt();
            switch(option){
                case 1:
                    animalsKind = Kind.DOG;
                break;
                case 2:
                    animalsKind = Kind.CAT;
                break;
                case 3:
                    animalsKind = Kind.RABBIT;
                break;
                case 4:
                    animalsKind = Kind.REPTILE;
                break;
                case 5:
                    animalsKind = Kind.BIRD;//Asignate var
                break;
                default:
                    System.err.println("Option Invalidate");
                 break;
            }

            //New Code
            //System.out.println("If the Pet is Cat or Dog, add Name, Age, Race, write the option, in case not be none write anything");
            //optionPet = sc.next();

            if(animalsKind == Kind.DOG || animalsKind == Kind.CAT){
                System.out.println("Name: ");
                namePet = sc.next();
                System.out.println("Age: ");
                agePet = sc.nextInt();
                System.out.println("Race: ");
                racePet = sc.next();

            }else{
                namePet = null;
                agePet = 0;
                racePet = null;
            }

            //showOwners();
            //System.out.println("Write the Number identification of the owner");
            //idOwnerPet = sc.nextInt();
            idOwnerPet = idCardNumber;
            //validateOwners();
            System.out.println("Symptoms of the Pet: ");
            symptomsPet = sc.next();
            Pet pt = new Pet(namePet, racePet, symptomsPet, agePet, idOwnerPet,animalsKind,priority,status);
            pc.addPetArray(pt, posPet);
            posPet ++;
            acuPet ++;
        }else{
            System.err.println("you have reached the maximum number of allowed Pets");
        }

    }
    
    /**
     * Method showPets
     *  Show the pets registered
     */
    public void showPets(){
            acuGlobal = "";
            int pos = 1;
            System.out.println("******PETS REGISTERED ( "+acuPet+" )********\n");
            for (int i = 0; i < MAX_PETS; i++) {

                if(petlist[i] != null){
                    Pet pt = petlist[i];//Instance for to access at vector veterinary

                    acuGlobal += "Pets "+(pos++)+"\nLevel Priority Pet:"+pt.getPriority()+"\nName Pet: "+pt.getName()+"\nKind Pet: "+pt.getKind()+"\n"
                            + "Age Pet: "+ pt.getAge()+"\nRace Pet: "+pt.getRace()+"\nSymptoms Pet: "
                            + ""+pt.getSymptoms()+"\nID Owner Pet: "+pt.getId_owner()+"\nStatus Pet: "+pt.getStatus()+"\n\n"; 
                }
            }
            System.out.println(acuGlobal);
    }
    
    /**
     * Method showShortPets
     *  Show the pets registered of a way shorter
     */
    public void showShortPets(){
            acuGlobal = "";
            int pos = 0;
            System.out.println("******LIST PETS REGISTERED ( "+acuPet+" )********\n");
            for (int i = 0; i < MAX_PETS; i++) {
                pos = i +1;
                if(petlist[i] != null){
                    
                    Pet pt = petlist[i];//Instance for to access at vector veterinary
                    if(pt.getStatus() == PetStatus.WAITING){
                        acuGlobal += "No. "+(pos++)+"\nName Pet: "+pt.getName()+"\nLevel Priority Pet:"+pt.getPriority()+
                                "\nStatus Pet: "+pt.getStatus()+"\n\n"; 
                    }
                    
                }
            }
            System.out.println(acuGlobal);
    }
    
   /**
     * Method addOwner
     *  Save owner of the pet in a array of type Owner
     */
   public void addOwner(){
       System.out.println("Add the datum of the Owner of the Pet: ");
       System.out.println("Number identification: ");
       idCardNumber = sc.nextInt();
       System.out.println("Name Person: ");
       nameOwner = sc.next();
       System.out.println("CellPhone Number: ");
       cellPhoneNumber = sc.nextInt();
       System.out.println("Direction: ");
       directionOwner = sc.next();
       
       Owner oP = new Owner(idCardNumber, cellPhoneNumber, nameOwner, directionOwner);
       pc.addOwnerArray(oP, posOwner);
       posOwner ++; 
       acuOw ++;
   }
   
   /**
    * Method showOwners
    *  Show the Owner of the Pet registered
    */
   public void showOwners(){
        acuGlobal = "";
        int pos = 1;
        System.out.println("******OWNERS REGISTERED ( "+acuOw+" )********\n");
        for (int i = 0; i < MAX_PETS; i++) {
            
            if(ownerList[i] != null){
                Owner ow = ownerList[i];//Instance for to access at vector Owner
                
                acuGlobal += "Owner "+(pos++)+"\nIdentication: "+ow.getId_card()+"\nName: "+ow.getName()+"\n\n"; 
            }
        }
        System.out.println(acuGlobal);
    }
    
    /*public void validateOwners(){
        
        for(int i=0; i< MAX_PETS; i++){
            
            
            Owner ow = ownerList[i];//Instance for to access at vector Owner
            
            if(idOwnerPet == ow.getId_card()){
                System.out.println("added correctly to "+ow.getName());
                break;
            }else{
                System.out.println("error identification of owner, add newly ");
                System.out.println("Write the Number identification of the owner");
                idOwnerPet = sc.nextInt();
                validateOwners();
            }
        }
    }*/
    
   /**
    * Method exitWithoutAttentionPet
    *  Retired a pet that is in Wating
    */
    public void exitWithoutAttentionPet(){
        int posTemp;
        pc.showShortPets();
        System.out.println("choose an pet of the listed: ");
        option = sc.nextInt();
        posTemp = option - 1;
        
        Pet ptl = petlist[posTemp];
        
        namePet = ptl.getName();
        racePet = ptl.getRace();
        symptomsPet = ptl.getSymptoms();
        agePet = ptl.getAge();
        idOwnerPet = ptl.getId_owner();
        animalsKind = ptl.getKind();
        priority = ptl.getPriority();
        status = PetStatus.WITHOUT_ATTENTION_EXIT;
        
        Pet pt = new Pet(namePet, racePet, symptomsPet, agePet, idOwnerPet,animalsKind,priority,status);
        
        pc.addPetArray(pt, posTemp);
        
        acuRet ++;
        
    }
    
    /**
     * Method consultVetPet
     *  add a consult between Pet and Vet to an array of Type ConsultPetVet
     */
    public void consultVetPet(){
        pc.showShortVeterinarians();
        pc.searchIdVeterinarian();
        pc.searchPetsPriorityRed();
        pc.searchPetsPriorityOrange();
        pc.searchPetsPriorityYellow();
        pc.searchPetsPriorityGreen();
        pc.searchPetsPriorityBlue();
        
        if(statusRed == 1){
            pc.searchPetsPriorityRed();
        }else{
            if(statusOrange == 1){
                pc.searchPetsPriorityOrange();
            }else{
                if(statusYellow == 1){
                    pc.searchPetsPriorityYellow();
                }else{
                    if(statusGreen == 1){
                        pc.searchPetsPriorityGreen();
                    }else{
                        if(statusBlue == 1){
                            pc.searchPetsPriorityBlue();
                        }else{
                            System.err.println("No pets waiting");
                        }
                    }
                }
            }
        }
        
        
        ConsultPetVet cPV = new ConsultPetVet(id_card_numberVet, namePetConsult, posPetConsult, posVetConsult);
        pc.addConsultArray(cPV, posConsult);
        pc.changeStatusConsul();
        
        posConsult ++;
        acuConsult ++;
        
        
    }
    
    /**
     * Method searchPetsPriorityRed
     *  search if there are Pets in the priority Red
     */
    public void searchPetsPriorityRed(){
        
        for(int i=0; i<MAX_PETS; i++){
            
            Pet pt = petlist[i];
            
            if(pt==null){
                break;
            }
            
            if(pt.getStatus()== PetStatus.WAITING && pt.getPriority() == PetPriority.RED){
                namePetConsult = pt.getName();
                priPetConsult = pt.getPriority();
                posPetConsult = i;
                statusRed = 1;
                break;
            }else{
                statusRed = 0;
            }
            
            
            
        }
    }
    
    /**
     * Method searchPetsPriorityOrange
     *  search if there are Pets in the priority Orange
     */
    public void searchPetsPriorityOrange(){
        
        for(int i=0; i<MAX_PETS; i++){
            
            Pet pt = petlist[i];
            
            if(pt==null){
                break;
            }
            if(pt.getStatus()== PetStatus.WAITING && pt.getPriority() == PetPriority.ORANGE){
                namePetConsult = pt.getName();
                priPetConsult = pt.getPriority();
                posPetConsult = i;
                statusOrange = 1;
                break;
            }else{
                statusOrange = 0;
            }
            
            
        }
    }
    /**
     * Method searchPetsPriorityYellow
     * search if there are Pets in the priority Yellow
     */
    public void searchPetsPriorityYellow(){
        
        for(int i=0; i<MAX_PETS; i++){
            
            Pet pt = petlist[i];
            
            if(pt==null){
                break;
            }
            if(pt.getStatus()== PetStatus.WAITING && pt.getPriority() == PetPriority.YELLOW){
                namePetConsult = pt.getName();
                priPetConsult = pt.getPriority();
                posPetConsult = i;
                statusYellow = 1;
                break;
            }else{
                statusYellow = 0;
            }
            
            
        }
    }
    
    /**
     * Method searchPetsPriorityGreen
     *  search if there are Pets in the priority Green
     */
    public void searchPetsPriorityGreen(){
        
        for(int i=0; i<MAX_PETS; i++){
            
            Pet pt = petlist[i];
            
            if(pt==null){
                break;
            }
            if(pt.getStatus()== PetStatus.WAITING && pt.getPriority() == PetPriority.GREEN){
                namePetConsult = pt.getName();
                priPetConsult = pt.getPriority();
                posPetConsult = i;
                statusGreen = 1;
                break;
            }else{
                statusGreen = 0;
            }
            
            
        }
    }
    /**
     * Method searchPetsPriorityBlue
     *  search if there are Pets in the priority Blue
     */
    public void searchPetsPriorityBlue(){
        
        for(int i=0; i<MAX_PETS; i++){
            
            Pet pt = petlist[i];
            
            if(pt==null){
                break;
            }
            if(pt.getStatus()== PetStatus.WAITING && pt.getPriority() == PetPriority.BLUE){
                namePetConsult = pt.getName();
                priPetConsult = pt.getPriority();
                posPetConsult = i;
                statusBlue = 1;
                break;
            }else{
                statusBlue = 0;
            }
            
            
        }
    }
    
    /**
     * Method searchIdVeterinarian
     *  Search with the identification of the Veterinarian, if this is in the array
     */
    public void searchIdVeterinarian(){//falla al colocar una cedula que no es, ya que cuando queda nulo se daña el programa
        System.out.println("write Number id_card Veterinarian: ");
        id_card_numberVet = sc.nextInt();
        for(int i=0; i<MAX_VETERINARIANS; i++){
            Veterinary vt = veteList[i];
            
            if(vt == null){
                
                break;
            }
            
            if(vt.getId_card_number() == id_card_numberVet){
                if(vt.getStatus() == StatusVet.FREE){
                    id_car_vete = id_card_numberVet;
                    posVetConsult = i;

                    break;
                }else{
                    System.err.println("The Vet is in a consult");
                    break;
                }
                
            }
            
        }
          
    }
    
    /**
     * Method changeStatusConsul
     *  Change the status of pet by IN_CONSULTATION and vet by BUSY
     */
    public void changeStatusConsul(){
        Pet ptl = petlist[posPetConsult];
        Veterinary vt = veteList[posVetConsult];
        
        if(id_card_numberVet == id_car_vete && ptl!=null && vt != null && vt.getStatus() == StatusVet.FREE && ptl.getStatus()== PetStatus.WAITING){
            
            
            namePet = ptl.getName();
            racePet = ptl.getRace();
            symptomsPet = ptl.getSymptoms();
            agePet = ptl.getAge();
            idOwnerPet = ptl.getId_owner();
            animalsKind = ptl.getKind();
            priority = ptl.getPriority();
            status = PetStatus.IN_CONSULTATION;

            Pet pt = new Pet(namePet, racePet, symptomsPet, agePet, idOwnerPet,animalsKind,priority,status);

            pc.addPetArray(pt, posPetConsult);

            id_card_numberVet  = vt.getId_card_number();
            nameVet = vt.getName();
            lastnameVet = vt.getLastname();
            RUT = vt.getRUT();
            statusVet = StatusVet.BUSY;
            Veterinary vt2 = new Veterinary(id_card_numberVet, nameVet, lastnameVet, RUT, statusVet); //Instance class veterinary, with the atributes specifics
            pc.addVetenaryArray(vt2, posVetConsult);//add datums at function
           
        }
        
        if(vt == null){
            System.err.println("There is no registered veterinarian");
        }
        
        if(ptl == null){
            System.err.println("There is no registered Pet");
        }
        
        if(id_card_numberVet != id_car_vete){
            System.err.println("vet does not exist");
        }
        
    }
    
    /**
     * Method ShowPetWaiting
     *  Show all the Pets that is in waiting
     */
    public void ShowPetWaiting(){
        acuGlobal = "";
        int acu = 0;
        System.out.println("******LIST PETS IS WAITING********\n");
        for (int i = 0; i < MAX_PETS; i++) {
            
            if(petlist[i] != null){

                Pet pt = petlist[i];//Instance for to access at vector veterinary
                if(pt.getStatus() == PetStatus.WAITING){
                    acu += 1;
                }

            }
        }
        acuGlobal += "Number of Pets in Waiting are: "+acu; 
        System.out.println(acuGlobal);
    }
    
    /**
     * Method ShowPetVet
     *  the relation between Pet and Vet in consult
     */
    public void ShowPetVet(){
        acuGlobal = "";
        
        System.out.println("******LIST CONSULT PETS VETS********\n");
        for (int i = 0; i < MAX_PETS; i++) {
            
            if(consultList[i] != null){

                ConsultPetVet con = consultList[i];//Instance for to access at vector veterinary
                Veterinary vt = veteList[con.getPosSaveListVet()];
                Pet pt = petlist[con.getPosSaveListPet()];
                
                acuGlobal += "Name Veterinary: "+vt.getName()+"\nName Pet: "+ con.getNamePet()+"\nStatus Pet: "+pt.getStatus()+"\n\n";
            }
        }
       
        System.out.println(acuGlobal);
    }
    
    /**
     * Method FinalizeConsult
     *  to Finalize The consult of the pet and chage the status by AUTHORIZED_EXIT or GO_TO_HOSPITALIZATION and too the status the vet by FREE
     */
    public void FinalizeConsult(){
        System.out.println("***************LIST OF CONSULTS IN EXECUTION************ ");
        pc.showVetsPetsInConsult();
        System.out.println("Enter number identification of Vet: ");
        id_card_numberVet = sc.nextInt();
        System.out.println("Enter the Name of Pet: ");
        namePetConsult = sc.next();
        pc.searchConsultVetPet();
        
        System.out.println("Entry 1 for AUTHORIZED_EXIT or 2 for GO_TO_HOSPITALIZATION");
        option = sc.nextInt();

        ConsultPetVet cPV = consultList[consultSearch];
        Pet ptl = petlist[cPV.getPosSaveListPet()];
        Veterinary vt = veteList[cPV.getPosSaveListVet()];
            
        if(cPV.getId_card_vet() == id_card_numberVet && ptl.getStatus() == PetStatus.IN_CONSULTATION && vt.getStatus() == StatusVet.BUSY){
            namePet = ptl.getName();
            racePet = ptl.getRace();
            symptomsPet = ptl.getSymptoms();
            agePet = ptl.getAge();
            idOwnerPet = ptl.getId_owner();
            animalsKind = ptl.getKind();
            priority = ptl.getPriority();
            if(option == 1){
                status = PetStatus.AUTHORIZED_EXIT;
            }else{
                if(option == 2){
                    status = PetStatus.GO_TO_HOSPITALIZATION;
                }
            }
            

            Pet pt = new Pet(namePet, racePet, symptomsPet, agePet, idOwnerPet,animalsKind,priority,status);

            pc.addPetArray(pt, cPV.getPosSaveListPet());

            id_card_numberVet  = vt.getId_card_number();
            nameVet = vt.getName();
            lastnameVet = vt.getLastname();
            RUT = vt.getRUT();
            statusVet = StatusVet.FREE;
            Veterinary vt2 = new Veterinary(id_card_numberVet, nameVet, lastnameVet, RUT, statusVet); //Instance class veterinary, with the atributes specifics
            pc.addVetenaryArray(vt2, cPV.getPosSaveListVet());//add datums at function
        
        }else{
            System.err.println("The Vet or Pet are not in the consulting room ");
        }
        
    }
    
    /**
     * Method searchConsultVetPet
     *  search the pet that is in consult and compare the identification of the Vet insert
     */
    public void searchConsultVetPet(){
        acuGlobal = "";
        int pos = 0;
        
        for (int i = 0; i < MAX_PETS; i++) {
         
            if(consultList[i] != null){
                ConsultPetVet con = consultList[i];
                Pet pt = petlist[con.getPosSaveListPet()];
                 
                if(con.getId_card_vet() == id_card_numberVet && pt.getStatus()==PetStatus.IN_CONSULTATION){
                    
                    consultSearch = i;
                    break;
                    
                }
                
                
               
            }
        }
        
        
        
    }
    
    /**
     * Method showVetsPetsInConsult()
     *  show the pet that is in consult with your respective veterinarian
     */
    public void showVetsPetsInConsult(){
        acuGlobal = "";
        int pos = 0;
        System.out.println("******VETERIARIANS AND PETS IN CONSULT********\n");
        for (int i = 0; i < MAX_PETS; i++) {
            pos = i+1;
            if(consultList[i] != null){
                ConsultPetVet con = consultList[i];
                Pet pt = petlist[con.getPosSaveListPet()];
                Veterinary vt = veteList[con.getPosSaveListVet()];
                if(pt.getStatus()==PetStatus.IN_CONSULTATION && vt.getStatus() == StatusVet.BUSY){
                    acuGlobal += "Consult "+(pos++)+"\nIdentication Vet: "+vt.getId_card_number()+
                            "\nName Vet: "+vt.getName()+"\nName Pet: "+pt.getName()+"\nKind Pet: "+pt.getKind()+"\n\n";
                }
                 
            }
        }
        System.out.println(acuGlobal);    
    }
    
    /**
     * Method UnattendedPets
     * show if there are pets by attended
     */
    public void UnattendedPets(){
        int acuTest = 0;
        for (int i = 0; i < MAX_PETS; i++) {
            
            if(petlist[i] != null){
                Pet pt = petlist[i];
                
                if(pt.getStatus() == PetStatus.WAITING || pt.getStatus() == PetStatus.IN_CONSULTATION ){
                    acuTest += 1;
                }
                 
            }
        }
        
        if(acuTest>0){
            System.out.println("- There are still pets pending to attend");
        }else{
            System.out.println("- there are no pets pending to attend");
        }
    }
    
    /**
     * method NameVetHigherNumberConsults
     *  the name of the vet that have more consults
     */
    public void NameVetHigherNumberConsults(){
        int[] count = new int[6];
        int higher = count[0];
        int pos = 1;
        acuGlobal = "";
        for (int i = 0; i < MAX_VETERINARIANS; i++) {
            
            if(veteList[i] != null){
                Veterinary vt = veteList[i];
                
                for (int j = 0; j < MAX_PETS; j++){
                    
                    if(consultList[j] != null){
                        ConsultPetVet cPV = consultList[j];
                        if(vt.getId_card_number() == cPV.getId_card_vet()){
                            
                            count[i] = pos;
                            pos+=1;
                        }
                    }
                }
                
                pos=1;
                 
            }
        }
        
        for (int x = 1; x < count.length; x++) {
            if (count[x] > higher) {
                    higher = count[x];
            }
	}
        for (int y = 0; y < count.length; y++) {
            if(count[y]==higher){
                Veterinary vtl = veteList[y];
                acuGlobal += "\tName Vet: \n"+ vtl.getName() + "Number of consults: "+ count[y] +"\n\n";
            }
	}
        System.out.println("\n\nName of Vet with Higher Number of Consults: ");
        System.out.println(acuGlobal);
    }
    
    /**
     * Method NumbersPetsPriority
     * the number of pet by priority attended
     */
    public void NumbersPetsPriority(){
        acuRed = 0;
        acuOrange = 0;
        acuYellow = 0;
        acuGreen = 0;
        acuBlue = 0;
        acuGlobal = "";
        for(int i=0;i<MAX_PETS;i++){
            if(petlist[i]!=null){
                Pet pt = petlist[i];
                if(pt.getStatus()==PetStatus.GO_TO_HOSPITALIZATION || pt.getStatus()==PetStatus.AUTHORIZED_EXIT){
                    if(pt.getPriority() == PetPriority.RED){
                        acuRed += 1;
                    }
                    if(pt.getPriority() == PetPriority.ORANGE){
                        acuOrange += 1;
                    }
                    if(pt.getPriority() == PetPriority.YELLOW){
                        acuYellow += 1;
                    }
                    if(pt.getPriority() == PetPriority.GREEN){
                        acuGreen += 1;
                    }
                    if(pt.getPriority() == PetPriority.BLUE){
                        acuBlue += 1;
                    }
                }
                
                
                
            }
        }
        
        acuGlobal = "\tPriority Red: "+acuRed+"\n\tPriority Orange: "+acuOrange+"\n\tPriority Yellow: "
                +acuYellow+"\n\tPriority Green: "+acuGreen+"\n\tPriority Blue: "+acuBlue+"\n\n";
        System.out.println("\n\nPet Attends by Prioritys:");
        System.out.println(acuGlobal);
    }
    
    /**
     * Method PercentRet
     *  the percent of Pets Retired unattended
     */
    public void PercentRet(){
        double percent;
        percent = (acuRet*100)/acuPet;
        acuGlobal = "\tPercent of pets: "+percent;
        System.out.println("\n\nPercent of Pets without being attended: ");
        System.out.println(acuGlobal);
    }
    
    /**
     * Method Statistics
     * the statistics previous
     */
    public void Statistics(){
        System.out.println("**********STATISTICAL INFORMATION************\n");
        pc.NameVetHigherNumberConsults();
        pc.NumbersPetsPriority();
        pc.PercentRet();
        System.out.println("*********************************************\n");
    }
    
    /**
     * Method DeleteAllPets
     *  Delete all Pets Registered
     */
    public void DeleteAllPets(){
        
        for(int i=0;i<MAX_PETS;i++){
            if(petlist[i]!=null){
                petlist[i]=null;
            }
        }
        acuPet = 0;
    }
    
    /**
     * Method DailyClosing
     *  Daily Closing whith the methods UnattendedPets, Statistics and DeleteAllPets
     */
    public void DailyClosing(){
        int report=0; 
        for(int i=0;i<MAX_PETS;i++){
            if(petlist[i] !=null){
                Pet pt = petlist[i];
                if(pt.getStatus() == PetStatus.WAITING || pt.getStatus() == PetStatus.IN_CONSULTATION){
                    report += 1;
                }
            }
            
        }
        
        if(report==0){
            System.out.println("___________________DAILY CLOSING OF THE CENTER___________________");
            pc.UnattendedPets();
            pc.Statistics();
            pc.DeleteAllPets();
            System.out.println("_________________________________________________________________");
            
        }else{
            System.err.println("there are still pets to attend");
        }
    }
    
}
