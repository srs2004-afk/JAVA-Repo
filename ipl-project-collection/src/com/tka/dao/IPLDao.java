package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {
	
	private List<Player> player = null;
	
	public List<Player> getAllPlayer(){
		player = new ArrayList<>();
		
		player.add(new Player(18, "Virat Kohli", 8661, 4, "RCB"));
		player.add(new Player(9, "Devdutt Padikkal", 1806, 0, "RCB"));
		player.add(new Player(24, "Rajat Patidar", 1111, 0, "RCB"));
		player.add(new Player(21, "Phil Salt", 1056, 0, "RCB"));
		player.add(new Player(16, "Jitesh Sharma", 991, 0, "RCB"));
		player.add(new Player(22, "Tim David", 846, 0, "RCB"));
		player.add(new Player(7, "Krunal Pandya", 1756, 93, "RCB"));
		player.add(new Player(19, "Venkatesh Iyer", 1468, 3, "RCB"));
		player.add(new Player(34, "Bhuvneshwar Kumar", 320, 198, "RCB"));
		player.add(new Player(77, "Romario Shepherd", 185, 10, "RCB"));
		player.add(new Player(96, "Jacob Bethell", 67, 0, "RCB"));
		
		player.add(new Player(31, "Ishan Kishan", 602, 0, "SRH"));
		player.add(new Player(34, "Heinrich Klaasen", 624, 0, "SRH"));
		player.add(new Player(17, "Abhishek Sharma", 563, 43, "SRH"));
		player.add(new Player(46, "Travis Head", 410, 23, "SRH"));
		player.add(new Player(19, "Nitish Kumar Reddy", 302, 21, "SRH"));
		player.add(new Player(13, "Harsh Dubey", 13, 0, "SRH"));
		player.add(new Player(10, "Harshal Patel", 10, 0, "SRH"));
		player.add(new Player(77, "Pat Cummins", 30, 3, "SRH"));
		player.add(new Player(11, "Jaydev Unadkat", 4, 0, "SRH"));
		player.add(new Player(15, "Liam Livingstone", 15, 1, "SRH"));
		player.add(new Player(7, "Eshan Malinga", 7, 0, "SRH"));
		
		player.add(new Player(7, "Shubman Gill", 3790, 0, "GT"));
		player.add(new Player(99, "Sai Sudharsan", 1241, 0, "GT"));
		player.add(new Player(17, "David Miller", 2714, 0, "GT"));
		player.add(new Player(21, "Matthew Wade", 614, 0, "GT"));
		player.add(new Player(45, "Rahul Tewatia", 1105, 32, "GT"));
		player.add(new Player(23, "Wriddhiman Saha", 2798, 0, "GT"));
		player.add(new Player(12, "Kane Williamson", 2101, 0, "GT"));
		player.add(new Player(8, "Abhinav Manohar", 351, 0, "GT"));
		player.add(new Player(14, "Rashid Khan", 659, 139, "GT"));
		player.add(new Player(22, "Mohammed Shami", 83, 133, "GT"));
		player.add(new Player(11, "Noor Ahmad", 45, 19, "GT"));
		
		player.add(new Player(9, "Jos Buttler", 3223, 0, "RR"));
		player.add(new Player(17, "Yashasvi Jaiswal", 1872, 0, "RR"));
		player.add(new Player(21, "Riyan Parag", 1156, 12, "RR"));
		player.add(new Player(23, "Shimron Hetmyer", 1624, 0, "RR"));
		player.add(new Player(11, "Dhruv Jurel", 472, 0, "RR"));
		player.add(new Player(14, "Shubham Dubey", 210, 0, "RR"));
		player.add(new Player(19, "Rovman Powell", 832, 0, "RR"));
		player.add(new Player(33, "R Ashwin", 714, 171, "RR"));
		player.add(new Player(99, "Yuzvendra Chahal", 85, 201, "RR"));
		player.add(new Player(27, "Trent Boult", 120, 109, "RR"));
		player.add(new Player(22, "Avesh Khan", 45, 62, "RR"));
		
		
		return player;
	}
	
}
