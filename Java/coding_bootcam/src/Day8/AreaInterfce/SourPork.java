package Day8.AreaInterfce;

public class SourPork extends ChinaFood implements FriedFoodable{
    @Override
    public void fry() {
        super.ChinaFood();
        System.out.println("탕수육을 튀기다");
    }
}
