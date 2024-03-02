package by.korneenko.cashback;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        double excepted = 1000;
        double actual = service.remain(2000);
        assertEquals(actual,excepted);
    }

    @Test
    public void testTrue() {
        CashbackHackService service = new CashbackHackService();
        double excepted = 800;
        double actual = service.remain(200);
        assertEquals(actual,excepted);
    }

    @Test
    public void testFalse() {
        CashbackHackService service = new CashbackHackService();
        double excepted = 1000;
        double actual = service.remain(-5);
        assertEquals(actual,excepted);
    }

    @Test
    public void testFalse2() {
        CashbackHackService service = new CashbackHackService();
        double excepted = 0;
        double actual = service.remain(2032);
        assertEquals(actual,excepted);
    }
}