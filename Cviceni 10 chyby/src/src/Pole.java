package src;

import java.util.Scanner;

public class Pole {
    public Pole(int velikost)
    {
        mojeHranoly=new Hranol[velikost];
        sc=new Scanner(System.in);
    }

    // vlozeni hranolu do pole na prvni volnou pozici
    public void zadejHranol(){
        boolean drevena=false;
        float delka=0;
        float vyska=0;
        System.out.println("Zadejte delku podstavy hranolu");
        while(!sc.hasNextFloat())
        {
            sc.next();
        }
        delka=sc.nextFloat();
        System.out.println("Zadejte vysku hranolu");
        while(!sc.hasNextFloat())
        {
            sc.next();
        }
        vyska=sc.nextFloat();
        System.out.println("Je drevena?");
        while(!sc.hasNextBoolean())                           //typ bool ne float
        {
            sc.next();
        }
        drevena=sc.nextBoolean();
        if (Hranol.getPocetHranolu()>mojeHranoly.length)
        {
            System.out.println("Pole uz je zaplneno");
            return;
        }
        mojeHranoly[Hranol.getPocetHranolu()] = new Hranol(delka,vyska,drevena);

        /*mojeHranoly[Hranol.getPocetHranolu()].setHrana(delka);
        mojeHranoly[Hranol.getPocetHranolu()].setHrana(vyska);
        mojeHranoly[Hranol.getPocetHranolu()].setDreveny(drevena);*/
    }

    // vypis objemu vsech hranolu
    public void vypoctiObjem()
    {
        for (int i=0;i<Hranol.getPocetHranolu();i++)
            System.out.println("Objem " + (i + 1)+ " hranolu je " + mojeHranoly[i].vypoctiObjem());  //spatne zadani promene do vypisu
    }

    // vypis obsahu podstavy vsech hranolu
    public void vypoctiObsahPodstavy()
    {
        for (int i=0;i<Hranol.getPocetHranolu();i++)
            System.out.println("Obsah " + (i + 1) + " hranolu je " + mojeHranoly[i].vypoctiObsah()); //spatne zadani promene do vypisu
    }

    // nalezeni indexu nejmensiho hranolu
    public int najdiNejmensiObjem()
    {
        float min=mojeHranoly[0].vypoctiObjem();                                              //min=0; nenastala podmínka
        //int idx=0;
        for (int i=0;i<Hranol.getPocetHranolu();i++)
        {
            if (mojeHranoly[i].vypoctiObjem()<min){
                min=mojeHranoly[i].vypoctiObjem();
                idx=i;
            }
        }
        return idx;
    }

    // zjisteni celkoveho poctu drevenych kostek
    public int zjistiPocetDrevenych(){

        for (int i=0;i<mojeHranoly.length; i++)                 //musi se zacit nulou, cyklus i++
        {
            if (mojeHranoly[i].jeDreveny())                //= true
                pocetDrevenych++;
        }
        return pocetDrevenych;
    }

    private Scanner sc;
    private Hranol []mojeHranoly;
    int idx=0;
    int pocetDrevenych=0;
}
