package com.data.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.data.jpa.entity.Player;

public interface PlayerRepositroy extends CrudRepository<Player, Integer> {

}
