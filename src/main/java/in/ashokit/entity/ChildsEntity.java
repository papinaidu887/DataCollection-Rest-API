package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DC_CHILDS")
public class ChildsEntity {

	@Id
	@GeneratedValue
	@Column(name = "CHILD_ID")
	private Integer childId;

	@Column(name = "CHILD_NAME")
	private String childName;

	@Column(name = "CHILD_AGE")
	private String childAge;

	@Column(name = "CHILD_SSN")
	private String childSsn;

	@Column(name = "CASE_NUMBER")
	private Integer caseNumber;

}
