package Prelim;

public class encapsulationOOP {

    private String namePerson;

    public String getName() {       // Getter Method for name
        return namePerson;
    }

    public void setName(String namePerson) {        // Setter Method for name
        this.namePerson = namePerson;
    }

    public static void main(String[] args) {
        encapsulationOOP objPerson = new encapsulationOOP();    // Instantiate objPerson

//      set value using setter method
        objPerson.setName("Marchilyn Abunda");

//      Display name using getter method
        System.out.println(objPerson.getName());

    }

}
