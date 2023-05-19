package com.luizeduardo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizeduardo.dslist.entities.GameList;


public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
