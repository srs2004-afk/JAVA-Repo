package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService {
	
	private List<Player> allPlayer ;
	private IPLDao ipldao;
	
	public List<Player> getAllPlayer(){
		ipldao = new IPLDao();
		allPlayer = ipldao.getAllPlayer();
		return allPlayer;
	}
//	Sort by Team 
	public List<Player> getPlayerByTeam(String team){
		List<Player> teamlist = new ArrayList<>();
		allPlayer = this.getAllPlayer();
		for(Player p : allPlayer) {
			if(p.getTeam().equals(team)) {
				teamlist.add(p);
			}
		}
		return teamlist;
	}
	
}
