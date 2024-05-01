package com.senai.imobiliaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.imobiliaria.model.Imovel;

public interface ImovelRepository extends JpaRepository<Imovel, Integer> {

}
