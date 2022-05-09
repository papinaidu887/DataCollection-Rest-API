package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.IncomeEntity;

public interface IncomeRepository extends JpaRepository<IncomeEntity, Serializable> {

}
