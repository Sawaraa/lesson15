import java.util.*;

public class Zooclub {

    Map<Person, List<Animal>> map;

    public Zooclub() {
        // Ініціалізуємо map в конструкторі класу
        this.map = new HashMap<>();
    }


    public void addPerson(String name, int age){

        map.put(new Person(name, age), new ArrayList<>());
        for(Map.Entry<Person, List<Animal>> entry : map.entrySet()){
            System.out.println(entry.getKey()+ "---->" + entry.getValue());
        }
    }

    public void addPet(String personName, String name, int age){

        Iterator<Map.Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Person, List<Animal>> next = iterator.next();
            Person person = next.getKey();
            if(person.getName().equals(personName)){
                List<Animal> value = next.getValue();
                value.add(new Animal(name, age));
                next.setValue(value);
            }
            else {System.out.println("Yчасника "+ personName+" не існує");}

            for(Map.Entry<Person, List<Animal>> entry : map.entrySet()){
                System.out.println(entry.getKey()+ "---->" + entry.getValue());
            }
        }

    }

    public void deletePet(String personName, String petName){

        Iterator<Map.Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Person, List<Animal>> next = iterator.next();
            Person person = next.getKey();
            if (person.getName().equals(personName)) {
                List<Animal> animal = next.getValue();
                Iterator<Animal> iterator1 = animal.iterator();
                while (iterator1.hasNext()){
                    Animal next1 = iterator1.next();
                    if(next1.getName().equals(petName)){
                        System.out.println("Ви успішно видалили цю " + petName + " тваринку");
                        iterator1.remove();
                    }else{System.out.println("Такої тавирнки не існує");}
                }


            } else {
                System.out.println("Yчасника " + personName + " не існує");
            }

            for(Map.Entry<Person, List<Animal>> entry : map.entrySet()){
                System.out.println(entry.getKey()+ "---->" + entry.getValue());
            }
        }
    }

    public void deletePerson(String personName){

        Iterator<Map.Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Person, List<Animal>> next = iterator.next();
            Person person = next.getKey();
            if (person.getName().equals(personName)) {
                System.out.println("Ви успішно видалили цього " + personName + " учасника");
                iterator.remove();
            }
            else { System.out.println("Yчасника " + personName + " не існує");}

        }
    }

    public void deleteSpecificallyPet(String petName){

        Iterator<Map.Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Person, List<Animal>> next = iterator.next();
            List<Animal> animal = next.getValue();
            Iterator<Animal> iterator1 = animal.iterator();

            while (iterator1.hasNext()) {
                Animal next1 = iterator1.next();
                if (next1.getName().equals(petName)) {
                    System.out.println("Ви успішно видалили цю " + petName + " тваринку від " + next.getKey().getName());
                    iterator1.remove();
                } else {
                    System.out.println("Такої тваринки не існує у " + next.getKey().getName());
                }
            }
        }
    }

    public void outputAll(){

        for(Map.Entry<Person, List<Animal>> entry : map.entrySet()){
            System.out.println(entry.getKey()+ "---->" + entry.getValue());
        }
    }


}
