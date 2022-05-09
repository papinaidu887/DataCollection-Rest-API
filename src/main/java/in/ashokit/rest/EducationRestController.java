package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.CitizenEducation;
import in.ashokit.service.PlanService;

@RestController
public class EducationRestController {

	@Autowired
	private PlanService planService;

	@PostMapping("/education")
	public ResponseEntity<String> toCreateEducationData(@RequestBody CitizenEducation citizenEducation) {
		String educationData = planService.createCitizenEducation(citizenEducation);

		return new ResponseEntity<>(educationData, HttpStatus.OK);
	}

}
