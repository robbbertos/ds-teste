package br.com.prova.desafio.repository;

import br.com.prova.desafio.model.Patrimonio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DesafioRepository extends JpaRepository<Patrimonio, Integer> {
}