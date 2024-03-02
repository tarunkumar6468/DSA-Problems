package oops.staticExample;

public class main {
    public static void main(String[] args){
        human  tarun = new human(22,"tarun",100009,false);
        human  karan = new human(21,"karan",10099,true);
        human  arjun = new human(32,"arjun",1000229,true);
        System.out.println(tarun.name);
        System.out.println(karan.salary);

        System.out.println(tarun.population);//iske liye bhi population 3 sbke liye population 3
        System.out.println(karan.population); // because population is static variable so that's
        System.out.println(arjun.population);// it's all of them store the value to each other
    }
}
