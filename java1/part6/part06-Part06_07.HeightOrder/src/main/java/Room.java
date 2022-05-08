/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        // return a null reference if there's no one on the ride
        if (this.persons.isEmpty()) {
            return null;
        }

        // create an object reference for the object to be returned
        // its first value is the first object on the list
        Person returnObject = this.persons.get(0);

        // go through the list
        for (Person prs : this.persons) {
            // compare each object on the list
            // to the returnObject -- we compare heights
            // since we're searching for the smallest

            if (returnObject.getHeight() > prs.getHeight()) {
                // if we find a taller person in the comparison,
                // we assign it as the value of the returnObject
                returnObject = prs;
            }
        }

        // finally, the object reference describing the
        // return object is returned
        return returnObject;
    }
    
    public Person take() {
        // return a null reference if there's no one on the ride
        if (this.persons.isEmpty()) {
            return null;
        }

        // create an object reference for the object to be returned
        Person returnObject = this.shortest();
        
        //removing this from the list
        
//        for (Person person: persons) {
//            if( person.getName() == returnObject.getName()) {
//                persons.remove(person);
//            }
//        }
        
        persons.remove(returnObject);
        
        return returnObject;
    }

}
