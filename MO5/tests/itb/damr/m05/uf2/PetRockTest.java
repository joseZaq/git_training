package itb.damr.m05.uf2;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PetRockTest {
    @Test
    void getNom() {
        PetRock rocky = new PetRock("Rocky");
        assertEquals("Rocky",rocky.getNom());
    }
    @Test
    void happyToStart(){
        PetRock rocky = new PetRock(true);
        assertTrue(rocky.isHappy());
    }
}