package de.storecast.workforceoptimizer.utils;

import de.storecast.workforceoptimizer.utils.to.RequestObject;
import de.storecast.workforceoptimizer.utils.to.ResponseObject;

public class RoomCapacitor {

    public static ResponseObject[] getOptimalWorkforce(RequestObject to) {
        ResponseObject[] responseArray = new ResponseObject[to.getRooms().length];
        for (int i = 0; i < to.getRooms().length; i++) {
            responseArray[i] = computeRequiredCapacity(to.getRooms()[i], to.getSeniorCapacity(), to.getJuniorCapacity());
        }
        return responseArray;
    }

    /**
     * Computes required number of seniors and junior for given number of rooms
     */
    public static ResponseObject computeRequiredCapacity(int numRooms, int seniorCapacity, int juniorCapacity) {

        int seniors = 1;//number of seniors required. Minimum 1
        int juniors = 0;
        int residue = numRooms - seniorCapacity; //therefore number of rooms already less for 1 senior
        //while we didn't clean all the rooms continue counting number of seniors required
        while (residue > 0) {
            if (getCurrentResideToClean(residue, seniorCapacity) > getCurrentResideToClean(residue, juniorCapacity)) {

                //if number of rooms nearly reached the total capacity,
                //and overcapacity to clean with seniors exceed overcapacity with juniors
                if ((getResidueOvercapacity(residue, juniorCapacity) <= getResidueOvercapacity(residue, seniorCapacity)) && numRooms != (residue + seniorCapacity)) {
                    residue = residue + seniorCapacity;
                    seniors--;
                }
                //if we reached the number of remaining rooms to clean with at least one senior
                else if (numRooms == (residue + seniorCapacity)) {
                    residue = residue - seniorCapacity;
                    seniors++;
                    break;
                }
                break;
            }
            residue = residue - seniorCapacity;  //clean senior capacity rooms
            seniors++;
        }
        //clean the remaining rooms with juniors
        while (residue > 0) {
            residue = residue - juniorCapacity;
            juniors++;
        }
        System.out.println("Seniors: " + seniors + ", Juniors: " + juniors);
        return new ResponseObject(seniors, juniors);
    }

    /**
     * Get absolute value of the number of the rooms to clean
     */
    private static int getCurrentResideToClean(int numOfRooms, int workerCapacity) {
        return Math.abs(numOfRooms - workerCapacity);
    }

    /**
     * get overcapacity for remaining number of rooms per given workforce capacity
     */
    private static int getResidueOvercapacity(int numOfRooms, int workCapacity) {
        int overcapacity = 0;
        while (numOfRooms > 0) {
            numOfRooms = numOfRooms - workCapacity;
            overcapacity = numOfRooms;
        }
        return overcapacity;
    }
}
