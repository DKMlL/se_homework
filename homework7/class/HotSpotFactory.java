package HotSpotOrder;

public class HotSpotFactory {
    public static HotSpot orderHotSpot(String flavor) {
        HotSpot hotspot = null;
        switch (flavor) {
            case "SichuanHotSpot":
                hotspot = new SichuanHotSpot(flavor);
                break;
            case "ChongqingHotSpot":
                hotspot = new ChongqingHotSpot(flavor);
                break;
        }
        return hotspot;
    }
}
