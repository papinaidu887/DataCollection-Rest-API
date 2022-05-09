package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.CitizenPlan;
import in.ashokit.service.PlanService;

@RestController
public class PlanSelectionRestController {

	@Autowired
	private PlanService planService;

	@PostMapping("/plans")
	public ResponseEntity<String> toCreatePlansData(@RequestBody CitizenPlan citizenPlan) {
		String plansData = planService.createCitizenPlan(citizenPlan);
		return new ResponseEntity<>(plansData, HttpStatus.OK);
	}

}
