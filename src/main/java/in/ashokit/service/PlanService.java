package in.ashokit.service;

import in.ashokit.binding.CitizenChilds;
import in.ashokit.binding.CitizenEducation;
import in.ashokit.binding.CitizenIncome;
import in.ashokit.binding.CitizenPlan;

public interface PlanService {
	
	public String createCitizenPlan(CitizenPlan citizenPlan);
	
	public String createCitizenIncome(CitizenIncome citizenIncome);
	
	public String createCitizenEducation(CitizenEducation citizenEducation);
	
	public String createCitizenChilds(CitizenChilds citizenChilds);

}
