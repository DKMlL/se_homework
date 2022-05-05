package HotSpotOrder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotSpotFactoryTest {

    @Test
    void orderHotSpot() {
        HotSpot hotspot1 = HotSpotFactory.orderHotSpot("SichuanHotSpot");
        hotspot1.ordered();

        HotSpot hotspot2 = HotSpotFactory.orderHotSpot("ChongqingHotSpot");
        hotspot2.ordered();
    }
}