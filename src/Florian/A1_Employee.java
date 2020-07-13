package Florian;

public class A1_Employee {

    private String name;
    private final String surname;
    private final String yearOfBirth;
    private double salary;

   A1_Employee(String n, String s, String y, double sa){
        this.name = n;
        this.surname = s;
        this.yearOfBirth = y;
        this.salary = sa;


    }

    // get method

    public double getSalary() {
        return this.salary;
    }


    public String getSurname() {
        return this.surname;
    }


    //set method

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




    public void output(){
    System.out.println("Name: " + name);
    System.out.println("Surname: " + surname);
    System.out.println("Year of Birth: " + yearOfBirth);
    System.out.println("Salary: " + salary);

    }




}
