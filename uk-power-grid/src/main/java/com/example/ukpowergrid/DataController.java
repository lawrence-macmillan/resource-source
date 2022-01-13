package com.example.ukpowergrid;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	  private final GridRepository repository;

	  DataController(GridRepository repository) {
	    this.repository = repository;
	  }
	  
	  @GetMapping("/grid/{settlement_date}") // Specify API 
	  public ResponseEntity<List<GridUsage>> findBySettlementDate(@RequestParam String settlementDate) {
		  
			return new ResponseEntity<List<GridUsage>>(repository.findBySettlementDate(settlementDate), HttpStatus.OK);

		}
	  
}