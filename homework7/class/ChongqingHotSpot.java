package HotSpotOrder;

public class ChongqingHotSpot extends HotSpot{
    private String name;

    public ChongqingHotSpot(String name) {
        this.name = name;
    }

    @Override
    public void ordered() {
        System.out.println(this.name);
    }

}
