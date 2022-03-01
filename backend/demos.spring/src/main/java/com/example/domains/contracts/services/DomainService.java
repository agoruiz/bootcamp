package com.example.domains.contracts.services;

import java.util.List;

import javax.validation.Valid;

import com.example.exceptions.DuplicateKeyException;
import com.example.exceptions.InvalidDataException;
import com.example.exceptions.NotFoundException;

public interface DomainService<E, K> {
	List<E> getAll();
	E getOne(K id) throws NotFoundException;
	
	E add(@Valid E item) throws DuplicateKeyException, InvalidDataException;
	E change(@Valid E item) throws NotFoundException, InvalidDataException;
	void delete(E item);
	void deleteById(K id);
}
