package com.example.application.dtos;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import com.example.domains.entities.Customer;
import com.example.domains.entities.Payment;
import com.example.domains.entities.Rental;
import com.example.domains.entities.Staff;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class PaymentDetailsDTO {
	
	@JsonProperty("id")
	private int paymentlId;
	@JsonProperty("Empleado")
	private String empleado;
	@JsonProperty("total")
	private BigDecimal amount;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date fecha;
	
	public static PaymentDetailsDTO from(Payment source) {
		return new PaymentDetailsDTO(
				source.getPaymentId(),
				source.getStaff().getFirstName() + " " + source.getStaff().getLastName(),
				source.getAmount(),
				source.getPaymentDate()
				);
	}

}


