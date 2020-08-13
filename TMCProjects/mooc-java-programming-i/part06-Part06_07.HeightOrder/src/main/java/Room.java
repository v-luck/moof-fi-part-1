import java.util.ArrayList;

public class Room {
    private ArrayList <Person> personList;

    public Room() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public boolean isEmpty() {
        if (this.personList.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList <Person> getPersons() {
        return this.personList;
    }

    public Person shortest() {
        if (this.personList.isEmpty()) {
            return null;
        }
        Person shortest = this.personList.get(0);

        for (Person person : this.personList) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if (this.personList.isEmpty()) {
            return null;
        }
        Person shortReturn = this.shortest();
        this.personList.remove(this.shortest());
        return shortReturn;
    }
}
