package Day5.MakeClass.Animal;

public class Animal {
    String name;
    int age;
    String gender;
    public  Animal(){}
    public  Animal (String name,int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Animal(String name){
        this.name = name;
    }
    public void animal(String name, int age ,String gender)
    {
        System.out.println(name+age+gender);
    }
    public void purchase(){
        System.out.println("구매하다");
    }
    public  void purchase(String product, int x)
    {
        System.out.println(this.name + "님이 "+product+"를"+x+"개 구매하다.");
    }
    public void pass(){
        System.out.println("통과하다");
    }
}
