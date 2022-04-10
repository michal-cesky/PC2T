package animals.impl.animal;

import animals.Animal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class CowImpl implements Animal {


    private byte age;

    public CowImpl() {}

    public CowImpl(byte age) {
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
        return "CowImpl [age=" + age + "]";
    }

    @Override
    public String sound() {
        return null;
    }
}