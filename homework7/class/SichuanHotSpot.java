package HotSpotOrder;

public class SichuanHotSpot extends HotSpot {
    private String name;

    public SichuanHotSpot(String name) {
        this.name = name;
    }

    @Override
    public void ordered() {
        System.out.println(this.name);
    }
}
