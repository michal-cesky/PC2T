

public class Student {
    public Student(String jmeno, int rocnik) {
        this.jmeno=jmeno;
        this.rocnik=rocnik;
        studijniPrumer=1;
    }

    public String getJmeno()
    {
        return jmeno;
    }

    public int getRocnik()
    {
        return rocnik;
    }

    public float getStudijniPrumer() {
        return studijniPrumer;
    }

    public void setStudijniPrumer(float studijniPrumer) throws prumerException {
        if (studijniPrumer < 1|| studijniPrumer > 5)
            throw new prumerException("Zadan nespravny prumer");
        this.studijniPrumer = studijniPrumer;
    }

    private String jmeno;
    private int rocnik;
    private float studijniPrumer;
}