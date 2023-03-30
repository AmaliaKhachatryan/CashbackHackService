package service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void remain1Test() {
        Assert.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void remain2Test() {
        Assert.assertEquals(service.remain(1), 999);
    }

    @Test
    public void remain3Test() {
        Assert.assertEquals(service.remain(100), 900);
    }

    @Test
    public void remain7Test() {
        Assert.assertEquals(service.remain(900), 100);
    }

    @Test
    public void remain4Test() {
        Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void remain6Test() {
        Assert.assertEquals(service.remain(500), 500);
    }
}