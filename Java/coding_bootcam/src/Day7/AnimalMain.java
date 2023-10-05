package Day7;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Cat();
        animal[1] = new Cow();
        animal[2] = new Dog();

        for(int i=0; i<3; i++){
            animal[i].speak();
        }
    }
}
