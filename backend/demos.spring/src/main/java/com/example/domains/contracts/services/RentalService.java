package com.example.domains.contracts.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.domains.entities.Country;
import com.example.domains.entities.Rental;


public interface RentalService extends ProjectionDomainService<Rental, Integer> {

	void delete(Rental item);

}