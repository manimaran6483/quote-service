package com.cts.quote.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="Quotes_Master")
public class QuotesMaster {

	public Long getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}
	@Override
	public String toString() {
		return "QuotesMaster [id=" + id + ", businessValue=" + businessValue + ", propertyValue=" + propertyValue
				+ ", propertyType=" + propertyType + ", quotes=" + quotes + ", policyId=" + policyId + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ID")
	private Long id;
	
	@NotNull
	@Column(name = "Business_Value")
	private Long businessValue;
	
	@NotNull
	@Column(name = "Property_Value")
	private Long propertyValue;
	
	@NotBlank
	@Size(max = 50)
	@Column(name = "Property_Type")
	private String propertyType;
	
	@NotNull
	@Size(max = 50)
	@Column(name = "Quotes")
	private Long quotes;
	
	@NotNull
	@Size(max=10)
	@Column(name="Policy_Id")
	private Long policyId;
	public QuotesMaster() {
		
	}

	public QuotesMaster(Long businessValue2, Long propertyValue2, String propertyType2, Long quotation,
			Long policyId2) {
		// TODO Auto-generated constructor stub
		this.policyId=policyId2;
		this.businessValue = businessValue2;
		this.propertyValue = propertyValue2;
		this.propertyType = propertyType2;
		this.quotes = quotation;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBusinessValue() {
		return businessValue;
	}
	public void setBusinessValue(Long businessValue) {
		this.businessValue = businessValue;
	}
	public Long getPropertyValue() {
		return propertyValue;
	}
	public void setPropertyValue(Long propertyValue) {
		this.propertyValue = propertyValue;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public Long getQuotes() {
		return quotes;
	}
	public void setQuotes(Long quotes) {
		this.quotes = quotes;
	}

}
