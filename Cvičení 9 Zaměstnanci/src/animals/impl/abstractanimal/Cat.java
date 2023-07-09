package animals.impl.abstractanimal;

import animals.AbstractAnimal;

public class Cat extends AbstractAnimal {

    @Override
    public String sound() {
        return "Kocka dela: Mnau";
    }

    @Override
    public String toString() {
        return "Cat [age=" + age + "]";
    }

}
