package com.tka.entity;

public class Player {
	private int p_id;
	private int jn;
	private String p_name;
	private int runs;
	private int wickets;
	private String team;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int p_id, int jn, String p_name, int runs, int wickets, String team) {
		super();
		this.p_id = p_id;
		this.jn = jn;
		this.p_name = p_name;
		this.runs = runs;
		this.wickets = wickets;
		this.team = team;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public int getJn() {
		return jn;
	}

	public void setJn(int jn) {
		this.jn = jn;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [p_id=" + p_id + ", jn=" + jn + ", p_name=" + p_name + "]";
	}
	
}
