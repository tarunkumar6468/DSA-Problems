package oops;

class Scaler
{
    static int i;

    static
    {
        System.out.println('a');

        i = 100;
    }
}
class StaticBlock
{
    static
    {
        System.out.println('b');
    }

    public static void main(String[] args)
    {
        System.out.println('c');

        System.out.println(Scaler.i);
    }
}
