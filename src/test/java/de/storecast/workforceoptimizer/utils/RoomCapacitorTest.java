package de.storecast.workforceoptimizer.utils;


import de.storecast.workforceoptimizer.utils.to.RequestObject;
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
        ResponseObject to = RoomCapacitor.computeRequiredCapacity(new RequestObject(35, 10, 6));
        Assert.assertTrue(to.getSeniors() == 3);
        Assert.assertTrue(to.getJuniors() == 1);

        to = RoomCapacitor.computeRequiredCapacity(new RequestObject(21, 10, 6));
        Assert.assertTrue(to.getSeniors() == 1);
        Assert.assertTrue(to.getJuniors() == 2);

        to = RoomCapacitor.computeRequiredCapacity(new RequestObject(17, 10, 6));
        Assert.assertTrue(to.getSeniors() == 2);
        Assert.assertTrue(to.getJuniors() == 0);

        to = RoomCapacitor.computeRequiredCapacity(new RequestObject(24, 11, 6));
        Assert.assertTrue(to.getSeniors() == 2);
        Assert.assertTrue(to.getJuniors() == 1);

        to = RoomCapacitor.computeRequiredCapacity(new RequestObject(28, 11, 6));
        Assert.assertTrue(to.getSeniors() == 2);
        Assert.assertTrue(to.getJuniors() == 1);
    }

}
