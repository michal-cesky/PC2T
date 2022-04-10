import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import animals.AbstractAnimal;
import animals.Animal;
import animals.impl.abstractanimal.Cat;
import animals.impl.abstractanimal.Cow;
import animals.impl.abstractanimal.Dog;
import animals.impl.abstractanimal.Goat;
import animals.impl.abstractanimal.Pig;
import animals.impl.animal.CatImpl;
import animals.impl.animal.CowImpl;
import animals.impl.animal.DogImpl;
import animals.impl.animal.GoatImpl;
import animals.impl.animal.PigImpl;
import java.io.*;
import enums.EmployeeType;
/*
* @author Michal Cesky
* abstraktní třída nemusíobsahovat abstarktní metody. Skrývá nerelevantní detaily od uživatele
*
* rozhraní není třída použití pro více dědičností  pro hierarchii tříd je to sbírkaabstarktních metod
* obsahuje plnou abstrakci
*
*
*/





public class App {

    public static void main(String[] args) {
        List<Employee> listOfEmployees = createEmployeeList();
        Collections.sort(listOfEmployees);

        Secretarian s = new Secretarian("Radek", "radek@gmail.com", "radek123".toCharArray(), EmployeeType.ACTIVE, 30);
        Manager<Secretarian> m1 = new Manager<>();
        m1.setListOfEmployees(listOfEmployees);
        m1.addRelationship(s);
        m1.printAllEmployeesAndRelationships();

        System.out.println(System.lineSeparator());

        List<AbstractAnimal> aAnimals = getAnimals();
        aAnimals.forEach(animal -> System.out.println(animal.sound()));


    }

    public static List<Employee> createEmployeeList() {
        Employee e1 = new Employee("Michal", "michal@gmail.com", "123456".toCharArray(), EmployeeType.ACTIVE);
        Employee e2 = new Employee("Karel", "karel@gmail.com", "654321".toCharArray(), EmployeeType.ACTIVE);
        Employee e3 = new Employee("Jiri", "jiri@gmail.com", "qwertzuiop".toCharArray(), EmployeeType.ACTIVE);
        Employee e4 = new Employee("Natalie", "natalie@gmail.com", "ahoj".toCharArray(), EmployeeType.ACTIVE);
        Employee e5 = new Employee("Monika", "monika@gmail.com", "hufbfdbdfvrdf".toCharArray(), EmployeeType.ACTIVE);
        return Arrays.asList(e1, e2, e3, e4, e5);
    }

    public static List<AbstractAnimal> getAnimals() {
        AbstractAnimal cat = new Cat();
        AbstractAnimal cow = new Cow();
        AbstractAnimal dog = new Dog();
        AbstractAnimal goat = new Goat();
        AbstractAnimal pig = new Pig();
        return Arrays.asList(cat, cow, dog, goat, pig);
    }

    public static List<Animal> getAnimalsInterface() {
        Animal cat = new CatImpl((byte) 25);
        Animal cow = new CowImpl((byte) 20);
        Animal dog = new DogImpl((byte) 10);
        Animal goat = new GoatImpl((byte) 20);
        Animal pig = new PigImpl((byte) 50);
        return Arrays.asList(cat, cow, dog, goat, pig);
    }

}
