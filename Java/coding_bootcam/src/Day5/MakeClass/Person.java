package Day5.MakeClass;

public class Person {
    //필드(변수)영역
    String name;
    String phoneNumber;
    String email;

    //생성자 영역
    public Person(){} //Default

    public Person (String name) {
        this.name =name;
    }
    public Person(String name,String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public Person(String name, String phoneNumber, String email){
        this.name=name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //메소드 영역 (함수영역)
    public void purchase(){
        System.out.println("구매하다");
    }
    public  void purchase(String product, int x)
    {
        System.out.println(this.name + "님이 "+product+"를"+x+"개 구매하다.");
    }
    public String parking(){
        //System.out.println("주차하다");
        return this.phoneNumber;
    }
    public void pass(){
        System.out.println("통과하다");
    }
}
