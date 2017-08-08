public class RoomCapacitorUtils {


    /**
     * Computes required number of seniors and junior for given number of rooms
     *
     * @param numRooms       number of rooms to be cleaned
     * @param seniorCapacity number of rooms a senior can clean
     * @param juniorCapacity number of rooms a junior can clean
     */
    public static void computeRequiredCapacity(int numRooms, int seniorCapacity, int juniorCapacity) {
       /* int intSeniors = numRooms / seniorCapacity; //integer number of seniors
        int residueSeniors = numRooms - seniorCapacity * intSeniors; //how many rooms left with int number of seniors
        int juniors = residueSeniors - juniorCapacity;
        int originalOvercapacityS = 0;
        int originalOvercapacityJ = 0;

        //if we take only seniors how much is original overcapacity for seniors
        originalOvercapacityS = residueSeniors;

        //if we take at least one senior, how much is original overcapacity for juniors
        originalOvercapacityJ = (numRooms - seniorCapacity) / juniorCapacity
        System.out.println();

*/
        int seniors = 1;
        int juniors = 0;
        numRooms = numRooms - seniorCapacity;
        //while we didn't clean all the rooms continue counting number of seniors required
        while (numRooms > 0) {
            if (getCurrentOvercapacity(numRooms, seniorCapacity) > getCurrentOvercapacity(numRooms, juniorCapacity)) {

                if (getJuniorResidueOvercapacity(numRooms, juniorCapacity) >= getJuniorResidueOvercapacity(numRooms + seniorCapacity, juniorCapacity)) {
                    numRooms = numRooms + seniorCapacity;
                    seniors--;
                }
                break;
            }
            numRooms = numRooms - seniorCapacity;
            seniors++;
        }
        while (numRooms > 0) {
            numRooms = numRooms - juniorCapacity;
            juniors++;
        }
        System.out.println("Seniors: " + seniors + "\nJuniors: " + juniors);
        /*
        int residue = 1;
        int x = 0, y = 0;
        numRooms = x * seniorCapacity + y * juniorCapacity;
        while (numRooms % seniorCapacity > 0) {
            numRooms = (numRooms - seniorCapacity);
            seniors++;
        }*/
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
        return Math.abs(overcapacity);
    }

    private static int overcapacity() {
        return 0;
    }
}
