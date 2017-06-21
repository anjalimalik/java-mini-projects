import java.io.*;

public class AddressBook { 
    private int totalContacts;    
    private int maxContacts;      
    private Contact[] contacts;  
    
    /**
     * Constructor. Sets the initial size of the AddressBook to hold 10 Contacts.
     */
    public AddressBook() {
      
        this.totalContacts = 0;
        this.maxContacts = 10;
        contacts = new Contact[10];
        
    }
 
    /**
     * Adds the specified Contact to this AddressBook at the end of the contacts array. If 
     * the Contact already exists, it updates its phone number if the argument's number is not 0 and 
     * address if the argument's address is not null. If the totalContacts reaches the 
     * maxContacts, then the contacts array is doubled in size and maxContacts is doubled 
     * before the new Contact is added.
     * 
     * contact The Contact to add to this AddressBook
     * @return true if the Contact was added, false otherwise
     */
    public boolean addContact(Contact contact) {
      
      int index = 0;
      
      if(contains(contact)) {
        for(int i = 0; i < contacts.length; i++) { 
          if(contact.equals(contacts[i])) { 
            index = i;
            break;
          }
        }

        
        if(contacts[index].getNumber() != 0 && contacts[index].getAddress() != null) {
             contacts[index] = contact;
        }else { contacts[contacts.length - 1] = contact; }

      
      totalContacts = totalContacts + 1;
      
      if(totalContacts == maxContacts) {
        
        this.maxContacts *= 2; 
        Contact[] temp = new Contact[contacts.length];
        
        for(int j = 0; j < contacts.length; j++) {
          temp[j] = contacts[j];
        }
        
        contacts = temp;
      }
        return true;
     } else return false;
      
     }
      

 
    /**
     * Removes the specified Contact from this AddressBook and moves all entries 
     * that follow it in the contacts array to the left so that there are no empty
     * entries between Contacts. For example:
     * 
     * before -> {C1, C2, C3, C4, C5, C6, C7, C8, C9, null}
     * remove C6
     * after -> {C1, C2, C3, C4, C5, C7, C8, C9, null, null}
     * 
     * contact The Contact to remove from this AddressBook
     * @return true if the Contact was removed, false otherwise
     */
    public boolean removeContact(Contact contact) {
      
      int index = 0;
      int j = 0;
      
      if(contains(contact)) {
        for(int i = 0; i < contacts.length; i++) { 
          if(contact.getName().equals((contacts[i].getName()))) { 
            index = i;
            break;
          }
         }
         for (j = index; j <totalContacts - 1; j++) {
            contacts[j] = contacts[j+1];
          }
             contacts[j] = null;
             totalContacts--;
      
          return true;
        } else return false;

    }
 
    /**
     * Gets a Contact by the specified name from this AddressBook.
     * 
     * name The name of the Contact to get
     * @return The Contact if they are found, null otherwise
     */
    public Contact getContactByName(String name) {
      
      int index = 0;
        for(int i = 0; i < contacts.length; i++) { 
          if(name.equals((contacts[i].getName()))) { 
            index = i;
            break;
          }
         } 
        return contacts[index];
    }
 
    /**
     * Checks if the given contact is already in this AddressBook.
     * 
     * contact The contact to find
     * @return True if the contact is found, false otherwise
     */
    public boolean contains(Contact contact) {
      
      int check = 0; 
      for(int i = 0; i < contacts.length; i++) {
        if(contact.equals(contacts[i])){
          check = 1;;
          
        }
      }
      if(check == 0) return false;
      if(check == 1) return true;
      return false;
    }
 
    /**
     * Prints all the Contacts in this AddressBook.
     */
    public void printAddressBook() {
        for (int i = 0; i < this.totalContacts; i++) {
            System.out.printf("Name: %s%n", this.contacts[i].getName());
            System.out.printf("Number: %d%n", this.contacts[i].getNumber());
            System.out.printf("Address: %s%n%n", this.contacts[i].getAddress());
        }
    }
 
}


  
