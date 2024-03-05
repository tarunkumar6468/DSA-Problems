package oops.staticExample;
class  obje{
    public static final int MAX = 100;
    private int value = 0;

    public void inc(){
        if( value < MAX ){
            ++value;
        }
        System.out.print(" " +value);
    }
    public int getValue(){
        return value;
    }
}

public class objectCall  {

    public static  void main(String[] args){
        obje c  = new obje();
        for(int i = 0 ; i<100; i++){
            c.inc();
        }

        System.out.println(c.getValue());
    }
}
