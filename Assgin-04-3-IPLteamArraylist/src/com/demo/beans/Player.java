package com.demo.beans;

public class Player {
	 private int playerid;
	 private String playerName;
	 private String speciality;
	 
	 
	 
	 //constructor
	public Player(int playerid, String playerName, String speciality) {
		super();
		this.playerid = playerid;
		this.playerName = playerName;
		this.speciality = speciality;
	}
	
	//getter and setter is added
	public int getPlayerId() {
        return playerid;
    }

    public void setPlayerId(int playerId) {
        this.playerid = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
	 
	 
	 
}
