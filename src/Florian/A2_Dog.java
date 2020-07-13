package Florian;

public class A2_Dog {

    private String name;

    private int age;

    private int weight;

    private String race;


    A2_Dog() {
    }

    private void doWoof() {

        System.out.println("Woof!");

    }

    public void woofOut(){
        doWoof();
    }


    public int getAge() {
        return age;

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getRace() {
        return race;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int newAge) {

        this.age = newAge;

    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
