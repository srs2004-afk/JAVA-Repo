package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IPLService;

public class IPLController {
	public static void main(String[] args) {
		IPLService iplService = new IPLService();
		
		List<Player> allPlayers= iplService.getAllPlayers();
		System.out.println(allPlayers);
		allPlayers.forEach(p -> System.out.println(p.getP_name()+"-"+p.getTeam()));
		
//		List<Player> allteamPlayers= iplService.getAllPlayers("MI");
//		allteamPlayers.forEach(p -> System.out.println(p.getP_name()));
		
//		Player p =new Player(10,16,"Rabada",2000,50,"MI");
//		System.out.println(iplService.addPlayer(p));
		
//		Player p = new Player();
//		p.setP_id(10);
//		p.setTeam("CSK");
//		System.out.println(iplService.updatePlayer(p));
		
//		Player p = new Player();
//		p.setP_id(10);
//		System.out.println(iplService.deletePlayer(p));
		
	}
}
