package Florian;
import java.util.*;


public class A3_Main {



    public static void main(String[] args) {


        A3_Student st1 = new A3_Student();
        A3_Student st2 = new A3_Student();
        A3_Student st3 = new A3_Student();
        A3_Student st4 = new A3_Student();



        st1.setName("Tom");
        st1.setAge("12");
        st1.setDateOfBirth("2008");
        st1.setHisClass("C1");

        st2.setName("Riddle");
        st2.setAge("64");
        st2.setDateOfBirth("1956");
        st2.setHisClass("A2");

        st3.setName("Dante");
        st3.setAge("201");
        st3.setDateOfBirth("1756");
        st3.setHisClass("D2");


        st4.setName("Dornei");
        st4.setAge("634");
        st4.setDateOfBirth("1256");
        st4.setHisClass("F2");

        String name1 = st1.getName();
        String age1 = st1.getAge();
        String dateOfBirth1 = st1.getDateOfBirth();
        String hisClass1 = st1.getHisClass();


        //st1.printit();


        System.out.println(name1 + " born in " + dateOfBirth1 + "  age " + age1 + " goes to  class " + hisClass1);

        System.out.println();


        A3_Student list[] = new A3_Student[4];

        list[0] = st1;
        list[1] = st2;
        list[2] = st3;
        list[3] = st4;


        for ( A3_Student i : list){
            i.printit();
        }

     ArrayList <A3_Student> tryit = new ArrayList<A3_Student>();

        tryit.add(st1);
        tryit.add(st2);
        tryit.add(st3);
        tryit.add(st4);

        //System.out.println(tryit.size());

        System.out.println();

        for(int i = 0; i < tryit.size(); i++){
        //System.out.println(tryit.get(i));

        tryit.get(i).printit();

        }

















    }



}
