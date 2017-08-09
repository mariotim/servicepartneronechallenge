package de.storecast.workforceoptimizer.utils;


import de.storecast.workforceoptimizer.utils.to.ResponseObject;
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
        ResponseObject to = RoomCapacitor.computeRequiredCapacity(35, 10, 6);
        Assert.assertTrue(to.getSeniors() == 3);
        Assert.assertTrue(to.getJuniors() == 1);

        to = RoomCapacitor.computeRequiredCapacity(21, 10, 6);
        Assert.assertTrue(to.getSeniors() == 1);
        Assert.assertTrue(to.getJuniors() == 2);

        to = RoomCapacitor.computeRequiredCapacity(17, 10, 6);
        Assert.assertTrue(to.getSeniors() == 2);
        Assert.assertTrue(to.getJuniors() == 0);

        to = RoomCapacitor.computeRequiredCapacity(24, 11, 6);
        Assert.assertTrue(to.getSeniors() == 2);
        Assert.assertTrue(to.getJuniors() == 1);

        to = RoomCapacitor.computeRequiredCapacity(28, 11, 6);
        Assert.assertTrue(to.getSeniors() == 2);
        Assert.assertTrue(to.getJuniors() == 1);

        to = RoomCapacitor.computeRequiredCapacity(39, 11, 8);
        Assert.assertTrue(to.getSeniors() == 3);
        Assert.assertTrue(to.getJuniors() == 1);

        to = RoomCapacitor.computeRequiredCapacity(10, 5, 3);
        Assert.assertTrue(to.getSeniors() == 2);
        Assert.assertTrue(to.getJuniors() == 0);

        to = RoomCapacitor.computeRequiredCapacity(12, 5, 3);
        Assert.assertTrue(to.getSeniors() == 2);
        Assert.assertTrue(to.getJuniors() == 1);
    }

}
