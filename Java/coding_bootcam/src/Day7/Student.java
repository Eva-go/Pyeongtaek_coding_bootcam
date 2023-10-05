package Day7;

public class Student extends Person {
    private int studentID;

   public Student(){
   }
    public Student(String name,int age, int height,int weight,int studentID){
        super(name,age,height,weight);
        this.studentID =studentID;
    }

    public Student(int studentID) {
        this.studentID = studentID;
    }



    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public int getStudentID() {
        return studentID;
    }

    @Override
        public void show(){
        System.out.println("학번"+studentID);
    }

    @Override
    public void work(){
        System.out.println("일할꺼다!");
    }
}
