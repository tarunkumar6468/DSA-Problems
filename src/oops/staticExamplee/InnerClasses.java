package oops.staticExamplee;
//class text{
//    static String name;
//    public text(String name ){
//        this.name = name;
//    }

//  OUT SIDE ME CLASS BNANE PR ONLY RAHUL PRINT KR RHA H BUT

public class InnerClasses {
     static  class text{
         String name;
         public text(String name ){
             this.name = name;
    }

    // YHA PR TARUN OR RAHUL PRINT KAR RHA H



    }
    public static void main(String[] args){
         text a = new text("tarun");
         text b = new text("Rahul");
         System.out.println(a.name);
         System.out.println(b.name);
    }

}
