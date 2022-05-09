package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.CitizenChilds;
import in.ashokit.service.PlanService;

@RestController
public class ChildsRestController {

	@Autowired
	private PlanService service;

	
	@PostMapping("/childs")
	public ResponseEntity<String> toCreateChildsData(@RequestBody CitizenChilds citizenChilds) {
		String childsData = service.createCitizenChilds(citizenChilds);
		return new ResponseEntity<>(childsData, HttpStatus.OK);

	}

}
