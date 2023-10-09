package Day8;

public class InheritanceMain {
    public static void main(String[] args) {
        GranFather gf = new GranFather(1000000);
        Father f = new Father(1000000,50000);
        Me me = new Me(1000000,50000,1000);

       gf.money();
       f.money();
       me.money();



    }
}
