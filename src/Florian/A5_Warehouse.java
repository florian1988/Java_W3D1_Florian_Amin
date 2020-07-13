package Florian;

import java.util.ArrayList;

public class A5_Warehouse {

    private String article;
    private int amount;



    A5_Warehouse(String article, int amount){
        this.article = article;
        this.amount = amount;

    }
    A5_Warehouse(){

    }

        public void formatted(){

        System.out.println("Article: " + article + " Amount: " + amount );

        }
        private ArrayList<A5_Warehouse> inventory = new ArrayList<A5_Warehouse>();


        private void fillIt(){
            A5_Warehouse thing1 = new A5_Warehouse("basket", 30);
            A5_Warehouse thing2 = new A5_Warehouse("ball", 59);
            A5_Warehouse thing3 = new A5_Warehouse("bird", 8);


            inventory.add(thing1);
            inventory.add(thing2);
            inventory.add(thing3);


        }


    public ArrayList<A5_Warehouse> getInventory() {
        fillIt();
        return new ArrayList<A5_Warehouse>(inventory);
    }
}



