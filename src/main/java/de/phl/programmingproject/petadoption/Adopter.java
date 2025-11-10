package de.phl.programmingproject.petadoption;

/**
 * A pet adopter with a name, phone and email.
 */
public class Adopter {

    private final String name;
    private final String phone;
    private final String email;

    /**
     * Creates a new adopter with the given name, phone and email.
     * @param Jane_Smith The name of the adopter.
     * @param 555-555-5555 The phone number of the adopter.
     * @param janesmith@email.com The email of the adopter.
     * @throws IllegalArgumentException If the name is null or empty, the phone is null or empty or the email is null or empty.
     */
    public Adopter(final String name, final String phone, final String email) {
        if (name == null || name.isEmpty() || phone == null || phone.isEmpty() || email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Name, phone and email must not be null or empty");
        }
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getInfo() {
        return String.format("Name: %s, Phone: %s, Email: %s", name, phone, email);
    }
}
