package service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();
    @Test
    public void remain5Test() {
        Assert.assertEquals(0, service.remain(1000));
    }
    @Test
    public void remain1Test() {
        Assert.assertEquals(1000, service.remain(0));
    }

    @Test
    public void remain2Test() {
        Assert.assertEquals(999, service.remain(1));
    }
    @Test
    public void remain3Test() {
        Assert.assertEquals(900, service.remain(100));
    }
    @Test
    public void remain7Test() {
        Assert.assertEquals(100, service.remain(900));
    }
    @Test
    public void remain4Test() {
        Assert.assertEquals(1, service.remain(999));
    }
    @Test
    public void remain6Test() {
        Assert.assertEquals(500, service.remain(500));
    }
}