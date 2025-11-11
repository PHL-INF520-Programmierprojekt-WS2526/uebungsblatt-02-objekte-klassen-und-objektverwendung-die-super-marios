package de.phl.programmingproject.petadoption;

import java.util.Date;

/**
 * PUT YOUR CODE FOR THE EXERCISE 'Pet Adoption Center' HERE.
 */
public class Main {
    public static void main(String[] args) {
        // TODO implement your program here
        Pet buddy = new Pet("Buddy", 3, "Labrador Retriever");
        System.out.println(buddy.getInfo());

        Adopter Jane_Smith = new Adopter("Jane Smith", "555-555-5555", "janesmith@email.com");
        System.out.println(Jane_Smith.getInfo());

        boolean Adopted = buddy.isAdopted();
        System.out.println("Wurde das Tier adoptiert?");
        System.out.println(buddy.isAdopted());

        Adoption adoption = buddy.adopt(Jane_Smith, new Date ());
        System.out.println(adoption.getInfo());

        System.out.println(buddy.isAdopted());
    }
}