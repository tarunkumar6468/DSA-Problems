package oops.staticExample;

public class human {
    int age;
    String name;
    int salary;
    boolean married;
   static int population;  

    public human(int age,String name, int salary,boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        human.population +=1;

    }

}
