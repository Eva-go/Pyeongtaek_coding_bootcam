package Day8;

public class Me extends Father{

    private int cash;

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public Me(int building, int stock, int cash) {
        super(building, stock);
        this.cash = cash;
    }
@Override
    public void money(){
        System.out.println(getCash()+getBuilding()+getStock());
    }
}
