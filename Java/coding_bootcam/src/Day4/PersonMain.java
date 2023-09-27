package Day4;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("김");
        String name1 =p1.getName();
        p1.setAge(28);
        int age1 = p1.getAge();
        System.out.println(name1);
        System.out.println(age1);
    }
}
