package br.com.vizi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vizi.entity.BinarioEstabelecimento;

@Repository
public interface BinarioRepository extends JpaRepository<BinarioEstabelecimento, Long>{

}
