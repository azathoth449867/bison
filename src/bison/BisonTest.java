package bison;

import java.time.Month;
import java.time.YearMonth;

import static org.junit.jupiter.api.Assertions.*;

class BisonTest {
    private Bison bebe;
    private Bison adulte;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.bebe = new Bison("A1",25);
        this.adulte = new Bison("A2",450, YearMonth.of(2020, Month.JULY));
    }

    @org.junit.jupiter.api.Test
    void estUnBebe() {
        assertTrue(this.bebe.estUnBebe());
        assertEquals(false, this.adulte.estUnBebe());
    }

}