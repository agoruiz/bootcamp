package com.example.domains.contracts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domains.entities.Category;
import com.example.domains.entities.Film;

public interface FilmRepository extends JpaRepository<Film, Integer> {

}
