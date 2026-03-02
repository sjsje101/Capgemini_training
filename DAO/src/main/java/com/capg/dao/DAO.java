package com.capg.dao;

import java.util.List;

import com.capg.entity.player;

public interface DAO {
	void insertPlayer(player p);
	
	void updatePlayer(player p);
	
	void deletePlayer(player p);
	
	List<player> getAllPlayers();
	
	
}
