package com.cts.quote.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cts.quote.feign.AuthClient;
import com.cts.quote.model.QuotesMaster;
import com.cts.quote.repo.QuotesMasterRepository;
import com.cts.quote.request.QuoteRequest;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class QuotesController {

	@Autowired
	private QuotesMasterRepository quotesMasterRepository;

	@Autowired
	private AuthClient auth;
	@GetMapping("/getQuotesForPolicy")
	public Long getQuotesForPolicy(String token,
			@RequestParam long businessValue,@RequestParam long propertyValue,
			@RequestParam String propertyType,
			@RequestParam long policyId) {
		log.info("Start");
		log.info(token);
		long quotation = 0;
		
		if (auth.validate(token)) {
			if (businessValue >= 0 && businessValue <= 2 && propertyValue >= 0 && propertyValue <= 2
					&& propertyType.equals("Equipment")) {
				quotation = (long) 85000;
			} else if (businessValue >= 3 && businessValue <= 5 && propertyValue >= 2 && propertyValue <= 5
					&& propertyType.equals("Equipment")) {
				quotation = (long) 50000;
			} else if (businessValue >= 8 && businessValue <= 10 && propertyValue >= 8 && propertyValue <= 10
					&& propertyType.equals("Equipment")) {
				quotation = (long) 90000;
			} else {
				quotation = 30000;
			}
			// log.info(quotation);
			log.debug("Quotes: {}", quotation);
			QuotesMaster quote = new QuotesMaster(businessValue, propertyValue, propertyType, quotation,
					policyId);
			quotesMasterRepository.save(quote);
			log.info("End");
			return quotation;
		} else {
			ResponseEntity.badRequest().body("Invalid token");
		}
		return quotation;

	}

}
