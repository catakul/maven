package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void Addition() {
        int sum = 5+5;


        int result = de.neuefische.Main.addierren(4, 5);
        assertEquals(sum, result  );
    }

}