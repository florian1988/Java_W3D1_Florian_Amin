package Florian;

public class A3_Student {


    private String name;
    private String age;
    private String dateOfBirth;
    private String hisClass;

    A3_Student(){

    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getHisClass() {
        return hisClass;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setHisClass(String hisClass) {
        this.hisClass = hisClass;
    }


    public void printit(){
        System.out.println("Name: " + name + " age: " +  age + "  born in: "+ dateOfBirth + " goes to class " + hisClass );
    }



}

