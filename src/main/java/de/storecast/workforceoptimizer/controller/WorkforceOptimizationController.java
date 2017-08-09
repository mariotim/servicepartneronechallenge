package de.storecast.workforceoptimizer.controller;

import de.storecast.workforceoptimizer.utils.RoomCapacitor;
import de.storecast.workforceoptimizer.utils.to.RequestObject;
import de.storecast.workforceoptimizer.utils.to.ResponseObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workforce")
public class WorkforceOptimizationController {

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<ResponseObject[]> computeWorkforce(@RequestBody RequestObject input) {
        return new ResponseEntity<>(RoomCapacitor.getOptimalWorkforce(input), HttpStatus.OK);
    }
}
