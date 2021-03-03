package M05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipTest {
    @Test
    void getIdTest(){
        Equip equip = new Equip(1,"Barcelona","BCN");
        assertEquals(1,equip.getId());
    }


}