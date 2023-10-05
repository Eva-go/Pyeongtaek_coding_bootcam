package Day7;


public class StudentMain {
    public static void main(String[] args) {
        Person[] ps = new Person[5];
        for(int i=0; i<3; i++){
            ps[i]= new Person();
        }
        ps[0].setName("김");
        ps[1].setName("최");
        ps[2].setName("박");

        for(int i=0; i<3; i++){
            ps[i].NameShow();
        }

    }
}
