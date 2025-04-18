/* This is a stub for the House class */
import java.util.ArrayList;
/**
 * The House class represents a residential building that can house students.
 * It tracks residents and whether the house includes a dining room.
 *
 * Extends the Building class and implements HouseRequirements.
 */

public class House extends Building implements HouseRequirements {


    private ArrayList<Student> residents;
    private boolean hasDiningRoom;

/**
 * Constructs a new House with the given name, address, number of floors,
 * and whether it has a dining room.
 *
 * @param name the name of the house
 * @param address the address of the house
 * @param nFloors the number of floors
 * @param hasDiningRoom true if the house has a dining room
 */

    public House(String name, String address, int nFloors, boolean hasDiningRoom) {
        super(name, address, nFloors);
        this.residents = new ArrayList<Student>();
        this.hasDiningRoom = hasDiningRoom;
        System.out.println("You have built a house: 🏠");
    }
/**
 * Checks if the house has a dining room.
 *
 * @return true if it has a dining room, false otherwise
 */

    public boolean hasDiningRoom() {
        return this.hasDiningRoom;
    }
/**
 * Returns the number of current residents in the house.
 *
 * @return number of residents
 */
    public int nResidents() {
        return this.residents.size();
    }
/**
 * Moves a student into the house if they are not already a resident.
 *
 * @param s the student to move in
 */

    public void moveIn(Student s) {
        if (!this.residents.contains(s)) {
            this.residents.add(s);
            System.out.println(s.getName() + " has moved into " + this.name + ".");
        } else {
            System.out.println(s.getName() + " is already a resident.");
        }
    }
/**
 * Moves a student out of the house if they are a resident.
 *
 * @param s the student to move out
 * @return the student who moved out, or null if not found
 */

    public Student moveOut(Student s) {
        if (this.residents.contains(s)) {
            this.residents.remove(s);
            System.out.println(s.getName() + " has moved out of " + this.name + ".");
            return s;
        } else {
            System.out.println(s.getName() + " is not a resident.");
            return null;
        }
    }
/**
 * Checks whether a student is a resident of the house.
 *
 * @param s the student to check
 * @return true if the student is a resident, false otherwise
 */

    public boolean isResident(Student s) {
        return this.residents.contains(s);
    }

    public static void main(String[] args) {
        Student s = new Student("Ab", "9909abc", 2014);
        House h = new House("Chase House", "123 College Lane", 3, true);
        h.moveIn(s);
        System.out.println("Residents: " + h.nResidents());
        System.out.println("Has dining room? " + h.hasDiningRoom());
        h.moveOut(s);
        System.out.println("Is still resident? " + h.isResident(s));
    }
}