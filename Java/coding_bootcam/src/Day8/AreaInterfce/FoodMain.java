package Day8.AreaInterfce;

public class FoodMain {
    public static void main(String[] args) {
        FriedFoodable[] food = new FriedFoodable[2];
        food[0] = new SourPork();
        food[1] = new VegetableTempura();
        for (int i=0; i<food.length;i++){
            food[i].fry();
        }
    }
}
