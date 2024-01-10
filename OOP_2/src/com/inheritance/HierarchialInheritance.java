package com.inheritance;

// Hierarchial Inheritance
class Sports{
	private String sportType="Cricket";
	public String getSports() {
		return this.sportType;
	}
}

class Players extends Sports{
	private int numberOfPlayers = 11;
	public int getPlayers() {
		return this.numberOfPlayers;
	}
}

class Team extends Sports{
	private String team = "India";
	public String getTeam() {
		return this.team;
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		Players obj = new Players();
		System.out.println(obj.getSports()+" "+obj.getPlayers());
		
		System.out.println("------");
		
		Team obj1 = new Team();
		System.out.println(obj1.getSports()+" "+obj1.getTeam());

	}

}
