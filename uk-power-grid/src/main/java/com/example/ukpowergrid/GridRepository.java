package com.example.ukpowergrid;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GridRepository extends JpaRepository<GridUsage,String> { // Interface which will handle the database interaction (JPA)
	
	List<GridUsage> findBySettlementDate(String settlementDate); // Database will be queried based on the settlementDate variable, and output will be added to list
	
}