package com.cts.quote.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.quote.model.QuotesMaster;

public interface QuotesMasterRepository extends JpaRepository<QuotesMaster, Long> {

	//QuotesMaster findByBusinessValueAndPropertyValueAndPropertyType(Long businessValue,Long propertyValue,String propertyType);
}
