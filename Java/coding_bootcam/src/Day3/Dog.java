package Day3;

public class Dog {
    public String name;
    public String breeds;
    public double weight;

    public Dog(){
        System.out.println("디폴트 생성자 호출");
    }

    public Dog(String n){
        name =n;
        System.out.println("string 생성자");
    }
    public Dog(String n, String b, double w){
        name = n;
        breeds = b;
        weight = w;
        System.out.println("string, string, double 생성자");
    }

    public void eat(){
        System.out.println("강아지가 먹습니다.");
    }
    public void sit(){
        System.out.println("강아지가 앉았습니다.");
    }

}
