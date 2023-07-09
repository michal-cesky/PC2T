package animals.impl.abstractanimal;

import animals.AbstractAnimal;

public class Dog extends AbstractAnimal {


    @Override
    public String sound() {
        return "Pes dela: haf haf";
    }

    @Override
    public String toString() {
        return "Dog [age=" + age + "]";
    }

}