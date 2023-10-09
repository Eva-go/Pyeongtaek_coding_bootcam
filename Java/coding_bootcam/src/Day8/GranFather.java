package Day8;

public class GranFather {
    public GranFather(int building) {
        this.building = building;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    private int building;

    public void money(){
        System.out.println(+getBuilding());
    }
}
