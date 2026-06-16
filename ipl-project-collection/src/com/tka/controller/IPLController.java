package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IPLService;

public class IPLController {

	public static void main(String[] args) {
		
		IPLService iplservice= new IPLService();
		
		
//		List<Player> allPlayer = iplservice.getAllPlayer();
//		allPlayer.forEach(p -> System.out.println(p.getP_name()+" "+p.getTeam()));
		
		List<Player> gtPlayers = iplservice.getPlayerByTeam("GT");
		gtPlayers.forEach(p -> System.out.println(p.getP_name()+" "+p.getTeam()));
	}
	
}
