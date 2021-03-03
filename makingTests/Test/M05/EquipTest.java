package M05;

import static org.junit.jupiter.api.Assertions.*;

class EquipTest {
    void getIdTest(){
        Equip equip = new Equip(1,"Barcelona","BCN");
        assertEquals(1,equip.getId());
    }

}