package Day3;

public class ClassExam {
    public static void main(String[] args) {
//        Car c1 = new Car();
//        Car c2 = new Car();
//        c1.name ="k9";
//        c1.num = 6666;
//        c2.name = "아반떼";
//        c2.num = 7777;
//        System.out.println("c1: "+c1.name+" "+c1.num);
//        System.out.println("c2: "+c2.name+" "+c2.num);
        Dog d1 =new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        d1.name = "차차";
        d1.breeds = "진돗개";
        d1.weight = 5.7;
        d2.name = "해피";
        d2.breeds = "골든리트리버";
        d2.weight = 3.9;
        d3.name = "투투";
        d3.breeds = "불독";
        d3.weight = 4.3;
        System.out.println("d1: "+d1.name+" "+d1.breeds+" "+d1.weight);
        System.out.println("d2: "+d2.name+" "+d2.breeds+" "+d2.weight);
        System.out.println("d3: "+d3.name+" "+d3.breeds+" "+d3.weight);
    }
}
