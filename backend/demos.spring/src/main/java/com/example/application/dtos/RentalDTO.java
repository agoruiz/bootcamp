package com.example.application.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.example.domains.entities.Country;
import com.example.domains.entities.Rental;

@Data @AllArgsConstructor @NoArgsConstructor
public class RentalDTO {
	@JsonProperty("id")
	private int RentalId;
	@JsonProperty("peli")
	private String Pelicula;
	
	public static Rental from(RentalDTO source) {
		return new Rental(source.getRentalId(), source.getRental());
	}
	
	private @NotBlank @Length(max = 50) String getRental() {
		// TODO Auto-generated method stub
		return null;
	}

	public static RentalDTO from(Country source) {
		return new RentalDTO(source.getCountryId(), source.getCountry());
		
	}
}
