package com.example.application.resources;


import java.util.List;


import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.domains.contracts.services.FilmService;
import com.example.domains.entities.Category;
import com.example.domains.entities.Film;
import com.example.exceptions.InvalidDataException;
import com.example.exceptions.NotFoundException;

import org.springframework.http.HttpStatus;

@RestController
//@RequestMapping("/api/categorias")
public class FilmResource {
	@Autowired
	private FilmService srv;

	@GetMapping(path = "/api/list")
	public List<Film> getAll() {
		return srv.getAll();
	}

	@GetMapping(path = "/api/film/{id}")
	public Film getOne(@PathVariable int id) throws NotFoundException {
		return srv.getOne(id);
	}
	
//	@PostMapping(path = "/api/categorias")
//	public ResponseEntity<Object> create(@Valid @RequestBody Film item) throws InvalidDataException, DuplicateKeyException {
//		if(item.)
//			throw new InvalidDataException(item.getErrorsMessage());
//		item = srv.add(item);
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//			.buildAndExpand(item.getCategoryId()).toUri();
//		return ResponseEntity.created(location).build();
//
//	}

	@PutMapping(path = "/api/film/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void update(@PathVariable int id, @Valid @RequestBody Category item) throws InvalidDataException, NotFoundException {
		if(id != item.getCategoryId())
			throw new InvalidDataException("No coinciden los identificadore");
		if(item.isInvalid())
			throw new InvalidDataException(item.getErrorsMessage());
	//	srv.change(item);
	}

	@DeleteMapping(path = "/api/categorias/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		srv.deleteById(id);
	}
}