import java.util.HashMap;
import java.util.Map;


public class RoomCapacitorUtils {


    /**
     * Computes required number of seniors and junior for given number of rooms
     *
     * @param numRooms       number of rooms to be cleaned
     * @param seniorCapacity number of rooms a senior can clean
     * @param juniorCapacity number of rooms a junior can clean
     */
    public static void computeRequiredCapacity(int numRooms, int seniorCapacity, int juniorCapacity) {

    }

    private static int getOvercapacity(int numOfRooms, int workerCapacity) {
        return Math.abs(numOfRooms - workerCapacity);
    }

    private static int overcapacity() {
        return 0;
    }
}
