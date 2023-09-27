package Day5.MakeClass;

public class User {
    //필드
    String name;
    int age;
    String phone;
    String gender;
    //생성자
    public User(){

    }
    public User(String name,int age, String phone,String gender){
     this.name =name;
     this.age =age;
     this.phone =phone;
     this.gender = gender;
    }
    //메서드
    public void purchase (String name){
        System.out.println(name+"님");
    }
    public void purchase (String name, int age){
        System.out.println(name+"님은 나이가: "+age+"입니다.");
    }
    public void pay(String name){
        System.out.println(name+"님이 계산하다.");
    }
    public String pay(){
        return "님~~~ 안녕하세요!";
    }

    public void addCart(){
        System.out.println(name+"님이 장바구니에 추가하다");
    }

    public String pass(String x,String y){
        return x+y;
    }

    public int pass(int x, int y){
        return x*y;
    }
}
