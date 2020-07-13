package Florian;

public class A2_Main {

    public static void main(String[] args) {

        A2_Dog dog1 = new A2_Dog();
        A2_Dog woof = new A2_Dog();

        dog1.setName("Goofy");
        dog1.setAge(5);
        dog1.setRace("Bernhardiener");
        dog1.setWeight(45);


        woof.woofOut();

        int dog1Age = dog1.getAge();
        String dog1Name = dog1.getName();
        String dog1Race = dog1.getRace();
        int dog1Weight = dog1.getWeight();

        System.out.println("Name: " + dog1Name + " Age: " + dog1Age + " Race: " + dog1Race + " Weight: " + dog1Weight);



    }
}
