package src;
public class Hranol extends Ctverec {       //preklep

    // konstruktor se zadanim delky hrany, vysky a materialu
    Hranol(float podstava,float vyska, boolean drevena){
        super(vyska);                                    //volani konstruktoru nadrazene tridy
        hrana=vyska;
        zeDreva=drevena;
        pocetHranolu++;             //nestaticka promena
    }

    // vypocet objemu hranolu
    float vypoctiObjem() {
        return this.hrana*hrana;
    }       //vzorec

    // nastaveni materialu
    void setDreveny(boolean dreveny){
        zeDreva=dreveny;
    }

    // zjisteni materialu
    boolean jeDreveny(){
        return this.zeDreva;
    }

    // zjisteni celkoveho poctu existujicich kostek
    public static int getPocetHranolu(){           //dostupnost
        return pocetHranolu;
    }

    // zjisteni vysky hranolu
    float getHrana(){
        return hrana;
    }
    // nastaveni vysky hranolu
    void setHrana(float delka){
        hrana=delka;
    }

    private float hrana;
    boolean zeDreva;
    static int pocetHranolu = 0;  //volanii nestaticke metody
}
