package Day3;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog("해피");
        Dog dog3 = new Dog("치치","불독",7.7);

        System.out.println(dog.name+" "+dog.breeds+" "+dog.weight);
        dog.eat();
        dog.sit();
        System.out.println(dog2.name+" "+dog2.breeds+" "+dog2.weight);
        dog2.eat();
        dog2.sit();
        System.out.println(dog3.name+" "+dog3.breeds+" "+dog3.weight);
        dog3.eat();
        dog3.sit();
    }
}
