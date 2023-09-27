package Day5.MakeClass;

public class UserMain {
    public static void main(String[] args) {
        User u1 = new User("김", 18, "010-1234-5678", "남성");
        User u2 = new User("최", 23, "010-1111-2222", "여성");
        User u3 = new User("조", 27, "010-9876-5432", "남성");
        User u4 = new User();
        User u5 = new User();

        String pa;
        pa = u1.pay();
        System.out.println(u1.name+pa);
        int pass = u1.pass(3,5);
        System.out.println(pass);
        System.out.println(u2.pass("안녕","하세요"));
    }


}
