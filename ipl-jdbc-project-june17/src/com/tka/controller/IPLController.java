package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IPLService;

public class IPLController {

	public static void main(String[] args) {
		
		IPLService iplservice= new IPLService();
		
		
//		List<Player> allPlayer = iplservice.getAllPlayer();
//		allPlayer.forEach(p -> System.out.println(p.getP_name()+"-->"+p.getTeam()));
		
		List<Player> rcbPlayers = iplservice.getPlayerByTeam("RCB");
		rcbPlayers.forEach(p -> System.out.println(p.getP_name()+"-->"+p.getRuns()+"-->"+p.getTeam()));
		
//		List<Player> gtPlayers = iplservice.getPlayerByTeam("GT");
//		gtPlayers.forEach(p -> System.out.println(p.getP_name()+"-->"+p.getTeam()));
		
//		Player p =new Player(10,77, "Romario Shepherd", 185, 10, "RCB");
//		System.out.println(iplservice.addPlayer(p));
		
//		Player p =new Player();
//		p.setP_id(10);
//		System.out.println(iplservice.deletePlayer(p));
		
//		Player p =new Player();
//		p.setTeam("RCB");
//		p.setP_id(1);
//		System.out.println(iplservice.updatePlayer(p));
		
//		Player p =new Player();
//		p.setRuns(10000);
//		p.setP_id(1);
//		System.out.println(iplservice.updateRuns(p));
	}
	
}
