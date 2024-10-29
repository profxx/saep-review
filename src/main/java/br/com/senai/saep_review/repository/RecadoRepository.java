package br.com.senai.saep_review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.saep_review.entity.Recado;

@Repository
public interface RecadoRepository extends JpaRepository<Recado, Long>{

}
