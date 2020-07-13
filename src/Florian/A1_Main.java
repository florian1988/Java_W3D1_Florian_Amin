package Florian;

public class A1_Main {
    public static void main(String[] args) {

        A1_Employee emp1 = new A1_Employee("Franz", "Ferdinand", "30.01.1970", 2550.3);
        A1_Employee emp2 = new A1_Employee( "Hermann", "Huber", "10.10.1971", 3000);



        //set method



        emp1.setName("Dorothea");
        emp2.setName("Susanne");

        emp1.setSalary(5000);
        emp2.setSalary(6000);

        emp1.output();
        System.out.println();
        emp2.output();


        //get method


        String name1 = emp1.getSurname();
        String name2 = emp2. getSurname();
        double salary1 = emp1.getSalary();
        double salary2 = emp2.getSalary();

        System.out.println();
        System.out.println("Surname: " + name1 + " Salary: " + salary1);
        System.out.println("Surname: " + name2 + " Salary: " + salary2);





    }
}
