package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.CitizenIncome;
import in.ashokit.service.PlanService;

@RestController
public class IncomeRestController {
	
	@Autowired
	private PlanService planService;
	
	@PostMapping("/income")
	public ResponseEntity<String> toCreateIncomeDetails(CitizenIncome citizenIncome)
	{
		String plansdata = planService.createCitizenIncome(citizenIncome);
		return new ResponseEntity<>(plansdata,HttpStatus.OK);
	}

}
