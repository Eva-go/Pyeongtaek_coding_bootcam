package Day4;

import java.security.PublicKey;

public class Person {
    private String name;
    private int age;
    final  int MINMUN_AGE =18;

    public String getName(){
        return name;
    }
    public  int getAge(){
        return age;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    public void setAge(int age){
        if(age >= MINMUN_AGE){
            this.age = age;
        }
        else System.out.println("나이는 0보다 커야합니다.+");
    }
}
