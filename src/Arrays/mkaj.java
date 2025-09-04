package Arrays;

public class mkaj {
    int y = 20;
    int x = 10;
    void mm(){
        x++;
        y++;
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        mkaj m = new mkaj();
        mkaj m1 = new mkaj();

        m.mm();
        m1.mm();
        System.out.println(m.x+ " "+ m.y);
        System.out.println(m1.x+ " "+ m1.y);
        System.out.println(new mkaj().x);
        System.out.println(new mkaj().y);

    }
}
