package src;
public class Ctverec            //dostupnost
{

    private float hrana;
    // vypocet obsahu ctverce
    float vypoctiObsah(){
        return (int)(hrana*hrana);
    }           //saptny vzorec
    // zjisteni delky hrany ctverce
    float getHrana(){
        return hrana;
    }
    // nastaveni delky hrany ctverce
    void setHrana(float delka){
        hrana=delka;
    }
    // konstruktor se zadanim delky hrany ctverce
    Ctverec(float hrana){
        this.hrana=hrana;               //ukazka na konstruktor
    }
}
