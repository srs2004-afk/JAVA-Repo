package com.tka.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService {
	private IPLDao ipldao;
	private List<Player> allPlayer;
	

	public List<Player> getAllPlayers() {
		System.out.println("In Service");
		ipldao =new IPLDao();
		allPlayer = ipldao.getAllPlayers();
		return allPlayer;
	}
	
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
}
