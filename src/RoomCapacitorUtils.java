public class RoomCapacitorUtils {


    /**
     * Computes required number of seniors and junior for given number of rooms
     *
     * @param numRooms       number of rooms to be cleaned
     * @param seniorCapacity number of rooms a senior can clean
     * @param juniorCapacity number of rooms a junior can clean
     */
    public static void computeRequiredCapacity(int numRooms, int seniorCapacity, int juniorCapacity) {

        int seniors = 1;//minimum 1 senior
        int juniors = 0;
        int residue = numRooms - seniorCapacity; //therefore number of rooms already less for 1 senior
        //while we didn't clean all the rooms continue counting number of seniors required
        while (residue > 0) {
            if (getCurrentOvercapacity(residue, seniorCapacity) > getCurrentOvercapacity(residue, juniorCapacity)) {

                if ((getJuniorResidueOvercapacity(residue, juniorCapacity) <= getJuniorResidueOvercapacity(residue, seniorCapacity)) && numRooms != (residue + seniorCapacity)) {
                    residue = residue + seniorCapacity;
                    seniors--;
                } else if (numRooms == (residue + seniorCapacity)) {
                    residue = residue - seniorCapacity;
                    seniors++;
                    break;
                }
                break;
            }
            residue = residue - seniorCapacity;
            seniors++;
        }
        while (residue > 0) {
            residue = residue - juniorCapacity;
            juniors++;
        }
        System.out.println("Seniors: " + seniors + "\nJuniors: " + juniors);
    }

    private static int getCurrentOvercapacity(int numOfRooms, int workerCapacity) {
        return Math.abs(numOfRooms - workerCapacity);
    }

    private static int getJuniorResidueOvercapacity(int numOfRooms, int workCapacity) {
        int overcapacity = 0;
        while (numOfRooms > 0) {
            numOfRooms = numOfRooms - workCapacity;
            overcapacity = numOfRooms;
        }
        return overcapacity;
    }

    private static int overcapacity() {
        return 0;
    }
}
