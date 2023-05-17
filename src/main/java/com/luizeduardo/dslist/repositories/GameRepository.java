package com.luizeduardo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizeduardo.dslist.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long>{
    
}
