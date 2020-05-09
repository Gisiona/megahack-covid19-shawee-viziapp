package br.com.vizi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vizi.entity.Vizer;

@Repository
public interface VizerRepository extends JpaRepository<Vizer, Long> {

}

