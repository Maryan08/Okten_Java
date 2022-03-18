package Task3.classwork;

import lombok.*;

import java.util.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor

public class Zooclub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    public Map<Person, List<Pet>> getClub() {
        return club;
    }

    public void setClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    public void addZoo(Person person, List<Pet> pet) {
        club.put(person, pet);
    }

    public void addAnimal(Person person, String s) {
        Iterator<Map.Entry<Person, List<Pet>>> iterator = club.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> iter = iterator.next();
            if (iter.getKey() == person) {
                List<Pet> pet = iter.getValue();
                pet.add(new Pet(s));
                club.replace(person, pet);
            }
        }
    }

    public void deleteAnimal(Person person, String s) {
        Iterator<Map.Entry<Person, List<Pet>>> iterator = club.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> iter = iterator.next();
            if (iter.getKey() == person) {
                List<Pet> pets = iter.getValue();
                Pet pet = new Pet(s);
                pets.remove(pet);
                club.replace(person, pets);
            }
        }
    }

    public void deleteMember(Person person) {
        Iterator<Map.Entry<Person, List<Pet>>> iterator = club.entrySet().iterator();
        List<Pet> pets = new ArrayList<>();
        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> iter = iterator.next();
            if (iter.getKey() == person) {
                pets = iter.getValue();

            }
        }

        club.remove(person);
        club.put(null, pets);

    }

    public void deleteFromAll(String s) {
        Iterator<Map.Entry<Person, List<Pet>>> iterator = club.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> iter = iterator.next();
            List<Pet> pets = iter.getValue();
            List<Pet>deletePet=new ArrayList<>();
            for (Pet pet : pets
            ) {
                if (pet.getName()==s) {
                    deletePet.add(pet);

                }

            }
            pets.removeAll(deletePet);
            club.replace(iter.getKey(), pets);

        }
    }
}
