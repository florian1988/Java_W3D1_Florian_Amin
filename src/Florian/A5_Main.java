package Florian;

import java.util.ArrayList;

public class A5_Main {

    public static void main(String[] args) {

    ArrayList<A5_Warehouse> d;


      A5_Warehouse thing = new A5_Warehouse();
        //thing.fillIt();

    d = thing.getInventory();

    //System.out.print(d.size());

        for(int i = 0; i < d.size(); i++){

            d.get(i).formatted();

        }





    }
}
