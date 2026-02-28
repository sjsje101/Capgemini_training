package com.capg.dao;

import com.capg.entity.player;

public class PlayerDAOImpl implements DAO{
	public void insertPlayer(player p)
	{
		String sql = "INSERT INTO players VALUES(?,?,?)";
		try(Connection conn = DAO.util.getConnection());
				
		{
			
		}
		
	}
}
