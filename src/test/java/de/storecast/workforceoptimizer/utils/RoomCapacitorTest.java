package de.storecast.workforceoptimizer.utils;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoomCapacitorTest {


    @Test
    public void testComputeRequiredCapacity() {
        TransferObject to = RoomCapacitor.computeRequiredCapacity(new TransferObject(35, 10, 6));
        Assert.assertTrue(to.getSeniors() == 3);
        Assert.assertTrue(to.getJuniors() == 1);

        to = RoomCapacitor.computeRequiredCapacity(new TransferObject(21, 10, 6));
        Assert.assertTrue(to.getSeniors() == 1);
        Assert.assertTrue(to.getJuniors() == 2);

        to = RoomCapacitor.computeRequiredCapacity(new TransferObject(17, 10, 6));
        Assert.assertTrue(to.getSeniors() == 2);
        Assert.assertTrue(to.getJuniors() == 0);

        to = RoomCapacitor.computeRequiredCapacity(new TransferObject(24, 11, 6));
        Assert.assertTrue(to.getSeniors() == 2);
        Assert.assertTrue(to.getJuniors() == 1);

        to = RoomCapacitor.computeRequiredCapacity(new TransferObject(28, 11, 6));
        Assert.assertTrue(to.getSeniors() == 2);
        Assert.assertTrue(to.getJuniors() == 1);
    }

}
