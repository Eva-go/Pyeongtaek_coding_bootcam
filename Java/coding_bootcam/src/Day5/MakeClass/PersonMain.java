package Day5.MakeClass;

public class PersonMain {
    public static void main(String[] args) {
        //Person 객체 생성
        Person p1 = new Person("김","010-1234-5678","aaa@naver.com");
        Person p2 = new Person("최","010-9876-5432","bbb@naver.com");
        System.out.println(p1.name+p1.phoneNumber+p1.email);
        System.out.println(p2.name+p2.phoneNumber+p2.email);
        String pa = p1.parking();
        System.out.println(p1.name+pa);

        p1.purchase();
    }
}
