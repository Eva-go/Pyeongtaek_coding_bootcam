package Day5.MakeClass;

public class AddMain {
    public static void main(String[] args) {
        Add add = new Add();
        System.out.println("int : "+add.add(10));
        System.out.println("int , int : "+add.add(10,10));
        System.out.println("string , string :"+add.add("20","20"));
        System.out.println("double , double :"+add.add(10.0,20.0));

    }
}
