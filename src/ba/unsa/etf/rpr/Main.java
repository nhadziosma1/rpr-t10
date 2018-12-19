package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static GeografijaDAO gdao;

    public static void main(String[] args)
    {
        System.out.println("Gradovi su:\n" + ispisiGradove());
        glavniGrad();
    }

    static String ispisiGradove()
    {
        gdao.getInstance();

        ArrayList<Grad> arl = gdao.gradovi();

        String povratni = new String();

        for(int i=0; i<arl.size(); i++)
        {
            povratni = povratni + arl.get(i).getNaziv()+" ("+arl.get(i).getDrzava().getNaziv()+") - "+arl.get(i).getBrojStanovnika()+"\n";
        }

        return  povratni;
    }

    static void glavniGrad()
    {

    }
}
