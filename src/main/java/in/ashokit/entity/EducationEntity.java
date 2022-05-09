package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DC_EDUCATION")
public class EducationEntity {

	@Id
	@GeneratedValue
	@Column(name = "EDUCATION_ID")
	private Integer educationId;

	@Column(name = "CASE_NUMBER")
	private Integer caseNumber;

	@Column(name = "GRADUATION_STATUS")
	private String graduationStatus;

	@Column(name = "GRADUATION_YEAR")
	private String graduationYear;

	@Column(name = "UNIVERSITY")
	private String university;

	@Column(name = "HIGHEST_DEGREE")
	private String highestDegree;

}
