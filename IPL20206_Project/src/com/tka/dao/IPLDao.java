package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {
	private String path = "com.mysql.cj.jdbc.Driver";
	private String url = "Jdbc:mysql://localhost:3306/ipl";
	private String user = "root";
	private String pass = "root";
	
	private String quary ="SELECT * FROM player_table";
	private String insert ="INSERT INTO player_table VALUES(?,?,?,?,?,?)";
	
	private Connection conn = null ;
	private PreparedStatement pst = null;
	private ResultSet rs= null;
	
	List<Player> allPlayer = null;
	
	public List<Player>getAllPlayers(){
		System.out.println("in dao");
		
		
		try {
			Class.forName(path);
			
			conn = DriverManager.getConnection(url, user, pass);
			
			pst = conn.prepareStatement(quary);
			
			rs = pst.executeQuery();
			allPlayer = new ArrayList<>();
			while(rs.next()) {
				Player p = new Player();
				p.setP_id(rs.getInt(1));
				p.setJn(rs.getInt(2));
				p.setP_name(rs.getString(3));
				p.setRuns(rs.getInt(4));
				p.setWickets(rs.getInt(5));
				p.setTeam(rs.getString(6));
				allPlayer.add(p);
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allPlayer;
	}
	
	public int insertPlayer(Player p) throws SQLException{ 
		
		try {
			Class.forName(path);
			
			conn = DriverManager.getConnection(url, user, pass);
			
			pst = conn.prepareStatement(insert);
			pst.setInt(1, p.getP_id());
			pst.setInt(2, p.getJn());
			pst.setString(3, p.getP_name());
			pst.setInt(4, p.getRuns());
			pst.setInt(5, p.getWickets());
			pst.setString(6, p.getTeam());
			return pst.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
