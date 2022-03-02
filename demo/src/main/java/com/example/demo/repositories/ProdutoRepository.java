package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
}
