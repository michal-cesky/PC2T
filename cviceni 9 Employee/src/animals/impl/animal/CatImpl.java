package animals.impl.animal;

import animals.Animal;

public class CatImpl implements Animal {

    private byte age;

    public CatImpl() {}

    public CatImpl(byte age) {
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
        return "CatImpl [age=" + age + "]";
    }

  /*  @Override
    public String sound() {
      return "mnau";
    }*/

    @Override
    public String sound() {
        return null;
    }
}