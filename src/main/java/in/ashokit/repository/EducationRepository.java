package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.EducationEntity;

public interface EducationRepository extends JpaRepository<EducationEntity, Serializable> {

}
