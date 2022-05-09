package in.ashokit.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Child;
import in.ashokit.binding.CitizenChilds;
import in.ashokit.binding.CitizenEducation;
import in.ashokit.binding.CitizenIncome;
import in.ashokit.binding.CitizenPlan;
import in.ashokit.entity.ChildsEntity;
import in.ashokit.entity.EducationEntity;
import in.ashokit.entity.IncomeEntity;
import in.ashokit.entity.PlanEntity;
import in.ashokit.repository.ChildsRepository;
import in.ashokit.repository.EducationRepository;
import in.ashokit.repository.IncomeRepository;
import in.ashokit.repository.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private PlanRepository planRepository;

	@Autowired
	private IncomeRepository incomeRepository;

	@Autowired
	private EducationRepository educationRepository;

	@Autowired
	private ChildsRepository childsRepository;

	@Override
	public String createCitizenPlan(CitizenPlan citizenPlan) {

		PlanEntity entity = new PlanEntity();
		BeanUtils.copyProperties(citizenPlan, entity);
		planRepository.save(entity);

		return "Plan Details Data Saved Successfully into Database";
	}

	@Override
	public String createCitizenIncome(CitizenIncome citizenIncome) {

		IncomeEntity entity = new IncomeEntity();
		BeanUtils.copyProperties(citizenIncome, entity);
		incomeRepository.save(entity);

		return "Citizen Income Details Data Saved Successfully into Database";
	}

	@Override
	public String createCitizenEducation(CitizenEducation citizenEducation) {

		EducationEntity entity = new EducationEntity();
		BeanUtils.copyProperties(citizenEducation, entity);
		educationRepository.save(entity);

		return "Citizen Education Details Data Saved Successfully Into Database";
	}

	@Override
	public String createCitizenChilds(CitizenChilds citizenChilds) {

		Integer caseNum = citizenChilds.getCaseNumber();

		List<Child> childs = citizenChilds.getChilds();

		for (Child child : childs) {
			ChildsEntity entity = new ChildsEntity();
			BeanUtils.copyProperties(child, entity);
			entity.setCaseNumber(caseNum);
			childsRepository.save(entity);

		}

		return "Childs Data Saved Successfully into Database.....";
	}

}
