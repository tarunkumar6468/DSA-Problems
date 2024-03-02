package oops;

class student{
    String name;
    int roll;
    double marks;

    void greeting(){
        System.out.println("hey i am "+name+" and my roll num is "+roll +
                " & and my marks is "+marks);
    }

    void changeName(String newName){
        name = newName;
    }
    public student(){
        this.name = "deepanshu" ;
        this.roll = 23324;
        this.marks = 23920349.3;
    }
        }
public class introduction {
public static void main(String[] args) {


    String name[] = new String[5];
    int roll[] = new int[5];
    double marks[] = new double[5];
    student st1 = new student();
    student st2 = new student();




    st2.name = "varun";
    st2.roll = 2344;
    st2.marks = 323.4;
    System.out.println(st2.name);
    System.out.println(st2.roll);
    System.out.println(st2.marks);


    st1.name = "tarun";
    st1.roll = 122;
    st1.marks = 97.3;

    System.out.println(st1.name);
    System.out.println(st1.roll);
    System.out.println(st1.marks);
    st1.greeting();

    st2.changeName("football lover");

    st2.greeting();

    }
}
