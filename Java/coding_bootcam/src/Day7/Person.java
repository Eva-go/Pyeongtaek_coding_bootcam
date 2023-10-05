package Day7;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void show(){
        System.out.println("=================");
        System.out.println("이름: "+getName());
        System.out.println("나이: "+getAge());
        System.out.println("키: "+getHeight());
        System.out.println("몸무개: "+getWeight());
    }
    public void NameShow(){
        System.out.println(name);
    }
    public void goToWork(){
        System.out.println("출근하다");
    }

    public void work(){
        System.out.println("일한다.");
    }
}
