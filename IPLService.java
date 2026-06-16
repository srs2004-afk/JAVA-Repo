package com.tka.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService {
	private IPLDao ipldao;
	private List<Player> allPlayer;
	
//	Get All Players
	public List<Player> getAllPlayers() {
		System.out.println("In Service");
		ipldao =new IPLDao();
		allPlayer = ipldao.getAllPlayers();
		return allPlayer;
	}
	
//	Sort Player By Team
	public List<Player> getAllPlayers(String team) {
		List<Player> small = new ArrayList<>();
		allPlayer = this.getAllPlayers();
		for(Player p : allPlayer) {
			if(p.getTeam().equals(team)) {
				small.add(p);
			}
		}
		return small;
	}
	
//	INSERT Player
	public String addPlayer(Player p) {
		try {
			ipldao =new IPLDao();
			int row = ipldao.insertPlayer(p);
			if(row > 0) {
				return "Player Inserted Succefully";
			}else {
				return "Faild to Insert";
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return "Error"+ e.getMessage();
		}
	}
	
//	UPDATE Player
	public String updatePlayer(Player p) {
		ipldao =new IPLDao();
		int up = ipldao.updatePlayer(p);
		if(up > 0) {
			return "Updated Player Team Successfully";
		}else {
			return "Faild to Update";
		}
	}
	
//	DELETE Player
	public String deletePlayer(Player p) {
		ipldao =new IPLDao();
		int dp = ipldao.deletePlayer(p);
		if(dp > 0) {
			return "Deleted Player Successfully";
		}else {
			return "Faild to Delete";
		}
	}
}
