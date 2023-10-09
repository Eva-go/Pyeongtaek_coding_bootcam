package Day8;

public class Father extends GranFather{
    private int stock;

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }


    public Father(int building, int stock) {
        super(building);
        this.stock = stock;
    }
    @Override
    public void money(){
        System.out.println(+getBuilding()+getStock());
    }
}
