package Day8.AreaInterfce;

public class VegetableTempura extends SnackBar implements FriedFoodable{
    @Override
    public void fry() {
        super.SnackBar();
        System.out.println("야채튀김 튀기다");
    }
}
