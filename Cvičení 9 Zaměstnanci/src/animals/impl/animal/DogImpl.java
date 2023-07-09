package animals.impl.animal;

import animals.Animal;



public class DogImpl implements Animal {

    private byte age;

    public DogImpl() {}

    public DogImpl(byte age) {
        super();
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DogImpl [age=" + age + "]";
    }

    @Override
    public String sound() {
        return null;
    }
}